package pl.com.ugeon.flyweightgrapic.forest;

import pl.com.ugeon.flyweightgrapic.tree.Tree;
import pl.com.ugeon.flyweightgrapic.tree.TreeFactory;
import pl.com.ugeon.flyweightgrapic.tree.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}