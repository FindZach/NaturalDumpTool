package org.findzach.reader.def.impl;

import java.util.HashMap;
import java.util.List;

/**
 * @author Zach S <zach@findzach.com>
 * @date 12/11/2020
 */
public class ItemDefinition {

    private int id;
    private String name;
    private boolean incomplete;
    private boolean members;
    private boolean tradeable;
    private boolean tradeable_on_ge;
    private boolean stackable;
    private int linked_id_item;
    private int linked_id_noted;
    private int linked_id_placeholder;
    private boolean placeholder;
    private boolean equipable;
    private boolean equipable_by_player;
    private boolean equipable_weapon;
    private int cost;
    private int lowalch;
    private int highalch;
    private int weight;
    private int buy_limit;
    private boolean quest_item;
    private String release_date;
    private boolean duplicate;
    private Equipment equipment;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id + 30_000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIncomplete() {
        return incomplete;
    }

    public void setIncomplete(boolean incomplete) {
        this.incomplete = incomplete;
    }

    public boolean isMembers() {
        return members;
    }

    public void setMembers(boolean members) {
        this.members = members;
    }

    public boolean isTradeable() {
        return tradeable;
    }

    public void setTradeable(boolean tradeable) {
        this.tradeable = tradeable;
    }

    public boolean isTradeable_on_ge() {
        return tradeable_on_ge;
    }

    public void setTradeable_on_ge(boolean tradeable_on_ge) {
        this.tradeable_on_ge = tradeable_on_ge;
    }

    public boolean isStackable() {
        return stackable;
    }

    public void setStackable(boolean stackable) {
        this.stackable = stackable;
    }

    public int getLinked_id_item() {
        return linked_id_item;
    }

    public void setLinked_id_item(int linked_id_item) {
        this.linked_id_item = linked_id_item;
    }

    public int getLinked_id_noted() {
        return linked_id_noted;
    }

    public void setLinked_id_noted(int linked_id_noted) {
        this.linked_id_noted = linked_id_noted;
    }

    public int getLinked_id_placeholder() {
        return linked_id_placeholder;
    }

    public void setLinked_id_placeholder(int linked_id_placeholder) {
        this.linked_id_placeholder = linked_id_placeholder;
    }

    public boolean isPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(boolean placeholder) {
        this.placeholder = placeholder;
    }

    public boolean isEquipable() {
        return equipable;
    }

    public void setEquipable(boolean equipable) {
        this.equipable = equipable;
    }

    public boolean isEquipable_by_player() {
        return equipable_by_player;
    }

    public void setEquipable_by_player(boolean equipable_by_player) {
        this.equipable_by_player = equipable_by_player;
    }

    public boolean isEquipable_weapon() {
        return equipable_weapon;
    }

    public void setEquipable_weapon(boolean equipable_weapon) {
        this.equipable_weapon = equipable_weapon;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getLowalch() {
        return lowalch;
    }

    public void setLowalch(int lowalch) {
        this.lowalch = lowalch;
    }

    public int getHighalch() {
        return highalch;
    }

    public void setHighalch(int highalch) {
        this.highalch = highalch;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBuy_limit() {
        return buy_limit;
    }

    public void setBuy_limit(int buy_limit) {
        this.buy_limit = buy_limit;
    }

    public boolean isQuest_item() {
        return quest_item;
    }

    public void setQuest_item(boolean quest_item) {
        this.quest_item = quest_item;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public boolean isDuplicate() {
        return duplicate;
    }

    public void setDuplicate(boolean duplicate) {
        this.duplicate = duplicate;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}
