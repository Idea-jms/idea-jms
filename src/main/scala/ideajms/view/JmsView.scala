package ideajms.view

import java.awt.BorderLayout
import java.awt.BorderLayout.{CENTER, NORTH}

import com.intellij.openapi.ui.SimpleToolWindowPanel
import com.intellij.ui.treeStructure.Tree
import ideajms.toolwindow.TopPanel

class JmsView extends SimpleToolWindowPanel(true, true) {
  setLayout(new BorderLayout)
  add(new TopPanel, NORTH)
  add(new Tree, CENTER)
}
