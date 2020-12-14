package org.findzach.reader.def.impl;

import org.findzach.reader.def.NPCDrop;

import java.util.List;

/**
 * @author Zach S <zach@findzach.com>
 * @date 12/11/2020
 */
public class NPCDropDefinition {

    private int id;
    private String name;
    private List<NPCDrop> drops;

    public List<NPCDrop> getDrops() {
        return drops;
    }

    public void setDrops(List<NPCDrop> drops) {
        this.drops = drops;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
