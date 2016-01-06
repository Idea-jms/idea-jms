package ideajms.model

import com.intellij.openapi.components.{StoragePathMacros, Storage, State, PersistentStateComponent}
import com.intellij.util.xmlb.annotations.Property

@State(
  name = "JmsModelState",
  storages = Array(
    new Storage(id = "default", file = StoragePathMacros.APP_CONFIG + "/jmsConfig.xml")
  )
)
class JmsModelState extends PersistentStateComponent[List[JmsBroker]] {

  @Property var brokers: List[JmsBroker] = List()

  override def loadState(brokers: List[JmsBroker]): Unit = {
    this.brokers = brokers
  }

  override def getState: List[JmsBroker] = {
    brokers
  }
}
