/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.MarketModel;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */

public class ChannelCatalog {

    private ArrayList<Channel> channelList;

    public ChannelCatalog() {
        channelList = new ArrayList<>();
    }

    public ArrayList<Channel> getChannelList() {
        return channelList;
    }

    public Channel addChannel(String type) {
        Channel ch = new Channel(type);
        channelList.add(ch);
        return ch;
    }

    public void removeChannel(Channel ch) {
        channelList.remove(ch);
    }

    public Channel findChannelByType(String type) {
        if (type == null) return null;

        for (Channel c : channelList) {
            if (c != null && c.getType() != null &&
                c.getType().equalsIgnoreCase(type)) {
                return c;
            }
        }
        return null;
    }
}

