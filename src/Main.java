  public class Main {
            public static void main(String[] args) {
                Boss boss = new Boss();
                boss.setHealth(800);
                boss.setDamage(50);
                boss.setDefence("Physical");
                System.out.println("Урон: " + boss.getDamage() + "\nЗдоровье: " + boss.getHealth() + "\nТип защиты: " + boss.getDefence());
                createHeroes();

                for (int i = 0; i < createHeroes().length; i++) {
                    System.out.println("Суперспособность: " + createHeroes()[i].getSuperPower());
                    System.out.println("Урон: " + createHeroes()[i].getDamage());
                    System.out.println("Здоровье: " + createHeroes()[i].getHealth());

                }
            }

            public static Hero[] createHeroes() {
                Hero ironMan = new Hero(2000, 100, "Суперкстюм");
                Hero loveMan = new Hero(700, 50, "Очаровывает любовью");
                Hero telepathic = new Hero(1000, 70, "Может телепортироваться");
                Hero allHeroes[] = new Hero[]{ironMan, loveMan, telepathic};
                return allHeroes;
            }
        }
