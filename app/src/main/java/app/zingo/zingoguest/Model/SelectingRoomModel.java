package app.zingo.zingoguest.Model;

import java.io.Serializable;

/**
 * Created by ZingoHotels Tech on 21-09-2018.
 */

public class SelectingRoomModel implements Serializable {

    private RoomResponse rooms;
    private String selectingRoom;
    public boolean isSelected;

    public SelectingRoomModel(String selectingRoom, RoomResponse rooms)
    {
        this.selectingRoom = selectingRoom;
        this.rooms = rooms;
        //this.isSelected = isSelected;
    }

    public SelectingRoomModel() {}

    public RoomResponse getRooms() {
        return rooms;
    }

    public void setRooms(RoomResponse rooms) {
        this.rooms = rooms;
    }

    public void setIsSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean getIsSelected()
    {
        return isSelected;
    }
    public void setSelectingRoom(String selectingRoom) {
        selectingRoom = selectingRoom;
    }


    public String getSelectingRoom() {
        return selectingRoom;
    }
}
