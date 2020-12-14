package org.findzach.reader.def.impl;

import org.findzach.reader.def.NPCDrop;

import java.util.List;

/**
 * @author Zach S <zach@findzach.com>
 * @date 12/11/2020
 */
public class NPCDefinition {

    private int id;
    private String name;
    private boolean incomplete;
    private boolean members;
    private String release_date;
    private int combat_level;
    private int size;
    private int hitpoints;
    private int max_hit;
    private List<String> attack_type;
    private int attack_speed;
    private boolean aggressive;
    private boolean immune_poison;
    private boolean immune_venom;
    private List<String> attributes;
    private List<String> category;
    private boolean slayer_monster;
    private int slayer_level;
    private int slayer_xp;
    private List<String> slayer_masters;
    private boolean duplicate;
    private String examine;
    private String wiki_name;
    private String wiki_url;

    private int attack_level;
    private int strength_level;
    private int magic_level;
    private int ranged_level;
    private int attack_stab;
    private int attack_crush;
    private int attack_magic;
    private int attack_ranged;
    private int defence_stab;
    private int defence_clash;
    private int defence_crush;
    private int defence_magic;
    private int defence_ranged;
    private int attack_accuracy;
    private int melee_strength;
    private int ranged_strength;
    private int magic_damage;
    private List<NPCDrop> drops;

    public boolean isImmune_poison() {
        return immune_poison;
    }

    public void setImmune_poison(boolean immune_poison) {
        this.immune_poison = immune_poison;
    }

    public boolean isImmune_venom() {
        return immune_venom;
    }

    public void setImmune_venom(boolean immune_venom) {
        this.immune_venom = immune_venom;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public boolean isSlayer_monster() {
        return slayer_monster;
    }

    public void setSlayer_monster(boolean slayer_monster) {
        this.slayer_monster = slayer_monster;
    }

    public int getSlayer_level() {
        return slayer_level;
    }

    public void setSlayer_level(int slayer_level) {
        this.slayer_level = slayer_level;
    }

    public int getSlayer_xp() {
        return slayer_xp;
    }

    public void setSlayer_xp(int slayer_xp) {
        this.slayer_xp = slayer_xp;
    }

    public List<String> getSlayer_masters() {
        return slayer_masters;
    }

    public void setSlayer_masters(List<String> slayer_masters) {
        this.slayer_masters = slayer_masters;
    }

    public boolean isDuplicate() {
        return duplicate;
    }

    public void setDuplicate(boolean duplicate) {
        this.duplicate = duplicate;
    }

    public String getExamine() {
        return examine;
    }

    public void setExamine(String examine) {
        this.examine = examine;
    }

    public String getWiki_name() {
        return wiki_name;
    }

    public void setWiki_name(String wiki_name) {
        this.wiki_name = wiki_name;
    }

    public String getWiki_url() {
        return wiki_url;
    }

    public void setWiki_url(String wiki_url) {
        this.wiki_url = wiki_url;
    }

    public int getAttack_level() {
        return attack_level;
    }

    public void setAttack_level(int attack_level) {
        this.attack_level = attack_level;
    }

    public int getStrength_level() {
        return strength_level;
    }

    public void setStrength_level(int strength_level) {
        this.strength_level = strength_level;
    }

    public int getMagic_level() {
        return magic_level;
    }

    public void setMagic_level(int magic_level) {
        this.magic_level = magic_level;
    }

    public int getRanged_level() {
        return ranged_level;
    }

    public void setRanged_level(int ranged_level) {
        this.ranged_level = ranged_level;
    }

    public int getAttack_stab() {
        return attack_stab;
    }

    public void setAttack_stab(int attack_stab) {
        this.attack_stab = attack_stab;
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

    public int getDefence_clash() {
        return defence_clash;
    }

    public void setDefence_clash(int defence_clash) {
        this.defence_clash = defence_clash;
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

    public int getAttack_accuracy() {
        return attack_accuracy;
    }

    public void setAttack_accuracy(int attack_accuracy) {
        this.attack_accuracy = attack_accuracy;
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

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public int getCombat_level() {
        return combat_level;
    }

    public void setCombat_level(int combat_level) {
        this.combat_level = combat_level;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getMax_hit() {
        return max_hit;
    }

    public void setMax_hit(int max_hit) {
        this.max_hit = max_hit;
    }

    public List<String> getAttack_type() {
        return attack_type;
    }

    public void setAttack_type(List<String> attack_type) {
        this.attack_type = attack_type;
    }

    public int getAttack_speed() {
        return attack_speed;
    }

    public void setAttack_speed(int attack_speed) {
        this.attack_speed = attack_speed;
    }

    public boolean isAggressive() {
        return aggressive;
    }

    public void setAggressive(boolean aggressive) {
        this.aggressive = aggressive;
    }

    @Override
    public String toString() {
        return "[NpcDefinition] "+name + ", id: " + id + " max hit: " + max_hit + " attack type; " + attack_type.get(0);
    }
}
