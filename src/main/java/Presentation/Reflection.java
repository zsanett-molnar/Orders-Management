package Presentation;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.lang.reflect.Field;
import java.util.List;

/**
 * În această clasă implementează formatul de tabel a bazei de date, atunci când se vizualizează datele în GUI. Are o metodă foarte importantă
 */


public class Reflection {


    public static <T> void getRows(List<T> list) {

        DefaultTableModel model = new DefaultTableModel();

        int i=0;
        Boolean firstIteration = true;

        for(Object object:list) {

            String data[]=new String[100];

            for(Field field:object.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Object value;
                try {
                    value=field.get(object);
                    if(firstIteration==true)
                        model.addColumn(field.getName());
                    data[i]=value.toString();
                    i++;


                }
                catch(IllegalArgumentException e) {
                    e.printStackTrace();
                }
                catch(IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            model.addRow(data);
            i=0;
            firstIteration=false;
        }

        JTable j = new JTable(model);
        JScrollPane sp = new JScrollPane(j);

        JDialog d = new JDialog();
        d.add(sp);
        d.setSize(600,400);
        d.setVisible(true);
    }

}
