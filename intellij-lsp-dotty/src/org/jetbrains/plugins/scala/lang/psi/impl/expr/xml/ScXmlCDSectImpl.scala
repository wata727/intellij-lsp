package org.jetbrains.plugins.scala.lang.psi.impl.expr.xml

import com.intellij.lang.ASTNode
import org.jetbrains.plugins.scala.lang.psi.ScalaPsiElementImpl
import org.jetbrains.plugins.scala.lang.psi.api.expr.xml._

/**
* @author Alexander Podkhalyuzin
* Date: 21.04.2008
*/

class ScXmlCDSectImpl(node: ASTNode) extends ScalaPsiElementImpl (node) with ScXmlCDSect{
  override def toString: String = "CDataSection"
}