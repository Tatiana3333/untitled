public class MainClass {
    public static void main(String[] args) {

        Competitor[] competitors = {new Human("Иван"), new Human("Tom"), new Cat("Лев"), new Dog("Барбос")};
        Obstacle[] obstacles = {new Cross(400), new Wall(2), new Water(1)};

        Team team = new Team("Друзья", competitors);

        System.out.println("Название Команды");
        System.out.println(team.getTeamName());

        //System.out.println("Прошли все препятствия:");
        //team.showResults();

        // new Course
        Course course = new Course(obstacles);

        System.out.println("Информация:");
        course.doIt(team);

        System.out.println("Результаты:");
        team.showResults();

        System.out.println("Победители:");
        team.showMembersFinishedCourse();
    }
}
