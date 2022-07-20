public class Character {
    
    public String characterName;
    public int health;
    
    public Character(String name){
        characterName = name;
    }
    
    
    
    int hit(){
        int maxDamage = 11;// generates a number between 1 and 10
        int minDamage = 1;
        
        int damage = (int) (Math.random() * (maxDamage - minDamage) + minDamage);
        return damage;
    }
    
    boolean defend(){//generates a 50%
        int 
        
        
    }
    
    
    
}
