/*
 * DefinedNode.java - description
 * Created on 01.03.2002, 01:42:33
 * 
 * Copyright (C) 2001, 2002 Jan Arne Petersen
 * Jan Arne Petersen <jpetersen@uni-bonn.de>
 *
 * JRuby - http://jruby.sourceforge.net
 * 
 * This file is part of JRuby
 * 
 * JRuby is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * JRuby is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with JRuby; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * 
 */
package org.jruby.ast;

import org.ablaf.ast.*;
import org.ablaf.common.*;
import org.jruby.*;
import org.jruby.exceptions.*;
import org.jruby.ast.types.*;
import org.jruby.ast.visitor.*;
import org.jruby.runtime.*;
import org.ablaf.ast.visitor.INodeVisitor;

/**
 * a defined statement.
 * @author  jpetersen
 * @version $Revision$
 */
public class DefinedNode extends AbstractNode {
    private INode expressionNode;

    public DefinedNode(ISourcePosition position, INode expressionNode) {
        super(position);

        this.expressionNode = expressionNode;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(INodeVisitor iVisitor) {
        ((NodeVisitor)iVisitor).visitDefinedNode(this);
    }

    /**
     * Gets the expressionNode.
     * @return Returns a INode
     */
    public INode getExpressionNode() {
        return expressionNode;
    }

    /**
     * Sets the expressionNode.
     * @param expressionNode The expressionNode to set
     */
    public void setExpressionNode(INode expressionNode) {
        this.expressionNode = expressionNode;
    }
}
