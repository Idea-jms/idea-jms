package ideajms.brokerwindow

import javax.swing.{DefaultListModel, JPanel}

import com.intellij.ui.ScrollPaneFactory.createScrollPane
import com.intellij.ui.components.JBList
import com.intellij.util.ui.UIUtil._
import ideajms.drivers.SupportedDrivers.supportedDrivers

class AvailableDriversPanel extends JPanel {
  val model: DefaultListModel[Object] = new DefaultListModel[Object]
  val driversList = new JBList(model)
  add(createScrollPane(driversList, true))
  setBackgroundRecursively(this, SIDE_PANEL_BACKGROUND)

  supportedDrivers().foreach(model.addElement(_))

}
