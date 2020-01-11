/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.ast;

import java.util.Iterator;

import net.sourceforge.pmd.annotation.InternalApi;


/**
 * Represents a list of member values in an {@linkplain ASTNormalAnnotation annotation}.
 *
 * <pre>
 *
 *  MemberValuePairs ::= {@linkplain ASTMemberValuePair MemberValuePair} ( "," {@linkplain ASTMemberValuePair MemberValuePair} )*
 *
 * </pre>
 */
public class ASTMemberValuePairs extends AbstractJavaNode implements Iterable<ASTMemberValuePair> {

    @InternalApi
    @Deprecated
    public ASTMemberValuePairs(int id) {
        super(id);
    }


    @Override
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }


    @Override
    public <T> void jjtAccept(SideEffectingVisitor<T> visitor, T data) {
        visitor.visit(this, data);
    }


    @Override
    public ASTMemberValuePair jjtGetChild(int index) {
        return (ASTMemberValuePair) super.jjtGetChild(index);
    }


    @Override
    public ASTNormalAnnotation jjtGetParent() {
        return (ASTNormalAnnotation) super.jjtGetParent();
    }


    @Override
    public Iterator<ASTMemberValuePair> iterator() {
        return children(ASTMemberValuePair.class).iterator();
    }
}
