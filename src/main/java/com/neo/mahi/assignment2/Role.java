package com.neo.mahi.assignment2;


public class Role {

    public Role(){
        System.out.println("constructor of role");
    }

String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                '}';
    }
//public void setName(String name) throws RoleException {
//    if (!"admin".equalsIgnoreCase(name)) {
//        throw new RoleException("Role must be 'admin'");
//    }
//    this.name = name;
}

