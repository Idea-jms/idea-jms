package ideajms.window

import javax.swing.JComponent

import com.intellij.ui.treeStructure.Tree

object JmsTree {
  def getTree: JComponent = {
    new Tree()
  }
}
