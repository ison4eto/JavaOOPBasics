package Preparation.avatar.monuments;

abstract class Monument {
    private String name;

    Monument(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

   void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Monument: "+this.name;
    }
}
