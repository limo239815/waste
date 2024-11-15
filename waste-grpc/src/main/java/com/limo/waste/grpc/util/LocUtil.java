package com.limo.waste.grpc.util;

import com.limo.waste.common.entity.Floor;
import com.limo.waste.common.entity.Loc;
import com.limo.waste.common.entity.Position;
import com.limo.waste.common.entity.PositionTypeEnum;
import com.limo.waste.common.util.PositionUtil;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author limo
 * @Date 2024/11/15 18:08
 * @Description:
 */
public class LocUtil {

    @Resource
    PositionUtil positionUtils;

    public Map<String,Integer> remarkStoragePriorityNew(String storehouseId, String ddTenantId) {
        List<Floor> floorList = new ArrayList<>();
        floorList.add(new Floor().setFloorId("010101"));
        List<Loc> maxYList = new ArrayList<>();/*billService.findLocs(new Loc().setStorehouseId(storehouseId).setDdTenantId(ddTenantId).setOrderBy("-y").setPage(1).setPageSize(1))*/;
        maxYList.add(new Loc().setLocId("01001050S000101"));
        int maxY = CollectionUtils.isEmpty(maxYList)?0:maxYList.get(0).getY();
        TreeMap<String,Integer> locPriority = new TreeMap<>();
        TreeMap<String,Integer> groupLoc;
        for (int f = 1; f <= floorList.size(); f++) {
            for (int i = 1; i <= maxY; i++) {
                boolean leftT = false;
                int priority = 1;
                groupLoc = new TreeMap<>();
                List<Loc> locList = new ArrayList<>();/*billService.findLocs(new Loc().setStorehouseId(storehouseId).setFloor(f).setY(i).setDdTenantId(ddTenantId).setOrderBy("x"))*/;
                locList.add(new Loc().setLocId(""));
                for (Loc loc:locList) {
                    Position position = positionUtils.getPosition(loc.getLocId());
                    if ("0010".equals(position.getEnabled())){
                        groupLoc.put(loc.getLocId(),priority);
                        int priorityDesc = groupLoc.size();
                        for (String key: groupLoc.keySet()) {
                            locPriority.put(key,priorityDesc);
                            priorityDesc--;
                        }
                        groupLoc = new TreeMap<>();
                        priority = 1;
                    }
                    if (PositionTypeEnum.TRANSFER.getCode().equals(loc.getPositionTypeId())){
                        if (leftT){
                            int mid = groupLoc.size()%2==0?groupLoc.size()/2:(groupLoc.size()+1)/2;
                            int midPriority=mid;
                            int x = 1;
                            for (String key:groupLoc.keySet()) {
                                if (x<=mid){
                                    locPriority.put(key, midPriority);
                                    midPriority--;
                                }
                                if (x==mid){
                                    midPriority = 1;
                                }
                                if (x>mid){
                                    locPriority.put(key, midPriority);
                                    midPriority++;
                                }
                                x++;
                            }
                        }else {
                            locPriority.putAll(groupLoc);
                        }
                        groupLoc = new TreeMap<>();
                        leftT = true;
                        priority = 1;
                    }
                    if (PositionTypeEnum.STORAGE.getCode().equals(loc.getPositionTypeId())){
                        if ("0001".equals(position.getEnabled())){
                            leftT = false;
                        }
                        groupLoc.put(loc.getLocId(),priority);
                        priority++;
                    }

                }
            }
        }
        return locPriority;
    }
}
