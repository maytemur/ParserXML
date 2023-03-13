import javax.swing.*;
import javax.swing.table.*;
import java.io.*;

public class JTableTest extends JFrame{
    String[] cc=new String[]{"Colon 1","Colon 2"};
    public JTableTest() {
        /*String [][] oo=new String [] [] {{"a","b"},{"c","d"},{"e","f"}};
        String[] cc=new String[]{"Colon 1","Colon 2"};
        JTable tablo=new JTable(oo,cc);*/  
        TestTableModel model=new TestTableModel("C:\\NetbeansProjects");
        JTable table=new JTable(model);
        getContentPane().add(new JScrollPane(table));
        }
    class TestTableModel extends AbstractTableModel {
        File dosya;
        TestTableModel(String yol){
            dosya=new File(yol);
            }
        public int getColumnCount(){
            return 2;
        }
        public int getRowCount()  {
            File[] files=dosya.listFiles();            
            return files.length;
        }
        public String getColumnName(int column){
        return cc[column];    
        }
        public Object getValueAt(int rowIndex,int columnIndex){
            File[] files=dosya.listFiles();
            File dosya=files[rowIndex];
            if(columnIndex==0){
                return dosya.getName();
                }else{
                    return dosya.length()+" bayt";
                }
        }
    }    
    public static void main(String[] args){
        JTableTest tt=new JTableTest();
        tt.setBounds(0,0,400,400);
        tt.setVisible(true);
    }    
}