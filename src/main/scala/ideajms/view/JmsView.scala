package ideajms.view

import com.intellij.openapi.ui.SimpleToolWindowPanel
import com.intellij.ui.treeStructure.Tree

class JmsView extends SimpleToolWindowPanel(true, true) {

  def initialize: Unit = {
    add(new Tree())
  }

}
