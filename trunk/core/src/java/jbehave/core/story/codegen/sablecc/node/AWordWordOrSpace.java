/* This file was generated by SableCC (http://www.sablecc.org/). */

package jbehave.core.story.codegen.sablecc.node;

import java.util.*;
import jbehave.core.story.codegen.sablecc.analysis.*;

public final class AWordWordOrSpace extends PWordOrSpace
{
    private TWord _word_;

    public AWordWordOrSpace()
    {
    }

    public AWordWordOrSpace(
        TWord _word_)
    {
        setWord(_word_);

    }
    public Object clone()
    {
        return new AWordWordOrSpace(
            (TWord) cloneNode(_word_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWordWordOrSpace(this);
    }

    public TWord getWord()
    {
        return _word_;
    }

    public void setWord(TWord node)
    {
        if(_word_ != null)
        {
            _word_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _word_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_word_);
    }

    void removeChild(Node child)
    {
        if(_word_ == child)
        {
            _word_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_word_ == oldChild)
        {
            setWord((TWord) newChild);
            return;
        }

    }
}
