package com.limo.waste.common.util;

import com.limo.waste.common.entity.Position;
import org.springframework.stereotype.Component;

/**
 * @author
 * @date
 * @description
 */
@Component
public class PositionUtil {
    /**
     * 获取 x y z enabled storehouseId
     * */
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

}
