public class Character {
    
    public String characterName;
    public int health = 100;
    
    public Character(String name){
        characterName = name;
    }
    
    
    
    int hit(){
        int maxDamage = 11;// generates a number between 1 and 10
        int minDamage = 1;
        
        int damage = (int) (Math.random() * (maxDamage - minDamage) + minDamage);
        System.out.println("You hit the enemy for " + damage + " damage!")
        return damage;
    }//hit()
    
    boolean defend(){//generates a 50% chance of defending an attack from an enemy
        int max = 3;
        int min = 1;
        int blockChance = (int) (Math.random() * (max - min) + min);
        boolean block;

        if(blockChance <=1){
            block = false;
            System.out.println("The block failed");
        }
        else{
            block = true;
            System.out.println("You managed to block the attack!")
        }
        return block;
        
    }//defend()
    
    
    
}
