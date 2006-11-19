/* This file was generated by SableCC (http://www.sablecc.org/). */

package jbehave.core.story.codegen.sablecc.analysis;

import jbehave.core.story.codegen.sablecc.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(Node node)
    {
    }

    public void defaultOut(Node node)
    {
    }

    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPStory().apply(this);
        outStart(node);
    }

    public void inAStory(AStory node)
    {
        defaultIn(node);
    }

    public void outAStory(AStory node)
    {
        defaultOut(node);
    }

    public void caseAStory(AStory node)
    {
        inAStory(node);
        {
            Object temp[] = node.getScenario().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PScenario) temp[i]).apply(this);
            }
        }
        if(node.getBenefit() != null)
        {
            node.getBenefit().apply(this);
        }
        if(node.getFeature() != null)
        {
            node.getFeature().apply(this);
        }
        if(node.getRole() != null)
        {
            node.getRole().apply(this);
        }
        if(node.getTitle() != null)
        {
            node.getTitle().apply(this);
        }
        outAStory(node);
    }

    public void inATitle(ATitle node)
    {
        defaultIn(node);
    }

    public void outATitle(ATitle node)
    {
        defaultOut(node);
    }

    public void caseATitle(ATitle node)
    {
        inATitle(node);
        if(node.getEndl() != null)
        {
            node.getEndl().apply(this);
        }
        if(node.getPhrase() != null)
        {
            node.getPhrase().apply(this);
        }
        if(node.getSpace() != null)
        {
            node.getSpace().apply(this);
        }
        if(node.getTitleKeyword() != null)
        {
            node.getTitleKeyword().apply(this);
        }
        outATitle(node);
    }

    public void inARole(ARole node)
    {
        defaultIn(node);
    }

    public void outARole(ARole node)
    {
        defaultOut(node);
    }

    public void caseARole(ARole node)
    {
        inARole(node);
        if(node.getEndl() != null)
        {
            node.getEndl().apply(this);
        }
        if(node.getPhrase() != null)
        {
            node.getPhrase().apply(this);
        }
        if(node.getSpace() != null)
        {
            node.getSpace().apply(this);
        }
        if(node.getAsA() != null)
        {
            node.getAsA().apply(this);
        }
        outARole(node);
    }

    public void inAFeature(AFeature node)
    {
        defaultIn(node);
    }

    public void outAFeature(AFeature node)
    {
        defaultOut(node);
    }

    public void caseAFeature(AFeature node)
    {
        inAFeature(node);
        if(node.getEndl() != null)
        {
            node.getEndl().apply(this);
        }
        if(node.getPhrase() != null)
        {
            node.getPhrase().apply(this);
        }
        if(node.getSpace() != null)
        {
            node.getSpace().apply(this);
        }
        if(node.getIWant() != null)
        {
            node.getIWant().apply(this);
        }
        outAFeature(node);
    }

    public void inABenefit(ABenefit node)
    {
        defaultIn(node);
    }

    public void outABenefit(ABenefit node)
    {
        defaultOut(node);
    }

    public void caseABenefit(ABenefit node)
    {
        inABenefit(node);
        if(node.getEndl() != null)
        {
            node.getEndl().apply(this);
        }
        if(node.getPhrase() != null)
        {
            node.getPhrase().apply(this);
        }
        if(node.getSpace() != null)
        {
            node.getSpace().apply(this);
        }
        if(node.getSoThat() != null)
        {
            node.getSoThat().apply(this);
        }
        outABenefit(node);
    }

    public void inAScenario(AScenario node)
    {
        defaultIn(node);
    }

    public void outAScenario(AScenario node)
    {
        defaultOut(node);
    }

    public void caseAScenario(AScenario node)
    {
        inAScenario(node);
        {
            Object temp[] = node.getOutcome().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((POutcome) temp[i]).apply(this);
            }
        }
        if(node.getEvent() != null)
        {
            node.getEvent().apply(this);
        }
        {
            Object temp[] = node.getContext().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PContext) temp[i]).apply(this);
            }
        }
        if(node.getScenarioTitle() != null)
        {
            node.getScenarioTitle().apply(this);
        }
        outAScenario(node);
    }

    public void inAScenarioTitle(AScenarioTitle node)
    {
        defaultIn(node);
    }

    public void outAScenarioTitle(AScenarioTitle node)
    {
        defaultOut(node);
    }

    public void caseAScenarioTitle(AScenarioTitle node)
    {
        inAScenarioTitle(node);
        if(node.getEndl() != null)
        {
            node.getEndl().apply(this);
        }
        if(node.getPhrase() != null)
        {
            node.getPhrase().apply(this);
        }
        if(node.getSpace() != null)
        {
            node.getSpace().apply(this);
        }
        if(node.getScenarioKeyword() != null)
        {
            node.getScenarioKeyword().apply(this);
        }
        outAScenarioTitle(node);
    }

    public void inAContext(AContext node)
    {
        defaultIn(node);
    }

    public void outAContext(AContext node)
    {
        defaultOut(node);
    }

    public void caseAContext(AContext node)
    {
        inAContext(node);
        if(node.getEndl() != null)
        {
            node.getEndl().apply(this);
        }
        if(node.getPhrase() != null)
        {
            node.getPhrase().apply(this);
        }
        if(node.getSpace() != null)
        {
            node.getSpace().apply(this);
        }
        if(node.getGiven() != null)
        {
            node.getGiven().apply(this);
        }
        outAContext(node);
    }

    public void inAEvent(AEvent node)
    {
        defaultIn(node);
    }

    public void outAEvent(AEvent node)
    {
        defaultOut(node);
    }

    public void caseAEvent(AEvent node)
    {
        inAEvent(node);
        if(node.getEndl() != null)
        {
            node.getEndl().apply(this);
        }
        if(node.getPhrase() != null)
        {
            node.getPhrase().apply(this);
        }
        if(node.getSpace() != null)
        {
            node.getSpace().apply(this);
        }
        if(node.getWhen() != null)
        {
            node.getWhen().apply(this);
        }
        outAEvent(node);
    }

    public void inAOutcome(AOutcome node)
    {
        defaultIn(node);
    }

    public void outAOutcome(AOutcome node)
    {
        defaultOut(node);
    }

    public void caseAOutcome(AOutcome node)
    {
        inAOutcome(node);
        if(node.getEndl() != null)
        {
            node.getEndl().apply(this);
        }
        if(node.getPhrase() != null)
        {
            node.getPhrase().apply(this);
        }
        if(node.getSpace() != null)
        {
            node.getSpace().apply(this);
        }
        if(node.getThen() != null)
        {
            node.getThen().apply(this);
        }
        outAOutcome(node);
    }

    public void inAPhrase(APhrase node)
    {
        defaultIn(node);
    }

    public void outAPhrase(APhrase node)
    {
        defaultOut(node);
    }

    public void caseAPhrase(APhrase node)
    {
        inAPhrase(node);
        {
            Object temp[] = node.getWordOrSpace().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PWordOrSpace) temp[i]).apply(this);
            }
        }
        outAPhrase(node);
    }

    public void inAWordWordOrSpace(AWordWordOrSpace node)
    {
        defaultIn(node);
    }

    public void outAWordWordOrSpace(AWordWordOrSpace node)
    {
        defaultOut(node);
    }

    public void caseAWordWordOrSpace(AWordWordOrSpace node)
    {
        inAWordWordOrSpace(node);
        if(node.getWord() != null)
        {
            node.getWord().apply(this);
        }
        outAWordWordOrSpace(node);
    }

    public void inASpaceWordOrSpace(ASpaceWordOrSpace node)
    {
        defaultIn(node);
    }

    public void outASpaceWordOrSpace(ASpaceWordOrSpace node)
    {
        defaultOut(node);
    }

    public void caseASpaceWordOrSpace(ASpaceWordOrSpace node)
    {
        inASpaceWordOrSpace(node);
        if(node.getSpace() != null)
        {
            node.getSpace().apply(this);
        }
        outASpaceWordOrSpace(node);
    }
}
