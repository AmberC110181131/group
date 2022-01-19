package family;
class Dad extends same{
    public void Different() {
        System.out.println("名字：鮑伯"+"\n"+"能力：力量大");
    }
}
class Mom extends same{
    public void Different() {
        System.out.println("名字：荷莉"+"\n"+"能力：改變身體形狀");
    }
}
class Sister extends same{
    public void Different() {
        System.out.println("名字：小倩"+"\n"+"能力：隱形+有防護罩");
    }
}
class Brother extends same{
    public void Different() {
        System.out.println("名字：小飛"+"\n"+"能力：速度很快");
    }
}
class Baby extends same{
    public void Different() {
        System.out.println("名字：小傑"+"\n"+"能力：不確定");
    }
}

public class hero {
    public static void main(String[] args) {
        System.out.println("超人特攻隊人物介紹：");
        Dad HeroDad = new Dad();
        HeroDad.Different();
        HeroDad.HeroCloth();
        System.out.println("------------------");
        Mom HeroMom = new Mom();
        HeroMom.Different();
        HeroMom.HeroCloth();
        System.out.println("------------------");
        Sister HeroSister = new Sister();
        HeroSister.Different();
        HeroSister.HeroCloth();
        System.out.println("------------------");
        Brother HeroBrother = new Brother();
        HeroBrother.Different();
        HeroBrother.HeroCloth();
        System.out.println("------------------");
        Baby HeroBaby = new Baby();
        HeroBaby.Different();
        HeroBaby.HeroCloth();
    }
}
