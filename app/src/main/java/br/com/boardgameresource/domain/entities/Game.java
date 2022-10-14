package br.com.boardgameresource.domain.entities;

public class Game {

    private String name;
    private Resource[] resources;

    public Game(String name, Resource[] resources) {
        this.name = name;
        this.resources = resources;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Resource[] getResources() {
        return resources;
    }

    public void setResources(Resource[] resources) {
        this.resources = resources;
    }
}
