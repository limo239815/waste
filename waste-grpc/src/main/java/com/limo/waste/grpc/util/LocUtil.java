package com.limo.waste.grpc.util;

import com.limo.waste.common.entity.Floor;
import com.limo.waste.common.entity.Loc;
import com.limo.waste.common.entity.Position;
import com.limo.waste.common.entity.PositionTypeEnum;
import com.limo.waste.common.util.PositionUtil;
import org.springframework.util.CollectionUtils;

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



    public Map<String,Integer> remarkStoragePriorityNew(String storehouseId, String ddTenantId,int f) {
        List<Loc> maxYList = new ArrayList<>();//billService.findLocs(new Loc().setStorehouseId(storehouseId).setDdTenantId(ddTenantId).setOrderBy("-y").setPage(1).setPageSize(1));
        maxYList.add(new Loc().setLocId("01001080S001001"));
        int maxY = CollectionUtils.isEmpty(maxYList)?0:maxYList.get(0).getY();
        TreeMap<String,Integer> locPriority = new TreeMap<>();
        TreeMap<String,Integer> groupLoc;
        for (int i = 1; i <= maxY; i++) {
            boolean leftT = false;
            int priority = 1;
            groupLoc = new TreeMap<>();
            List<Loc> locList = new ArrayList<>();//billService.findLocs(new Loc().setStorehouseId(storehouseId).setFloor(f).setY(i).setDdTenantId(ddTenantId).setOrderBy("x"));
            locList.add(new Loc().setLocId("01001001S0001"));
            for (Loc loc:locList) {
                Position position = getPosition(loc.getLocId());
                if ("0010".equals(position.getEnabled())){
                    groupLoc.put(loc.getLocId(),priority);
                    int priorityDesc = groupLoc.size();
                    for (String key: groupLoc.keySet()) {
                        locPriority.put(key,priorityDesc);
                        priorityDesc--;
                    }
                    groupLoc = new TreeMap<>();
                    priority = 1;
                    continue;
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
                            if (x==mid+1){
                                if (groupLoc.size()%2==0){
                                    midPriority = 1;
                                }
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
        return locPriority;
    }
    public Position getPosition(String positionId){
        Position position = new Position();
        position.setFloor(Integer.parseInt(positionId.substring(0,2)));
        position.setX(Integer.parseInt(positionId.substring(2,5)));
        position.setY(Integer.parseInt(positionId.substring(5,8)));
        position.setPositionTypeId(positionId.substring(8,9));
        position.setEnabled(positionId.substring(9,13));
        if (positionId.length()>13){
            position.setStorehouseId(positionId.substring(13,15));
        }
        position.setPositionId(positionId);
        return position;
    }
    public int computedRange(String startPosition, String endPosition) {
        int result = 0;
        Position start = getPosition(startPosition);
        Position end = getPosition(endPosition);
        if (!start.getFloor().equals(end.getFloor())) {
            result = result + 100;
        }
        result = result + Math.abs(end.getX() - start.getX()) + Math.abs(end.getY() - start.getY());
        return result;
    }
}
