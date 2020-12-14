package org.findzach.reader.def.impl;

import java.util.List;

/**
 * @author Zach S <zach@findzach.com>
 * @date 12/13/2020
 */
public class Equipment {

    private int attack_stab;
    private int attack_slash;
    private int attack_crush;
    private int attack_magic;
    private int attack_ranged;
    private int defence_stab;
    private int defence_slash;
    private int defence_crush;
    private int defence_magic;
    private int defence_ranged;
    private int melee_strength;
    private int ranged_strength;
    private int magic_damage;
    private int prayer;
    private String slot;
    List<String> requirements;

    public int getAttack_stab() {
        return attack_stab;
    }

    public void setAttack_stab(int attack_stab) {
        this.attack_stab = attack_stab;
    }

    public int getAttack_slash() {
        return attack_slash;
    }

    public void setAttack_slash(int attack_slash) {
        this.attack_slash = attack_slash;
    }

    public int getAttack_crush() {
        return attack_crush;
    }

    public void setAttack_crush(int attack_crush) {
        this.attack_crush = attack_crush;
    }

    public int getAttack_magic() {
        return attack_magic;
    }

    public void setAttack_magic(int attack_magic) {
        this.attack_magic = attack_magic;
    }

    public int getAttack_ranged() {
        return attack_ranged;
    }

    public void setAttack_ranged(int attack_ranged) {
        this.attack_ranged = attack_ranged;
    }

    public int getDefence_stab() {
        return defence_stab;
    }

    public void setDefence_stab(int defence_stab) {
        this.defence_stab = defence_stab;
    }

    public int getDefence_slash() {
        return defence_slash;
    }

    public void setDefence_slash(int defence_slash) {
        this.defence_slash = defence_slash;
    }

    public int getDefence_crush() {
        return defence_crush;
    }

    public void setDefence_crush(int defence_crush) {
        this.defence_crush = defence_crush;
    }

    public int getDefence_magic() {
        return defence_magic;
    }

    public void setDefence_magic(int defence_magic) {
        this.defence_magic = defence_magic;
    }

    public int getDefence_ranged() {
        return defence_ranged;
    }

    public void setDefence_ranged(int defence_ranged) {
        this.defence_ranged = defence_ranged;
    }

    public int getMelee_strength() {
        return melee_strength;
    }

    public void setMelee_strength(int melee_strength) {
        this.melee_strength = melee_strength;
    }

    public int getRanged_strength() {
        return ranged_strength;
    }

    public void setRanged_strength(int ranged_strength) {
        this.ranged_strength = ranged_strength;
    }

    public int getMagic_damage() {
        return magic_damage;
    }

    public void setMagic_damage(int magic_damage) {
        this.magic_damage = magic_damage;
    }

    public int getPrayer() {
        return prayer;
    }

    public void setPrayer(int prayer) {
        this.prayer = prayer;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public List<String> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<String> requirements) {
        this.requirements = requirements;
    }
}
