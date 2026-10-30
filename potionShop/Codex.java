
public class Codex {
    public static void getEffect(Potions target) {
        target.Effect();        
    }
    public static void main(String[] args) {
        Speed potion1 = new Speed();
        Strength potion2 = new Strength();
        Health potion3 = new Health();
        // potion1.SideEffect();
        // getEffect(potion1);
        potion2.Effect();
        potion3.Ingredient();
        potion3.SideEffect();
    }
}
