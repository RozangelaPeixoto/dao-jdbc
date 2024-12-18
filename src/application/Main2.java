package application;

import model.dao.DaoFactory;
import model.dao.DepartamentDao;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        DepartamentDao DepartmentDao = DaoFactory.createDepartamentDao();
        List<Department> list;

        System.out.println("=== TEST 1: department findById ===");
        Department department = DepartmentDao.findById(3);
        System.out.println(department);


        System.out.println("\n=== TEST 2: department findAll ===");
        list = DepartmentDao.findAll();
        for(Department obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: department insert ===");
        Department newDepartment = new Department(null, "Toys");
        DepartmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());

        System.out.println("\n=== TEST 4: department update ===");
        department = DepartmentDao.findById(7);
        department.setName("Tools");
        DepartmentDao.update(department);
        System.out.println("Update completed!");

        System.out.println("\n=== TEST 5: department delete ===");
        DepartmentDao.deleteById(8);
        System.out.println("Delete Completed!");

    }
}