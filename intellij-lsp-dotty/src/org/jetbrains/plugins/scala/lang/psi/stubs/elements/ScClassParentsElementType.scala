package org.jetbrains.plugins.scala.lang.psi.stubs.elements

import com.intellij.lang.ASTNode
import org.jetbrains.plugins.scala.lang.psi.api.toplevel.templates.ScClassParents
import org.jetbrains.plugins.scala.lang.psi.impl.toplevel.templates.ScClassParentsImpl
import org.jetbrains.plugins.scala.lang.psi.stubs.ScTemplateParentsStub

/**
  * User: Alexander Podkhalyuzin
  * Date: 17.06.2009
  */
class ScClassParentsElementType extends ScTemplateParentsElementType[ScClassParents]("class parents") {
  override def createElement(node: ASTNode): ScClassParents = new ScClassParentsImpl(node)

  override def createPsi(stub: ScTemplateParentsStub[ScClassParents]): ScClassParents = new ScClassParentsImpl(stub)
}