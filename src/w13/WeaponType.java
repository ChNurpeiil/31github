package w13;

public interface WeaponType {
    String getWeaponType();
    void setWeaponType(String weaponType);
    default void resetWeaponType(){
        System.out.println("Default");
    }
}
interface Damageable{
    int getDurability();
    void setDurability(int durability);
    default void repair(){
        setDurability(100);
    }

}
class Weapon implements WeaponType,Damageable{
    private String weaponType;
    private int durability;

    public Weapon(String weaponType, int durability) {
        this.weaponType = weaponType;
        this.durability = durability;
    }


    @Override
    public String getWeaponType() {
        return weaponType;
    }

    @Override
    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public void resetWeaponType() {
        WeaponType.super.resetWeaponType();
    }

    @Override
    public int getDurability() {
        return (durability >=0 && durability <=100)? durability:100;
    }

    @Override
    public void setDurability(int durability) {
        this.durability = (durability >= 0 && durability <= 100)? durability :100;
    }

    @Override
    public void repair() {
        Damageable.super.repair();
    }

    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword",80);
        System.out.println("Weapon Type: "+ sword.getWeaponType());
        System.out.println("Durability: "+ sword.getWeaponType());
        sword.setWeaponType("Axe");
        sword.setDurability(150);
        System.out.println("Weapon Type: "+sword.getWeaponType());
        System.out.println("Durability: "+sword.getDurability());
        sword.setDurability(-20);
        System.out.println("Weapon Type: "+ sword.getWeaponType());
        System.out.println("Durability: "+ sword.getDurability());
        sword.setDurability(30); // Durability: 30
        System.out.println("Durability: " + sword.getDurability()); // Durability: 30

        sword.resetWeaponType();
        sword.repair();
        System.out.println("Weapon Type: " + sword.getWeaponType()); // Weapon Type: Default
        System.out.println("Durability: " + sword.getDurability()); // Durability: 100
    }
}
