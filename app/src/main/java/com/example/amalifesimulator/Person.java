package com.example.amalifesimulator;

public class Person {
    private String firstName;
    private String lastName;
//    private Integer age;
    private Integer health;
    private Integer money;
    private Integer credits;
    private Integer socialLifePoints;
    private Integer careerPoints;

    public Person (String firstName, String lastName, Integer health, Integer money,
                    Integer credits, Integer socialLifePoints, Integer careerPoints) {
        setFirstName(firstName);
        setLastName(lastName);
        setHealth(health);
        setMoney(money);
        setCredits(credits);
        setSocialLifePoints(socialLifePoints);
        setCareerPoints(careerPoints);
    }

    public String getFirstName () { return firstName; }

    public void setFirstName (String firstName) { this.firstName = firstName; }

    public String getLastName () { return lastName; }

    public void setLastName (String lastName) { this.lastName = lastName; }

    public Integer getHealth () { return health; }

    public void setHealth (Integer health) { this.health = health; }

    public Integer getMoney () { return money; }

    public void setMoney (Integer money) { this.money = money; }

    public Integer getCredits () { return credits; }

    public void setCredits (Integer credits) { this.credits = credits; }

    public Integer getSocialLifePoints () { return socialLifePoints; }

    public void setSocialLifePoints (Integer socialLifePoints) { this.socialLifePoints = socialLifePoints; }

    public Integer getCareerPoints () { return careerPoints; }

    public void setCareerPoints (Integer careerPoints) { this.careerPoints = careerPoints; }
}
