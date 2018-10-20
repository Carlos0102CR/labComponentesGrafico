/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydrawapp;

/**
 *
 * @author David Madrigal
 */
public class MyDrawApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyGraphicForm myForm = new MyGraphicForm();
//        MyStrokeForm myForm = new MyStrokeForm();
//        MyLinesForm myForm = new MyLinesForm();
//        MyPointsForm myForm = new MyPointsForm();
//        MySurfaceForm myForm = new MySurfaceForm();
        myForm.setVisible(true);
    }
    
}
