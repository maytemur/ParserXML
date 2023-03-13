import javax.swing.*;
import javax.swing.tree.*;

public class JTreeTest extends JFrame {
    public JTreeTest() {
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("root");
        DefaultMutableTreeNode alt=new DefaultMutableTreeNode("alt");
        DefaultMutableTreeNode alt11=new DefaultMutableTreeNode("alt11");
        DefaultMutableTreeNode alt2=new DefaultMutableTreeNode("alt2");
        
        DefaultTreeModel model=new DefaultTreeModel(root);
        
        JTree tree=new JTree(model);
        alt.add(alt11);
        root.add(alt);
        root.add(alt2);
        
        
        getContentPane().add(new JScrollPane(tree));
        
        
    }
        public static void main(String[] args){
            JTreeTest tt=new JTreeTest();
            tt.setBounds(0,0,400,400);
            tt.setVisible(true);
            
            }
    
}
