package com.limo.waste.common.util;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Author limo
 * @Date 2024/12/31 11:02
 * @Description:
 */
public class TreeUtil {

    static class MenuVo{
        private String parentId;
        private String nodeId;
        private String nodeName;

        private List<MenuVo> subMenus;

        public String getNodeId() {
            return nodeId;
        }

        public String getParentId() {
            return parentId;
        }

        public String getNodeName() {
            return nodeName;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public void setNodeName(String nodeName) {
            this.nodeName = nodeName;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public List<MenuVo> getSubMenus() {
            return subMenus;
        }

        public void setSubMenus(List<MenuVo> subMenus) {
            this.subMenus = subMenus;
        }

        @Override
        public String toString() {
            return "MenuVo{" +
                    "parentId='" + parentId + '\'' +
                    ", nodeId='" + nodeId + '\'' +
                    ", nodeName='" + nodeName + '\'' +
                    ", subMenus=" + subMenus +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<MenuVo> menuVoList = new ArrayList<>();
        MenuVo menuVo = new MenuVo();
        menuVo.setNodeId("01");
        menuVo.setNodeName("A");
        menuVoList.add(menuVo);
        menuVo = new MenuVo();
        menuVo.setNodeId("02");
        menuVo.setNodeName("B");
        menuVoList.add(menuVo);
        menuVo = new MenuVo();
        menuVo.setNodeId("03");
        menuVo.setNodeName("C");
        menuVoList.add(menuVo);
        menuVo = new MenuVo();
        menuVo.setParentId("01");
        menuVo.setNodeId("001");
        menuVo.setNodeName("AA");
        menuVoList.add(menuVo);
        menuVo = new MenuVo();
        menuVo.setParentId("02");
        menuVo.setNodeId("002");
        menuVo.setNodeName("BB");
        menuVoList.add(menuVo);
        menuVo = new MenuVo();
        menuVo.setParentId("03");
        menuVo.setNodeId("003");
        menuVo.setNodeName("CC");
        menuVoList.add(menuVo);
        menuVo = new MenuVo();
        menuVo.setParentId("02");
        menuVo.setNodeId("004");
        menuVo.setNodeName("BZ");
        menuVoList.add(menuVo);
        List<MenuVo> result = markTree(menuVoList,MenuVo::getParentId,MenuVo::getNodeId, x->x.getParentId()==null,MenuVo::setSubMenus);
        for (MenuVo menu: result) {
            System.out.println(menu.toString());
        }
    }

    /**
     * @param menuList 需要合成树的list
     * @param pIdGetter 对象中获取父级id方法，如 Menu:getParentId
     * @param rootCheck 判断对象是否根节点的方法 如： x->x.getParentId()==null,x->x.getParentMenuId()==0
     * @param setSubChildren 对象中设置下级数据列表方法，如： Menu::setSubMenus
     * */
    public static <T, E> List<E> markTree(List<E> menuList, Function<E, T> pIdGetter, Function<E, T> idGetter, Predicate<E> rootCheck, BiConsumer<E, List<E>> setSubChildren){
        Map<T, List<E>> parentMenuMap = new HashMap<>();
        for (E node: menuList) {
            T parentId = pIdGetter.apply(node);
            //节点放入父节点的value内
            parentMenuMap.computeIfAbsent(parentId, k -> new ArrayList<>()).add(node);
        }
        List<E> result = new ArrayList<>();
        for (E node : menuList) {
            //添加到下级数据中
            setSubChildren.accept(node, parentMenuMap.getOrDefault(idGetter.apply(node), new ArrayList<>()));
            //如果是根节点，加入结构
            if (rootCheck.test(node)){
                result.add(node);
            }
        }
        return result;
    }

    /**
     * 树中查找（只要其子节点列表匹配到即保留）
     * @param tree 需要查找的树
     * @param predicate 过滤条件，根据业务场景自行修改
     * @param getSubChildren 获取下级数据方法 如：MenuVo::getSubMenus
     * */
    public static <E> List<E> search(List<E> tree, Predicate<E> predicate, Function<E, List<E>> getSubChildren){
        List<E> result = new ArrayList<>();

        for(E item : tree){
            List<E> childList = getSubChildren.apply(item);
            List<E> filteredChildren = new ArrayList<>();
            if (childList != null && !childList.isEmpty()){
                filteredChildren = search(childList, predicate, getSubChildren);
            }
            //如果当前节点匹配，或者至少有一个子节点保留，就保留当前节点
            if (predicate.test(item) || !filteredChildren.isEmpty()){
                result.add(item);
                //还原下一级子节点如果有
                if (!filteredChildren.isEmpty()){
                    getSubChildren.apply(item).clear();
                    getSubChildren.apply(item).addAll(filteredChildren);
                }
            }
        }
        return result;
    }

    /**
     * 树中过滤
     * @param tree 需要过滤的树
     * @param predicate 过滤条件判断
     * @param getChildren 获取下级数据方法 如：Menu::getSubMenus
     * @return List<E>
     * */
    public static <E> List<E> filter(List<E> tree, Predicate<E> predicate, Function<E, List<E>> getChildren){
        return tree.stream().filter(item -> {
           if (predicate.test(item)){
               List<E> children = getChildren.apply(item);
               if (children != null && !children.isEmpty()){
                   filter(children, predicate, getChildren);
               }
               return true;
           }
           return false;
        }).collect(Collectors.toList());
    }

    /**
     * 树排序
     * */
    public static <E> List<E> sort(List<E> tree, Comparator<? super E> comparator, Function<E, List<E>> getChildrenn){
        for (E item : tree){
            //获取当前节点得子节点列表
            List<E> childList = getChildrenn.apply(item);
            //如果子节点列表不为空，则递归调用sort方法对其进行排序
            if (childList != null && !childList.isEmpty()){
                sort(childList, comparator, getChildrenn);
            }
        }
        //对当前层级得节点列表进行排序
        //这一步确保了所有直接子节点在递归返回后都已排序，然后对当前列表进行排序
        tree.sort(comparator);
        return tree;
    }



}
