package com.github.funthomas424242.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.github.funthomas424242.dsl.services.AhnenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAhnenParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DATE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'unbekannt'", "'-'", "'lebend'", "'vermisst'", "'unerfasst'", "'keine'", "'ohne'", "'abgebrochen'", "'andauernd'", "'unabsehbar'", "'demn\\u00E4chst'", "'m\\u00E4nnlich'", "'weiblich'", "'Familie'", "';'", "'Person'", "'{'", "'Letzte'", "'\\u00C4nderung:'", "'.'", "'Vorname:'", "'Mittelname:'", "'Nachname:'", "'Geburtsname:'", "'Rufname:'", "'Geschlecht:'", "'Geburtsdatum:'", "'Todesdatum:'", "'Vater:'", "'Mutter:'", "'Kinder:'", "'Stiefkinder:'", "'Beziehungen:'", "'}'", "'Ereignisse:'", "'bekannt'", "'Schulausbildung:'", "'von'", "'bis'", "'Abschluss:'", "'T\\u00E4tigkeit:'", "'als'", "'bei'", "'in'", "','", "'Beziehung:'", "'mit'", "'von:'", "'bis:'", "'Hochzeit:'", "'Scheidung:'", "'Familienbuch'", "'Familie:'", "'Person:'", "'Version:'", "'Titel:'", "'Vorwort:'", "'Autor:'", "'Familien:'", "'import'", "'familie'", "'Name:'", "'Organisation'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_DATE=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAhnenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAhnenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAhnenParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAhnen.g"; }


    	private AhnenGrammarAccess grammarAccess;

    	public void setGrammarAccess(AhnenGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalAhnen.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAhnen.g:54:1: ( ruleModel EOF )
            // InternalAhnen.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAhnen.g:62:1: ruleModel : ( ( rule__Model__DateiAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:66:2: ( ( ( rule__Model__DateiAssignment ) ) )
            // InternalAhnen.g:67:2: ( ( rule__Model__DateiAssignment ) )
            {
            // InternalAhnen.g:67:2: ( ( rule__Model__DateiAssignment ) )
            // InternalAhnen.g:68:3: ( rule__Model__DateiAssignment )
            {
             before(grammarAccess.getModelAccess().getDateiAssignment()); 
            // InternalAhnen.g:69:3: ( rule__Model__DateiAssignment )
            // InternalAhnen.g:69:4: rule__Model__DateiAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__DateiAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDateiAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDateiart"
    // InternalAhnen.g:78:1: entryRuleDateiart : ruleDateiart EOF ;
    public final void entryRuleDateiart() throws RecognitionException {
        try {
            // InternalAhnen.g:79:1: ( ruleDateiart EOF )
            // InternalAhnen.g:80:1: ruleDateiart EOF
            {
             before(grammarAccess.getDateiartRule()); 
            pushFollow(FOLLOW_1);
            ruleDateiart();

            state._fsp--;

             after(grammarAccess.getDateiartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateiart"


    // $ANTLR start "ruleDateiart"
    // InternalAhnen.g:87:1: ruleDateiart : ( ( rule__Dateiart__Alternatives ) ) ;
    public final void ruleDateiart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:91:2: ( ( ( rule__Dateiart__Alternatives ) ) )
            // InternalAhnen.g:92:2: ( ( rule__Dateiart__Alternatives ) )
            {
            // InternalAhnen.g:92:2: ( ( rule__Dateiart__Alternatives ) )
            // InternalAhnen.g:93:3: ( rule__Dateiart__Alternatives )
            {
             before(grammarAccess.getDateiartAccess().getAlternatives()); 
            // InternalAhnen.g:94:3: ( rule__Dateiart__Alternatives )
            // InternalAhnen.g:94:4: rule__Dateiart__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Dateiart__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDateiartAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateiart"


    // $ANTLR start "entryRuleFamilie"
    // InternalAhnen.g:103:1: entryRuleFamilie : ruleFamilie EOF ;
    public final void entryRuleFamilie() throws RecognitionException {
        try {
            // InternalAhnen.g:104:1: ( ruleFamilie EOF )
            // InternalAhnen.g:105:1: ruleFamilie EOF
            {
             before(grammarAccess.getFamilieRule()); 
            pushFollow(FOLLOW_1);
            ruleFamilie();

            state._fsp--;

             after(grammarAccess.getFamilieRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFamilie"


    // $ANTLR start "ruleFamilie"
    // InternalAhnen.g:112:1: ruleFamilie : ( ( rule__Familie__Group__0 ) ) ;
    public final void ruleFamilie() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:116:2: ( ( ( rule__Familie__Group__0 ) ) )
            // InternalAhnen.g:117:2: ( ( rule__Familie__Group__0 ) )
            {
            // InternalAhnen.g:117:2: ( ( rule__Familie__Group__0 ) )
            // InternalAhnen.g:118:3: ( rule__Familie__Group__0 )
            {
             before(grammarAccess.getFamilieAccess().getGroup()); 
            // InternalAhnen.g:119:3: ( rule__Familie__Group__0 )
            // InternalAhnen.g:119:4: rule__Familie__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Familie__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFamilieAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFamilie"


    // $ANTLR start "entryRulePerson"
    // InternalAhnen.g:128:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalAhnen.g:129:1: ( rulePerson EOF )
            // InternalAhnen.g:130:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalAhnen.g:137:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:141:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalAhnen.g:142:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalAhnen.g:142:2: ( ( rule__Person__Group__0 ) )
            // InternalAhnen.g:143:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalAhnen.g:144:3: ( rule__Person__Group__0 )
            // InternalAhnen.g:144:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleEreignis"
    // InternalAhnen.g:153:1: entryRuleEreignis : ruleEreignis EOF ;
    public final void entryRuleEreignis() throws RecognitionException {
        try {
            // InternalAhnen.g:154:1: ( ruleEreignis EOF )
            // InternalAhnen.g:155:1: ruleEreignis EOF
            {
             before(grammarAccess.getEreignisRule()); 
            pushFollow(FOLLOW_1);
            ruleEreignis();

            state._fsp--;

             after(grammarAccess.getEreignisRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEreignis"


    // $ANTLR start "ruleEreignis"
    // InternalAhnen.g:162:1: ruleEreignis : ( ( rule__Ereignis__Alternatives ) ) ;
    public final void ruleEreignis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:166:2: ( ( ( rule__Ereignis__Alternatives ) ) )
            // InternalAhnen.g:167:2: ( ( rule__Ereignis__Alternatives ) )
            {
            // InternalAhnen.g:167:2: ( ( rule__Ereignis__Alternatives ) )
            // InternalAhnen.g:168:3: ( rule__Ereignis__Alternatives )
            {
             before(grammarAccess.getEreignisAccess().getAlternatives()); 
            // InternalAhnen.g:169:3: ( rule__Ereignis__Alternatives )
            // InternalAhnen.g:169:4: rule__Ereignis__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Ereignis__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEreignisAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEreignis"


    // $ANTLR start "entryRuleSchulausbildung"
    // InternalAhnen.g:178:1: entryRuleSchulausbildung : ruleSchulausbildung EOF ;
    public final void entryRuleSchulausbildung() throws RecognitionException {
        try {
            // InternalAhnen.g:179:1: ( ruleSchulausbildung EOF )
            // InternalAhnen.g:180:1: ruleSchulausbildung EOF
            {
             before(grammarAccess.getSchulausbildungRule()); 
            pushFollow(FOLLOW_1);
            ruleSchulausbildung();

            state._fsp--;

             after(grammarAccess.getSchulausbildungRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSchulausbildung"


    // $ANTLR start "ruleSchulausbildung"
    // InternalAhnen.g:187:1: ruleSchulausbildung : ( ( rule__Schulausbildung__Group__0 ) ) ;
    public final void ruleSchulausbildung() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:191:2: ( ( ( rule__Schulausbildung__Group__0 ) ) )
            // InternalAhnen.g:192:2: ( ( rule__Schulausbildung__Group__0 ) )
            {
            // InternalAhnen.g:192:2: ( ( rule__Schulausbildung__Group__0 ) )
            // InternalAhnen.g:193:3: ( rule__Schulausbildung__Group__0 )
            {
             before(grammarAccess.getSchulausbildungAccess().getGroup()); 
            // InternalAhnen.g:194:3: ( rule__Schulausbildung__Group__0 )
            // InternalAhnen.g:194:4: rule__Schulausbildung__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Schulausbildung__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchulausbildungAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchulausbildung"


    // $ANTLR start "entryRuleTaetigkeit"
    // InternalAhnen.g:203:1: entryRuleTaetigkeit : ruleTaetigkeit EOF ;
    public final void entryRuleTaetigkeit() throws RecognitionException {
        try {
            // InternalAhnen.g:204:1: ( ruleTaetigkeit EOF )
            // InternalAhnen.g:205:1: ruleTaetigkeit EOF
            {
             before(grammarAccess.getTaetigkeitRule()); 
            pushFollow(FOLLOW_1);
            ruleTaetigkeit();

            state._fsp--;

             after(grammarAccess.getTaetigkeitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTaetigkeit"


    // $ANTLR start "ruleTaetigkeit"
    // InternalAhnen.g:212:1: ruleTaetigkeit : ( ( rule__Taetigkeit__Group__0 ) ) ;
    public final void ruleTaetigkeit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:216:2: ( ( ( rule__Taetigkeit__Group__0 ) ) )
            // InternalAhnen.g:217:2: ( ( rule__Taetigkeit__Group__0 ) )
            {
            // InternalAhnen.g:217:2: ( ( rule__Taetigkeit__Group__0 ) )
            // InternalAhnen.g:218:3: ( rule__Taetigkeit__Group__0 )
            {
             before(grammarAccess.getTaetigkeitAccess().getGroup()); 
            // InternalAhnen.g:219:3: ( rule__Taetigkeit__Group__0 )
            // InternalAhnen.g:219:4: rule__Taetigkeit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaetigkeitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaetigkeit"


    // $ANTLR start "entryRuleKinder"
    // InternalAhnen.g:228:1: entryRuleKinder : ruleKinder EOF ;
    public final void entryRuleKinder() throws RecognitionException {
        try {
            // InternalAhnen.g:229:1: ( ruleKinder EOF )
            // InternalAhnen.g:230:1: ruleKinder EOF
            {
             before(grammarAccess.getKinderRule()); 
            pushFollow(FOLLOW_1);
            ruleKinder();

            state._fsp--;

             after(grammarAccess.getKinderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKinder"


    // $ANTLR start "ruleKinder"
    // InternalAhnen.g:237:1: ruleKinder : ( ( rule__Kinder__Group__0 ) ) ;
    public final void ruleKinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:241:2: ( ( ( rule__Kinder__Group__0 ) ) )
            // InternalAhnen.g:242:2: ( ( rule__Kinder__Group__0 ) )
            {
            // InternalAhnen.g:242:2: ( ( rule__Kinder__Group__0 ) )
            // InternalAhnen.g:243:3: ( rule__Kinder__Group__0 )
            {
             before(grammarAccess.getKinderAccess().getGroup()); 
            // InternalAhnen.g:244:3: ( rule__Kinder__Group__0 )
            // InternalAhnen.g:244:4: rule__Kinder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Kinder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKinderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKinder"


    // $ANTLR start "entryRuleBeziehung"
    // InternalAhnen.g:253:1: entryRuleBeziehung : ruleBeziehung EOF ;
    public final void entryRuleBeziehung() throws RecognitionException {
        try {
            // InternalAhnen.g:254:1: ( ruleBeziehung EOF )
            // InternalAhnen.g:255:1: ruleBeziehung EOF
            {
             before(grammarAccess.getBeziehungRule()); 
            pushFollow(FOLLOW_1);
            ruleBeziehung();

            state._fsp--;

             after(grammarAccess.getBeziehungRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBeziehung"


    // $ANTLR start "ruleBeziehung"
    // InternalAhnen.g:262:1: ruleBeziehung : ( ( rule__Beziehung__Group__0 ) ) ;
    public final void ruleBeziehung() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:266:2: ( ( ( rule__Beziehung__Group__0 ) ) )
            // InternalAhnen.g:267:2: ( ( rule__Beziehung__Group__0 ) )
            {
            // InternalAhnen.g:267:2: ( ( rule__Beziehung__Group__0 ) )
            // InternalAhnen.g:268:3: ( rule__Beziehung__Group__0 )
            {
             before(grammarAccess.getBeziehungAccess().getGroup()); 
            // InternalAhnen.g:269:3: ( rule__Beziehung__Group__0 )
            // InternalAhnen.g:269:4: rule__Beziehung__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Beziehung__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBeziehungAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBeziehung"


    // $ANTLR start "entryRuleFamilienbuch"
    // InternalAhnen.g:278:1: entryRuleFamilienbuch : ruleFamilienbuch EOF ;
    public final void entryRuleFamilienbuch() throws RecognitionException {
        try {
            // InternalAhnen.g:279:1: ( ruleFamilienbuch EOF )
            // InternalAhnen.g:280:1: ruleFamilienbuch EOF
            {
             before(grammarAccess.getFamilienbuchRule()); 
            pushFollow(FOLLOW_1);
            ruleFamilienbuch();

            state._fsp--;

             after(grammarAccess.getFamilienbuchRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFamilienbuch"


    // $ANTLR start "ruleFamilienbuch"
    // InternalAhnen.g:287:1: ruleFamilienbuch : ( ( rule__Familienbuch__Group__0 ) ) ;
    public final void ruleFamilienbuch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:291:2: ( ( ( rule__Familienbuch__Group__0 ) ) )
            // InternalAhnen.g:292:2: ( ( rule__Familienbuch__Group__0 ) )
            {
            // InternalAhnen.g:292:2: ( ( rule__Familienbuch__Group__0 ) )
            // InternalAhnen.g:293:3: ( rule__Familienbuch__Group__0 )
            {
             before(grammarAccess.getFamilienbuchAccess().getGroup()); 
            // InternalAhnen.g:294:3: ( rule__Familienbuch__Group__0 )
            // InternalAhnen.g:294:4: rule__Familienbuch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFamilienbuchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFamilienbuch"


    // $ANTLR start "entryRuleFamilienImport"
    // InternalAhnen.g:303:1: entryRuleFamilienImport : ruleFamilienImport EOF ;
    public final void entryRuleFamilienImport() throws RecognitionException {
        try {
            // InternalAhnen.g:304:1: ( ruleFamilienImport EOF )
            // InternalAhnen.g:305:1: ruleFamilienImport EOF
            {
             before(grammarAccess.getFamilienImportRule()); 
            pushFollow(FOLLOW_1);
            ruleFamilienImport();

            state._fsp--;

             after(grammarAccess.getFamilienImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFamilienImport"


    // $ANTLR start "ruleFamilienImport"
    // InternalAhnen.g:312:1: ruleFamilienImport : ( ( rule__FamilienImport__Group__0 ) ) ;
    public final void ruleFamilienImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:316:2: ( ( ( rule__FamilienImport__Group__0 ) ) )
            // InternalAhnen.g:317:2: ( ( rule__FamilienImport__Group__0 ) )
            {
            // InternalAhnen.g:317:2: ( ( rule__FamilienImport__Group__0 ) )
            // InternalAhnen.g:318:3: ( rule__FamilienImport__Group__0 )
            {
             before(grammarAccess.getFamilienImportAccess().getGroup()); 
            // InternalAhnen.g:319:3: ( rule__FamilienImport__Group__0 )
            // InternalAhnen.g:319:4: rule__FamilienImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FamilienImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFamilienImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFamilienImport"


    // $ANTLR start "entryRuleAutor"
    // InternalAhnen.g:328:1: entryRuleAutor : ruleAutor EOF ;
    public final void entryRuleAutor() throws RecognitionException {
        try {
            // InternalAhnen.g:329:1: ( ruleAutor EOF )
            // InternalAhnen.g:330:1: ruleAutor EOF
            {
             before(grammarAccess.getAutorRule()); 
            pushFollow(FOLLOW_1);
            ruleAutor();

            state._fsp--;

             after(grammarAccess.getAutorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutor"


    // $ANTLR start "ruleAutor"
    // InternalAhnen.g:337:1: ruleAutor : ( ( rule__Autor__Group__0 ) ) ;
    public final void ruleAutor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:341:2: ( ( ( rule__Autor__Group__0 ) ) )
            // InternalAhnen.g:342:2: ( ( rule__Autor__Group__0 ) )
            {
            // InternalAhnen.g:342:2: ( ( rule__Autor__Group__0 ) )
            // InternalAhnen.g:343:3: ( rule__Autor__Group__0 )
            {
             before(grammarAccess.getAutorAccess().getGroup()); 
            // InternalAhnen.g:344:3: ( rule__Autor__Group__0 )
            // InternalAhnen.g:344:4: rule__Autor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Autor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutor"


    // $ANTLR start "entryRuleVERSION"
    // InternalAhnen.g:353:1: entryRuleVERSION : ruleVERSION EOF ;
    public final void entryRuleVERSION() throws RecognitionException {
        try {
            // InternalAhnen.g:354:1: ( ruleVERSION EOF )
            // InternalAhnen.g:355:1: ruleVERSION EOF
            {
             before(grammarAccess.getVERSIONRule()); 
            pushFollow(FOLLOW_1);
            ruleVERSION();

            state._fsp--;

             after(grammarAccess.getVERSIONRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVERSION"


    // $ANTLR start "ruleVERSION"
    // InternalAhnen.g:362:1: ruleVERSION : ( ( rule__VERSION__Group__0 ) ) ;
    public final void ruleVERSION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:366:2: ( ( ( rule__VERSION__Group__0 ) ) )
            // InternalAhnen.g:367:2: ( ( rule__VERSION__Group__0 ) )
            {
            // InternalAhnen.g:367:2: ( ( rule__VERSION__Group__0 ) )
            // InternalAhnen.g:368:3: ( rule__VERSION__Group__0 )
            {
             before(grammarAccess.getVERSIONAccess().getGroup()); 
            // InternalAhnen.g:369:3: ( rule__VERSION__Group__0 )
            // InternalAhnen.g:369:4: rule__VERSION__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VERSION__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVERSIONAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVERSION"


    // $ANTLR start "entryRuleDATUM"
    // InternalAhnen.g:378:1: entryRuleDATUM : ruleDATUM EOF ;
    public final void entryRuleDATUM() throws RecognitionException {
        try {
            // InternalAhnen.g:379:1: ( ruleDATUM EOF )
            // InternalAhnen.g:380:1: ruleDATUM EOF
            {
             before(grammarAccess.getDATUMRule()); 
            pushFollow(FOLLOW_1);
            ruleDATUM();

            state._fsp--;

             after(grammarAccess.getDATUMRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDATUM"


    // $ANTLR start "ruleDATUM"
    // InternalAhnen.g:387:1: ruleDATUM : ( RULE_DATE ) ;
    public final void ruleDATUM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:391:2: ( ( RULE_DATE ) )
            // InternalAhnen.g:392:2: ( RULE_DATE )
            {
            // InternalAhnen.g:392:2: ( RULE_DATE )
            // InternalAhnen.g:393:3: RULE_DATE
            {
             before(grammarAccess.getDATUMAccess().getDATETerminalRuleCall()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getDATUMAccess().getDATETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDATUM"


    // $ANTLR start "ruleGeschlecht"
    // InternalAhnen.g:403:1: ruleGeschlecht : ( ( rule__Geschlecht__Alternatives ) ) ;
    public final void ruleGeschlecht() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:407:1: ( ( ( rule__Geschlecht__Alternatives ) ) )
            // InternalAhnen.g:408:2: ( ( rule__Geschlecht__Alternatives ) )
            {
            // InternalAhnen.g:408:2: ( ( rule__Geschlecht__Alternatives ) )
            // InternalAhnen.g:409:3: ( rule__Geschlecht__Alternatives )
            {
             before(grammarAccess.getGeschlechtAccess().getAlternatives()); 
            // InternalAhnen.g:410:3: ( rule__Geschlecht__Alternatives )
            // InternalAhnen.g:410:4: rule__Geschlecht__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Geschlecht__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGeschlechtAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeschlecht"


    // $ANTLR start "rule__Dateiart__Alternatives"
    // InternalAhnen.g:418:1: rule__Dateiart__Alternatives : ( ( ( rule__Dateiart__BuchAssignment_0 ) ) | ( ( rule__Dateiart__FamilieAssignment_1 ) ) );
    public final void rule__Dateiart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:422:1: ( ( ( rule__Dateiart__BuchAssignment_0 ) ) | ( ( rule__Dateiart__FamilieAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==63) ) {
                alt1=1;
            }
            else if ( (LA1_0==25) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAhnen.g:423:2: ( ( rule__Dateiart__BuchAssignment_0 ) )
                    {
                    // InternalAhnen.g:423:2: ( ( rule__Dateiart__BuchAssignment_0 ) )
                    // InternalAhnen.g:424:3: ( rule__Dateiart__BuchAssignment_0 )
                    {
                     before(grammarAccess.getDateiartAccess().getBuchAssignment_0()); 
                    // InternalAhnen.g:425:3: ( rule__Dateiart__BuchAssignment_0 )
                    // InternalAhnen.g:425:4: rule__Dateiart__BuchAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dateiart__BuchAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDateiartAccess().getBuchAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:429:2: ( ( rule__Dateiart__FamilieAssignment_1 ) )
                    {
                    // InternalAhnen.g:429:2: ( ( rule__Dateiart__FamilieAssignment_1 ) )
                    // InternalAhnen.g:430:3: ( rule__Dateiart__FamilieAssignment_1 )
                    {
                     before(grammarAccess.getDateiartAccess().getFamilieAssignment_1()); 
                    // InternalAhnen.g:431:3: ( rule__Dateiart__FamilieAssignment_1 )
                    // InternalAhnen.g:431:4: rule__Dateiart__FamilieAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dateiart__FamilieAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDateiartAccess().getFamilieAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dateiart__Alternatives"


    // $ANTLR start "rule__Person__Alternatives_9"
    // InternalAhnen.g:439:1: rule__Person__Alternatives_9 : ( ( ( rule__Person__VornameAssignment_9_0 )? ) | ( 'unbekannt' ) );
    public final void rule__Person__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:443:1: ( ( ( rule__Person__VornameAssignment_9_0 )? ) | ( 'unbekannt' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING||LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAhnen.g:444:2: ( ( rule__Person__VornameAssignment_9_0 )? )
                    {
                    // InternalAhnen.g:444:2: ( ( rule__Person__VornameAssignment_9_0 )? )
                    // InternalAhnen.g:445:3: ( rule__Person__VornameAssignment_9_0 )?
                    {
                     before(grammarAccess.getPersonAccess().getVornameAssignment_9_0()); 
                    // InternalAhnen.g:446:3: ( rule__Person__VornameAssignment_9_0 )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_STRING) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalAhnen.g:446:4: rule__Person__VornameAssignment_9_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Person__VornameAssignment_9_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getPersonAccess().getVornameAssignment_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:450:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:450:2: ( 'unbekannt' )
                    // InternalAhnen.g:451:3: 'unbekannt'
                    {
                     before(grammarAccess.getPersonAccess().getUnbekanntKeyword_9_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPersonAccess().getUnbekanntKeyword_9_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Alternatives_9"


    // $ANTLR start "rule__Person__Alternatives_12"
    // InternalAhnen.g:460:1: rule__Person__Alternatives_12 : ( ( ( rule__Person__MittelnameAssignment_12_0 )? ) | ( 'unbekannt' ) | ( '-' ) );
    public final void rule__Person__Alternatives_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:464:1: ( ( ( rule__Person__MittelnameAssignment_12_0 )? ) | ( 'unbekannt' ) | ( '-' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 31:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalAhnen.g:465:2: ( ( rule__Person__MittelnameAssignment_12_0 )? )
                    {
                    // InternalAhnen.g:465:2: ( ( rule__Person__MittelnameAssignment_12_0 )? )
                    // InternalAhnen.g:466:3: ( rule__Person__MittelnameAssignment_12_0 )?
                    {
                     before(grammarAccess.getPersonAccess().getMittelnameAssignment_12_0()); 
                    // InternalAhnen.g:467:3: ( rule__Person__MittelnameAssignment_12_0 )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_STRING) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalAhnen.g:467:4: rule__Person__MittelnameAssignment_12_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Person__MittelnameAssignment_12_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getPersonAccess().getMittelnameAssignment_12_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:471:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:471:2: ( 'unbekannt' )
                    // InternalAhnen.g:472:3: 'unbekannt'
                    {
                     before(grammarAccess.getPersonAccess().getUnbekanntKeyword_12_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPersonAccess().getUnbekanntKeyword_12_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAhnen.g:477:2: ( '-' )
                    {
                    // InternalAhnen.g:477:2: ( '-' )
                    // InternalAhnen.g:478:3: '-'
                    {
                     before(grammarAccess.getPersonAccess().getHyphenMinusKeyword_12_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPersonAccess().getHyphenMinusKeyword_12_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Alternatives_12"


    // $ANTLR start "rule__Person__Alternatives_15"
    // InternalAhnen.g:487:1: rule__Person__Alternatives_15 : ( ( ( rule__Person__NachnameAssignment_15_0 )? ) | ( 'unbekannt' ) );
    public final void rule__Person__Alternatives_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:491:1: ( ( ( rule__Person__NachnameAssignment_15_0 )? ) | ( 'unbekannt' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING||LA7_0==31) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAhnen.g:492:2: ( ( rule__Person__NachnameAssignment_15_0 )? )
                    {
                    // InternalAhnen.g:492:2: ( ( rule__Person__NachnameAssignment_15_0 )? )
                    // InternalAhnen.g:493:3: ( rule__Person__NachnameAssignment_15_0 )?
                    {
                     before(grammarAccess.getPersonAccess().getNachnameAssignment_15_0()); 
                    // InternalAhnen.g:494:3: ( rule__Person__NachnameAssignment_15_0 )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_STRING) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalAhnen.g:494:4: rule__Person__NachnameAssignment_15_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Person__NachnameAssignment_15_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getPersonAccess().getNachnameAssignment_15_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:498:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:498:2: ( 'unbekannt' )
                    // InternalAhnen.g:499:3: 'unbekannt'
                    {
                     before(grammarAccess.getPersonAccess().getUnbekanntKeyword_15_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPersonAccess().getUnbekanntKeyword_15_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Alternatives_15"


    // $ANTLR start "rule__Person__Alternatives_18"
    // InternalAhnen.g:508:1: rule__Person__Alternatives_18 : ( ( ( rule__Person__GeburtsnameAssignment_18_0 )? ) | ( 'unbekannt' ) );
    public final void rule__Person__Alternatives_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:512:1: ( ( ( rule__Person__GeburtsnameAssignment_18_0 )? ) | ( 'unbekannt' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING||LA9_0==31) ) {
                alt9=1;
            }
            else if ( (LA9_0==12) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAhnen.g:513:2: ( ( rule__Person__GeburtsnameAssignment_18_0 )? )
                    {
                    // InternalAhnen.g:513:2: ( ( rule__Person__GeburtsnameAssignment_18_0 )? )
                    // InternalAhnen.g:514:3: ( rule__Person__GeburtsnameAssignment_18_0 )?
                    {
                     before(grammarAccess.getPersonAccess().getGeburtsnameAssignment_18_0()); 
                    // InternalAhnen.g:515:3: ( rule__Person__GeburtsnameAssignment_18_0 )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_STRING) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalAhnen.g:515:4: rule__Person__GeburtsnameAssignment_18_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Person__GeburtsnameAssignment_18_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getPersonAccess().getGeburtsnameAssignment_18_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:519:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:519:2: ( 'unbekannt' )
                    // InternalAhnen.g:520:3: 'unbekannt'
                    {
                     before(grammarAccess.getPersonAccess().getUnbekanntKeyword_18_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPersonAccess().getUnbekanntKeyword_18_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Alternatives_18"


    // $ANTLR start "rule__Person__Alternatives_21"
    // InternalAhnen.g:529:1: rule__Person__Alternatives_21 : ( ( ( rule__Person__RufnameAssignment_21_0 )? ) | ( 'unbekannt' ) );
    public final void rule__Person__Alternatives_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:533:1: ( ( ( rule__Person__RufnameAssignment_21_0 )? ) | ( 'unbekannt' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING||LA11_0==31) ) {
                alt11=1;
            }
            else if ( (LA11_0==12) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAhnen.g:534:2: ( ( rule__Person__RufnameAssignment_21_0 )? )
                    {
                    // InternalAhnen.g:534:2: ( ( rule__Person__RufnameAssignment_21_0 )? )
                    // InternalAhnen.g:535:3: ( rule__Person__RufnameAssignment_21_0 )?
                    {
                     before(grammarAccess.getPersonAccess().getRufnameAssignment_21_0()); 
                    // InternalAhnen.g:536:3: ( rule__Person__RufnameAssignment_21_0 )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_STRING) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalAhnen.g:536:4: rule__Person__RufnameAssignment_21_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Person__RufnameAssignment_21_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getPersonAccess().getRufnameAssignment_21_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:540:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:540:2: ( 'unbekannt' )
                    // InternalAhnen.g:541:3: 'unbekannt'
                    {
                     before(grammarAccess.getPersonAccess().getUnbekanntKeyword_21_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPersonAccess().getUnbekanntKeyword_21_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Alternatives_21"


    // $ANTLR start "rule__Person__Alternatives_27"
    // InternalAhnen.g:550:1: rule__Person__Alternatives_27 : ( ( ( rule__Person__GeburtsDatumAssignment_27_0 )? ) | ( 'unbekannt' ) );
    public final void rule__Person__Alternatives_27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:554:1: ( ( ( rule__Person__GeburtsDatumAssignment_27_0 )? ) | ( 'unbekannt' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DATE||LA13_0==31) ) {
                alt13=1;
            }
            else if ( (LA13_0==12) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalAhnen.g:555:2: ( ( rule__Person__GeburtsDatumAssignment_27_0 )? )
                    {
                    // InternalAhnen.g:555:2: ( ( rule__Person__GeburtsDatumAssignment_27_0 )? )
                    // InternalAhnen.g:556:3: ( rule__Person__GeburtsDatumAssignment_27_0 )?
                    {
                     before(grammarAccess.getPersonAccess().getGeburtsDatumAssignment_27_0()); 
                    // InternalAhnen.g:557:3: ( rule__Person__GeburtsDatumAssignment_27_0 )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_DATE) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalAhnen.g:557:4: rule__Person__GeburtsDatumAssignment_27_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Person__GeburtsDatumAssignment_27_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getPersonAccess().getGeburtsDatumAssignment_27_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:561:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:561:2: ( 'unbekannt' )
                    // InternalAhnen.g:562:3: 'unbekannt'
                    {
                     before(grammarAccess.getPersonAccess().getUnbekanntKeyword_27_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPersonAccess().getUnbekanntKeyword_27_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Alternatives_27"


    // $ANTLR start "rule__Person__Alternatives_30"
    // InternalAhnen.g:571:1: rule__Person__Alternatives_30 : ( ( ( rule__Person__TodesDatumAssignment_30_0 )? ) | ( 'unbekannt' ) | ( 'lebend' ) | ( 'vermisst' ) );
    public final void rule__Person__Alternatives_30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:575:1: ( ( ( rule__Person__TodesDatumAssignment_30_0 )? ) | ( 'unbekannt' ) | ( 'lebend' ) | ( 'vermisst' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_DATE:
            case 31:
                {
                alt15=1;
                }
                break;
            case 12:
                {
                alt15=2;
                }
                break;
            case 14:
                {
                alt15=3;
                }
                break;
            case 15:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalAhnen.g:576:2: ( ( rule__Person__TodesDatumAssignment_30_0 )? )
                    {
                    // InternalAhnen.g:576:2: ( ( rule__Person__TodesDatumAssignment_30_0 )? )
                    // InternalAhnen.g:577:3: ( rule__Person__TodesDatumAssignment_30_0 )?
                    {
                     before(grammarAccess.getPersonAccess().getTodesDatumAssignment_30_0()); 
                    // InternalAhnen.g:578:3: ( rule__Person__TodesDatumAssignment_30_0 )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_DATE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalAhnen.g:578:4: rule__Person__TodesDatumAssignment_30_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Person__TodesDatumAssignment_30_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getPersonAccess().getTodesDatumAssignment_30_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:582:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:582:2: ( 'unbekannt' )
                    // InternalAhnen.g:583:3: 'unbekannt'
                    {
                     before(grammarAccess.getPersonAccess().getUnbekanntKeyword_30_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPersonAccess().getUnbekanntKeyword_30_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAhnen.g:588:2: ( 'lebend' )
                    {
                    // InternalAhnen.g:588:2: ( 'lebend' )
                    // InternalAhnen.g:589:3: 'lebend'
                    {
                     before(grammarAccess.getPersonAccess().getLebendKeyword_30_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getPersonAccess().getLebendKeyword_30_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAhnen.g:594:2: ( 'vermisst' )
                    {
                    // InternalAhnen.g:594:2: ( 'vermisst' )
                    // InternalAhnen.g:595:3: 'vermisst'
                    {
                     before(grammarAccess.getPersonAccess().getVermisstKeyword_30_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPersonAccess().getVermisstKeyword_30_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Alternatives_30"


    // $ANTLR start "rule__Person__Alternatives_33"
    // InternalAhnen.g:604:1: rule__Person__Alternatives_33 : ( ( ( rule__Person__VaterAssignment_33_0 )? ) | ( 'unbekannt' ) | ( 'unerfasst' ) );
    public final void rule__Person__Alternatives_33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:608:1: ( ( ( rule__Person__VaterAssignment_33_0 )? ) | ( 'unbekannt' ) | ( 'unerfasst' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 31:
                {
                alt17=1;
                }
                break;
            case 12:
                {
                alt17=2;
                }
                break;
            case 16:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalAhnen.g:609:2: ( ( rule__Person__VaterAssignment_33_0 )? )
                    {
                    // InternalAhnen.g:609:2: ( ( rule__Person__VaterAssignment_33_0 )? )
                    // InternalAhnen.g:610:3: ( rule__Person__VaterAssignment_33_0 )?
                    {
                     before(grammarAccess.getPersonAccess().getVaterAssignment_33_0()); 
                    // InternalAhnen.g:611:3: ( rule__Person__VaterAssignment_33_0 )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_STRING) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalAhnen.g:611:4: rule__Person__VaterAssignment_33_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Person__VaterAssignment_33_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getPersonAccess().getVaterAssignment_33_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:615:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:615:2: ( 'unbekannt' )
                    // InternalAhnen.g:616:3: 'unbekannt'
                    {
                     before(grammarAccess.getPersonAccess().getUnbekanntKeyword_33_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPersonAccess().getUnbekanntKeyword_33_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAhnen.g:621:2: ( 'unerfasst' )
                    {
                    // InternalAhnen.g:621:2: ( 'unerfasst' )
                    // InternalAhnen.g:622:3: 'unerfasst'
                    {
                     before(grammarAccess.getPersonAccess().getUnerfasstKeyword_33_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPersonAccess().getUnerfasstKeyword_33_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Alternatives_33"


    // $ANTLR start "rule__Person__Alternatives_36"
    // InternalAhnen.g:631:1: rule__Person__Alternatives_36 : ( ( ( rule__Person__MutterAssignment_36_0 )? ) | ( 'unbekannt' ) | ( 'unerfasst' ) );
    public final void rule__Person__Alternatives_36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:635:1: ( ( ( rule__Person__MutterAssignment_36_0 )? ) | ( 'unbekannt' ) | ( 'unerfasst' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 31:
                {
                alt19=1;
                }
                break;
            case 12:
                {
                alt19=2;
                }
                break;
            case 16:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalAhnen.g:636:2: ( ( rule__Person__MutterAssignment_36_0 )? )
                    {
                    // InternalAhnen.g:636:2: ( ( rule__Person__MutterAssignment_36_0 )? )
                    // InternalAhnen.g:637:3: ( rule__Person__MutterAssignment_36_0 )?
                    {
                     before(grammarAccess.getPersonAccess().getMutterAssignment_36_0()); 
                    // InternalAhnen.g:638:3: ( rule__Person__MutterAssignment_36_0 )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_STRING) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalAhnen.g:638:4: rule__Person__MutterAssignment_36_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Person__MutterAssignment_36_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getPersonAccess().getMutterAssignment_36_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:642:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:642:2: ( 'unbekannt' )
                    // InternalAhnen.g:643:3: 'unbekannt'
                    {
                     before(grammarAccess.getPersonAccess().getUnbekanntKeyword_36_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPersonAccess().getUnbekanntKeyword_36_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAhnen.g:648:2: ( 'unerfasst' )
                    {
                    // InternalAhnen.g:648:2: ( 'unerfasst' )
                    // InternalAhnen.g:649:3: 'unerfasst'
                    {
                     before(grammarAccess.getPersonAccess().getUnerfasstKeyword_36_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPersonAccess().getUnerfasstKeyword_36_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Alternatives_36"


    // $ANTLR start "rule__Person__Alternatives_39"
    // InternalAhnen.g:658:1: rule__Person__Alternatives_39 : ( ( ( rule__Person__KinderAssignment_39_0 )? ) | ( 'keine' ) );
    public final void rule__Person__Alternatives_39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:662:1: ( ( ( rule__Person__KinderAssignment_39_0 )? ) | ( 'keine' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING||LA21_0==12||LA21_0==16||LA21_0==31) ) {
                alt21=1;
            }
            else if ( (LA21_0==17) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalAhnen.g:663:2: ( ( rule__Person__KinderAssignment_39_0 )? )
                    {
                    // InternalAhnen.g:663:2: ( ( rule__Person__KinderAssignment_39_0 )? )
                    // InternalAhnen.g:664:3: ( rule__Person__KinderAssignment_39_0 )?
                    {
                     before(grammarAccess.getPersonAccess().getKinderAssignment_39_0()); 
                    // InternalAhnen.g:665:3: ( rule__Person__KinderAssignment_39_0 )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_STRING||LA20_0==12||LA20_0==16) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalAhnen.g:665:4: rule__Person__KinderAssignment_39_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Person__KinderAssignment_39_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getPersonAccess().getKinderAssignment_39_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:669:2: ( 'keine' )
                    {
                    // InternalAhnen.g:669:2: ( 'keine' )
                    // InternalAhnen.g:670:3: 'keine'
                    {
                     before(grammarAccess.getPersonAccess().getKeineKeyword_39_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPersonAccess().getKeineKeyword_39_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Alternatives_39"


    // $ANTLR start "rule__Person__Alternatives_42"
    // InternalAhnen.g:679:1: rule__Person__Alternatives_42 : ( ( ( rule__Person__StiefkinderAssignment_42_0 )? ) | ( 'keine' ) );
    public final void rule__Person__Alternatives_42() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:683:1: ( ( ( rule__Person__StiefkinderAssignment_42_0 )? ) | ( 'keine' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING||LA23_0==12||LA23_0==16||LA23_0==31) ) {
                alt23=1;
            }
            else if ( (LA23_0==17) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalAhnen.g:684:2: ( ( rule__Person__StiefkinderAssignment_42_0 )? )
                    {
                    // InternalAhnen.g:684:2: ( ( rule__Person__StiefkinderAssignment_42_0 )? )
                    // InternalAhnen.g:685:3: ( rule__Person__StiefkinderAssignment_42_0 )?
                    {
                     before(grammarAccess.getPersonAccess().getStiefkinderAssignment_42_0()); 
                    // InternalAhnen.g:686:3: ( rule__Person__StiefkinderAssignment_42_0 )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_STRING||LA22_0==12||LA22_0==16) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalAhnen.g:686:4: rule__Person__StiefkinderAssignment_42_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Person__StiefkinderAssignment_42_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getPersonAccess().getStiefkinderAssignment_42_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:690:2: ( 'keine' )
                    {
                    // InternalAhnen.g:690:2: ( 'keine' )
                    // InternalAhnen.g:691:3: 'keine'
                    {
                     before(grammarAccess.getPersonAccess().getKeineKeyword_42_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPersonAccess().getKeineKeyword_42_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Alternatives_42"


    // $ANTLR start "rule__Person__Alternatives_46"
    // InternalAhnen.g:700:1: rule__Person__Alternatives_46 : ( ( ( ( rule__Person__BeziehungenAssignment_46_0 ) ) ( ( rule__Person__BeziehungenAssignment_46_0 )* ) ) | ( 'keine' ) );
    public final void rule__Person__Alternatives_46() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:704:1: ( ( ( ( rule__Person__BeziehungenAssignment_46_0 ) ) ( ( rule__Person__BeziehungenAssignment_46_0 )* ) ) | ( 'keine' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==57) ) {
                alt25=1;
            }
            else if ( (LA25_0==17) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalAhnen.g:705:2: ( ( ( rule__Person__BeziehungenAssignment_46_0 ) ) ( ( rule__Person__BeziehungenAssignment_46_0 )* ) )
                    {
                    // InternalAhnen.g:705:2: ( ( ( rule__Person__BeziehungenAssignment_46_0 ) ) ( ( rule__Person__BeziehungenAssignment_46_0 )* ) )
                    // InternalAhnen.g:706:3: ( ( rule__Person__BeziehungenAssignment_46_0 ) ) ( ( rule__Person__BeziehungenAssignment_46_0 )* )
                    {
                    // InternalAhnen.g:706:3: ( ( rule__Person__BeziehungenAssignment_46_0 ) )
                    // InternalAhnen.g:707:4: ( rule__Person__BeziehungenAssignment_46_0 )
                    {
                     before(grammarAccess.getPersonAccess().getBeziehungenAssignment_46_0()); 
                    // InternalAhnen.g:708:4: ( rule__Person__BeziehungenAssignment_46_0 )
                    // InternalAhnen.g:708:5: rule__Person__BeziehungenAssignment_46_0
                    {
                    pushFollow(FOLLOW_3);
                    rule__Person__BeziehungenAssignment_46_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPersonAccess().getBeziehungenAssignment_46_0()); 

                    }

                    // InternalAhnen.g:711:3: ( ( rule__Person__BeziehungenAssignment_46_0 )* )
                    // InternalAhnen.g:712:4: ( rule__Person__BeziehungenAssignment_46_0 )*
                    {
                     before(grammarAccess.getPersonAccess().getBeziehungenAssignment_46_0()); 
                    // InternalAhnen.g:713:4: ( rule__Person__BeziehungenAssignment_46_0 )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==57) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalAhnen.g:713:5: rule__Person__BeziehungenAssignment_46_0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__Person__BeziehungenAssignment_46_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                     after(grammarAccess.getPersonAccess().getBeziehungenAssignment_46_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:718:2: ( 'keine' )
                    {
                    // InternalAhnen.g:718:2: ( 'keine' )
                    // InternalAhnen.g:719:3: 'keine'
                    {
                     before(grammarAccess.getPersonAccess().getKeineKeyword_46_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPersonAccess().getKeineKeyword_46_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Alternatives_46"


    // $ANTLR start "rule__Person__Alternatives_50"
    // InternalAhnen.g:728:1: rule__Person__Alternatives_50 : ( ( ( ( rule__Person__EreignisseAssignment_50_0 ) ) ( ( rule__Person__EreignisseAssignment_50_0 )* ) ) | ( ( rule__Person__Group_50_1__0 ) ) );
    public final void rule__Person__Alternatives_50() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:732:1: ( ( ( ( rule__Person__EreignisseAssignment_50_0 ) ) ( ( rule__Person__EreignisseAssignment_50_0 )* ) ) | ( ( rule__Person__Group_50_1__0 ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==48||LA27_0==52) ) {
                alt27=1;
            }
            else if ( (LA27_0==17) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalAhnen.g:733:2: ( ( ( rule__Person__EreignisseAssignment_50_0 ) ) ( ( rule__Person__EreignisseAssignment_50_0 )* ) )
                    {
                    // InternalAhnen.g:733:2: ( ( ( rule__Person__EreignisseAssignment_50_0 ) ) ( ( rule__Person__EreignisseAssignment_50_0 )* ) )
                    // InternalAhnen.g:734:3: ( ( rule__Person__EreignisseAssignment_50_0 ) ) ( ( rule__Person__EreignisseAssignment_50_0 )* )
                    {
                    // InternalAhnen.g:734:3: ( ( rule__Person__EreignisseAssignment_50_0 ) )
                    // InternalAhnen.g:735:4: ( rule__Person__EreignisseAssignment_50_0 )
                    {
                     before(grammarAccess.getPersonAccess().getEreignisseAssignment_50_0()); 
                    // InternalAhnen.g:736:4: ( rule__Person__EreignisseAssignment_50_0 )
                    // InternalAhnen.g:736:5: rule__Person__EreignisseAssignment_50_0
                    {
                    pushFollow(FOLLOW_4);
                    rule__Person__EreignisseAssignment_50_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPersonAccess().getEreignisseAssignment_50_0()); 

                    }

                    // InternalAhnen.g:739:3: ( ( rule__Person__EreignisseAssignment_50_0 )* )
                    // InternalAhnen.g:740:4: ( rule__Person__EreignisseAssignment_50_0 )*
                    {
                     before(grammarAccess.getPersonAccess().getEreignisseAssignment_50_0()); 
                    // InternalAhnen.g:741:4: ( rule__Person__EreignisseAssignment_50_0 )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==48||LA26_0==52) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalAhnen.g:741:5: rule__Person__EreignisseAssignment_50_0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__Person__EreignisseAssignment_50_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                     after(grammarAccess.getPersonAccess().getEreignisseAssignment_50_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:746:2: ( ( rule__Person__Group_50_1__0 ) )
                    {
                    // InternalAhnen.g:746:2: ( ( rule__Person__Group_50_1__0 ) )
                    // InternalAhnen.g:747:3: ( rule__Person__Group_50_1__0 )
                    {
                     before(grammarAccess.getPersonAccess().getGroup_50_1()); 
                    // InternalAhnen.g:748:3: ( rule__Person__Group_50_1__0 )
                    // InternalAhnen.g:748:4: rule__Person__Group_50_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Person__Group_50_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPersonAccess().getGroup_50_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Alternatives_50"


    // $ANTLR start "rule__Ereignis__Alternatives"
    // InternalAhnen.g:756:1: rule__Ereignis__Alternatives : ( ( ruleSchulausbildung ) | ( ruleTaetigkeit ) );
    public final void rule__Ereignis__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:760:1: ( ( ruleSchulausbildung ) | ( ruleTaetigkeit ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                alt28=1;
            }
            else if ( (LA28_0==52) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalAhnen.g:761:2: ( ruleSchulausbildung )
                    {
                    // InternalAhnen.g:761:2: ( ruleSchulausbildung )
                    // InternalAhnen.g:762:3: ruleSchulausbildung
                    {
                     before(grammarAccess.getEreignisAccess().getSchulausbildungParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSchulausbildung();

                    state._fsp--;

                     after(grammarAccess.getEreignisAccess().getSchulausbildungParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:767:2: ( ruleTaetigkeit )
                    {
                    // InternalAhnen.g:767:2: ( ruleTaetigkeit )
                    // InternalAhnen.g:768:3: ruleTaetigkeit
                    {
                     before(grammarAccess.getEreignisAccess().getTaetigkeitParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTaetigkeit();

                    state._fsp--;

                     after(grammarAccess.getEreignisAccess().getTaetigkeitParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ereignis__Alternatives"


    // $ANTLR start "rule__Schulausbildung__Alternatives_3"
    // InternalAhnen.g:777:1: rule__Schulausbildung__Alternatives_3 : ( ( ( rule__Schulausbildung__VonAssignment_3_0 )? ) | ( 'unbekannt' ) );
    public final void rule__Schulausbildung__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:781:1: ( ( ( rule__Schulausbildung__VonAssignment_3_0 )? ) | ( 'unbekannt' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_DATE||LA30_0==50) ) {
                alt30=1;
            }
            else if ( (LA30_0==12) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalAhnen.g:782:2: ( ( rule__Schulausbildung__VonAssignment_3_0 )? )
                    {
                    // InternalAhnen.g:782:2: ( ( rule__Schulausbildung__VonAssignment_3_0 )? )
                    // InternalAhnen.g:783:3: ( rule__Schulausbildung__VonAssignment_3_0 )?
                    {
                     before(grammarAccess.getSchulausbildungAccess().getVonAssignment_3_0()); 
                    // InternalAhnen.g:784:3: ( rule__Schulausbildung__VonAssignment_3_0 )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_DATE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalAhnen.g:784:4: rule__Schulausbildung__VonAssignment_3_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Schulausbildung__VonAssignment_3_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getSchulausbildungAccess().getVonAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:788:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:788:2: ( 'unbekannt' )
                    // InternalAhnen.g:789:3: 'unbekannt'
                    {
                     before(grammarAccess.getSchulausbildungAccess().getUnbekanntKeyword_3_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSchulausbildungAccess().getUnbekanntKeyword_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Alternatives_3"


    // $ANTLR start "rule__Schulausbildung__Alternatives_5"
    // InternalAhnen.g:798:1: rule__Schulausbildung__Alternatives_5 : ( ( ( rule__Schulausbildung__BisAssignment_5_0 )? ) | ( 'unbekannt' ) );
    public final void rule__Schulausbildung__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:802:1: ( ( ( rule__Schulausbildung__BisAssignment_5_0 )? ) | ( 'unbekannt' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_DATE||LA32_0==51) ) {
                alt32=1;
            }
            else if ( (LA32_0==12) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalAhnen.g:803:2: ( ( rule__Schulausbildung__BisAssignment_5_0 )? )
                    {
                    // InternalAhnen.g:803:2: ( ( rule__Schulausbildung__BisAssignment_5_0 )? )
                    // InternalAhnen.g:804:3: ( rule__Schulausbildung__BisAssignment_5_0 )?
                    {
                     before(grammarAccess.getSchulausbildungAccess().getBisAssignment_5_0()); 
                    // InternalAhnen.g:805:3: ( rule__Schulausbildung__BisAssignment_5_0 )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_DATE) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalAhnen.g:805:4: rule__Schulausbildung__BisAssignment_5_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Schulausbildung__BisAssignment_5_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getSchulausbildungAccess().getBisAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:809:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:809:2: ( 'unbekannt' )
                    // InternalAhnen.g:810:3: 'unbekannt'
                    {
                     before(grammarAccess.getSchulausbildungAccess().getUnbekanntKeyword_5_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSchulausbildungAccess().getUnbekanntKeyword_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Alternatives_5"


    // $ANTLR start "rule__Schulausbildung__Alternatives_7"
    // InternalAhnen.g:819:1: rule__Schulausbildung__Alternatives_7 : ( ( ( rule__Schulausbildung__AbschlussAssignment_7_0 )? ) | ( 'ohne' ) | ( 'abgebrochen' ) );
    public final void rule__Schulausbildung__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:823:1: ( ( ( rule__Schulausbildung__AbschlussAssignment_7_0 )? ) | ( 'ohne' ) | ( 'abgebrochen' ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 31:
                {
                alt34=1;
                }
                break;
            case 18:
                {
                alt34=2;
                }
                break;
            case 19:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalAhnen.g:824:2: ( ( rule__Schulausbildung__AbschlussAssignment_7_0 )? )
                    {
                    // InternalAhnen.g:824:2: ( ( rule__Schulausbildung__AbschlussAssignment_7_0 )? )
                    // InternalAhnen.g:825:3: ( rule__Schulausbildung__AbschlussAssignment_7_0 )?
                    {
                     before(grammarAccess.getSchulausbildungAccess().getAbschlussAssignment_7_0()); 
                    // InternalAhnen.g:826:3: ( rule__Schulausbildung__AbschlussAssignment_7_0 )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_STRING) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalAhnen.g:826:4: rule__Schulausbildung__AbschlussAssignment_7_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Schulausbildung__AbschlussAssignment_7_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getSchulausbildungAccess().getAbschlussAssignment_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:830:2: ( 'ohne' )
                    {
                    // InternalAhnen.g:830:2: ( 'ohne' )
                    // InternalAhnen.g:831:3: 'ohne'
                    {
                     before(grammarAccess.getSchulausbildungAccess().getOhneKeyword_7_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSchulausbildungAccess().getOhneKeyword_7_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAhnen.g:836:2: ( 'abgebrochen' )
                    {
                    // InternalAhnen.g:836:2: ( 'abgebrochen' )
                    // InternalAhnen.g:837:3: 'abgebrochen'
                    {
                     before(grammarAccess.getSchulausbildungAccess().getAbgebrochenKeyword_7_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSchulausbildungAccess().getAbgebrochenKeyword_7_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Alternatives_7"


    // $ANTLR start "rule__Taetigkeit__Alternatives_3"
    // InternalAhnen.g:846:1: rule__Taetigkeit__Alternatives_3 : ( ( ( rule__Taetigkeit__BerufAssignment_3_0 )? ) | ( 'unbekannt' ) );
    public final void rule__Taetigkeit__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:850:1: ( ( ( rule__Taetigkeit__BerufAssignment_3_0 )? ) | ( 'unbekannt' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING||LA36_0==54) ) {
                alt36=1;
            }
            else if ( (LA36_0==12) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalAhnen.g:851:2: ( ( rule__Taetigkeit__BerufAssignment_3_0 )? )
                    {
                    // InternalAhnen.g:851:2: ( ( rule__Taetigkeit__BerufAssignment_3_0 )? )
                    // InternalAhnen.g:852:3: ( rule__Taetigkeit__BerufAssignment_3_0 )?
                    {
                     before(grammarAccess.getTaetigkeitAccess().getBerufAssignment_3_0()); 
                    // InternalAhnen.g:853:3: ( rule__Taetigkeit__BerufAssignment_3_0 )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_STRING) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalAhnen.g:853:4: rule__Taetigkeit__BerufAssignment_3_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Taetigkeit__BerufAssignment_3_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getTaetigkeitAccess().getBerufAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:857:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:857:2: ( 'unbekannt' )
                    // InternalAhnen.g:858:3: 'unbekannt'
                    {
                     before(grammarAccess.getTaetigkeitAccess().getUnbekanntKeyword_3_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTaetigkeitAccess().getUnbekanntKeyword_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Alternatives_3"


    // $ANTLR start "rule__Taetigkeit__Alternatives_5"
    // InternalAhnen.g:867:1: rule__Taetigkeit__Alternatives_5 : ( ( ( rule__Taetigkeit__ArbeitgeberAssignment_5_0 )? ) | ( 'unbekannt' ) );
    public final void rule__Taetigkeit__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:871:1: ( ( ( rule__Taetigkeit__ArbeitgeberAssignment_5_0 )? ) | ( 'unbekannt' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING||LA38_0==55) ) {
                alt38=1;
            }
            else if ( (LA38_0==12) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalAhnen.g:872:2: ( ( rule__Taetigkeit__ArbeitgeberAssignment_5_0 )? )
                    {
                    // InternalAhnen.g:872:2: ( ( rule__Taetigkeit__ArbeitgeberAssignment_5_0 )? )
                    // InternalAhnen.g:873:3: ( rule__Taetigkeit__ArbeitgeberAssignment_5_0 )?
                    {
                     before(grammarAccess.getTaetigkeitAccess().getArbeitgeberAssignment_5_0()); 
                    // InternalAhnen.g:874:3: ( rule__Taetigkeit__ArbeitgeberAssignment_5_0 )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_STRING) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalAhnen.g:874:4: rule__Taetigkeit__ArbeitgeberAssignment_5_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Taetigkeit__ArbeitgeberAssignment_5_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getTaetigkeitAccess().getArbeitgeberAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:878:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:878:2: ( 'unbekannt' )
                    // InternalAhnen.g:879:3: 'unbekannt'
                    {
                     before(grammarAccess.getTaetigkeitAccess().getUnbekanntKeyword_5_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTaetigkeitAccess().getUnbekanntKeyword_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Alternatives_5"


    // $ANTLR start "rule__Taetigkeit__Alternatives_7"
    // InternalAhnen.g:888:1: rule__Taetigkeit__Alternatives_7 : ( ( ( rule__Taetigkeit__OrtAssignment_7_0 )? ) | ( 'unbekannt' ) );
    public final void rule__Taetigkeit__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:892:1: ( ( ( rule__Taetigkeit__OrtAssignment_7_0 )? ) | ( 'unbekannt' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING||LA40_0==49) ) {
                alt40=1;
            }
            else if ( (LA40_0==12) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalAhnen.g:893:2: ( ( rule__Taetigkeit__OrtAssignment_7_0 )? )
                    {
                    // InternalAhnen.g:893:2: ( ( rule__Taetigkeit__OrtAssignment_7_0 )? )
                    // InternalAhnen.g:894:3: ( rule__Taetigkeit__OrtAssignment_7_0 )?
                    {
                     before(grammarAccess.getTaetigkeitAccess().getOrtAssignment_7_0()); 
                    // InternalAhnen.g:895:3: ( rule__Taetigkeit__OrtAssignment_7_0 )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_STRING) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalAhnen.g:895:4: rule__Taetigkeit__OrtAssignment_7_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Taetigkeit__OrtAssignment_7_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getTaetigkeitAccess().getOrtAssignment_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:899:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:899:2: ( 'unbekannt' )
                    // InternalAhnen.g:900:3: 'unbekannt'
                    {
                     before(grammarAccess.getTaetigkeitAccess().getUnbekanntKeyword_7_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTaetigkeitAccess().getUnbekanntKeyword_7_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Alternatives_7"


    // $ANTLR start "rule__Taetigkeit__Alternatives_9"
    // InternalAhnen.g:909:1: rule__Taetigkeit__Alternatives_9 : ( ( ( rule__Taetigkeit__VonAssignment_9_0 )? ) | ( 'unbekannt' ) );
    public final void rule__Taetigkeit__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:913:1: ( ( ( rule__Taetigkeit__VonAssignment_9_0 )? ) | ( 'unbekannt' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_DATE||LA42_0==50) ) {
                alt42=1;
            }
            else if ( (LA42_0==12) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalAhnen.g:914:2: ( ( rule__Taetigkeit__VonAssignment_9_0 )? )
                    {
                    // InternalAhnen.g:914:2: ( ( rule__Taetigkeit__VonAssignment_9_0 )? )
                    // InternalAhnen.g:915:3: ( rule__Taetigkeit__VonAssignment_9_0 )?
                    {
                     before(grammarAccess.getTaetigkeitAccess().getVonAssignment_9_0()); 
                    // InternalAhnen.g:916:3: ( rule__Taetigkeit__VonAssignment_9_0 )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_DATE) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalAhnen.g:916:4: rule__Taetigkeit__VonAssignment_9_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Taetigkeit__VonAssignment_9_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getTaetigkeitAccess().getVonAssignment_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:920:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:920:2: ( 'unbekannt' )
                    // InternalAhnen.g:921:3: 'unbekannt'
                    {
                     before(grammarAccess.getTaetigkeitAccess().getUnbekanntKeyword_9_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTaetigkeitAccess().getUnbekanntKeyword_9_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Alternatives_9"


    // $ANTLR start "rule__Taetigkeit__Alternatives_11"
    // InternalAhnen.g:930:1: rule__Taetigkeit__Alternatives_11 : ( ( ( rule__Taetigkeit__BisAssignment_11_0 )? ) | ( 'unbekannt' ) );
    public final void rule__Taetigkeit__Alternatives_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:934:1: ( ( ( rule__Taetigkeit__BisAssignment_11_0 )? ) | ( 'unbekannt' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_DATE||LA44_0==31) ) {
                alt44=1;
            }
            else if ( (LA44_0==12) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalAhnen.g:935:2: ( ( rule__Taetigkeit__BisAssignment_11_0 )? )
                    {
                    // InternalAhnen.g:935:2: ( ( rule__Taetigkeit__BisAssignment_11_0 )? )
                    // InternalAhnen.g:936:3: ( rule__Taetigkeit__BisAssignment_11_0 )?
                    {
                     before(grammarAccess.getTaetigkeitAccess().getBisAssignment_11_0()); 
                    // InternalAhnen.g:937:3: ( rule__Taetigkeit__BisAssignment_11_0 )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_DATE) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalAhnen.g:937:4: rule__Taetigkeit__BisAssignment_11_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Taetigkeit__BisAssignment_11_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getTaetigkeitAccess().getBisAssignment_11_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:941:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:941:2: ( 'unbekannt' )
                    // InternalAhnen.g:942:3: 'unbekannt'
                    {
                     before(grammarAccess.getTaetigkeitAccess().getUnbekanntKeyword_11_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTaetigkeitAccess().getUnbekanntKeyword_11_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Alternatives_11"


    // $ANTLR start "rule__Kinder__Alternatives_1"
    // InternalAhnen.g:951:1: rule__Kinder__Alternatives_1 : ( ( ( rule__Kinder__KindAssignment_1_0 ) ) | ( 'unbekannt' ) | ( 'unerfasst' ) );
    public final void rule__Kinder__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:955:1: ( ( ( rule__Kinder__KindAssignment_1_0 ) ) | ( 'unbekannt' ) | ( 'unerfasst' ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt45=1;
                }
                break;
            case 12:
                {
                alt45=2;
                }
                break;
            case 16:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalAhnen.g:956:2: ( ( rule__Kinder__KindAssignment_1_0 ) )
                    {
                    // InternalAhnen.g:956:2: ( ( rule__Kinder__KindAssignment_1_0 ) )
                    // InternalAhnen.g:957:3: ( rule__Kinder__KindAssignment_1_0 )
                    {
                     before(grammarAccess.getKinderAccess().getKindAssignment_1_0()); 
                    // InternalAhnen.g:958:3: ( rule__Kinder__KindAssignment_1_0 )
                    // InternalAhnen.g:958:4: rule__Kinder__KindAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kinder__KindAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKinderAccess().getKindAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:962:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:962:2: ( 'unbekannt' )
                    // InternalAhnen.g:963:3: 'unbekannt'
                    {
                     before(grammarAccess.getKinderAccess().getUnbekanntKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getKinderAccess().getUnbekanntKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAhnen.g:968:2: ( 'unerfasst' )
                    {
                    // InternalAhnen.g:968:2: ( 'unerfasst' )
                    // InternalAhnen.g:969:3: 'unerfasst'
                    {
                     before(grammarAccess.getKinderAccess().getUnerfasstKeyword_1_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getKinderAccess().getUnerfasstKeyword_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinder__Alternatives_1"


    // $ANTLR start "rule__Beziehung__Alternatives_3"
    // InternalAhnen.g:978:1: rule__Beziehung__Alternatives_3 : ( ( ( rule__Beziehung__BeziehungAssignment_3_0 ) ) | ( 'unbekannt' ) | ( 'unerfasst' ) );
    public final void rule__Beziehung__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:982:1: ( ( ( rule__Beziehung__BeziehungAssignment_3_0 ) ) | ( 'unbekannt' ) | ( 'unerfasst' ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt46=1;
                }
                break;
            case 12:
                {
                alt46=2;
                }
                break;
            case 16:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalAhnen.g:983:2: ( ( rule__Beziehung__BeziehungAssignment_3_0 ) )
                    {
                    // InternalAhnen.g:983:2: ( ( rule__Beziehung__BeziehungAssignment_3_0 ) )
                    // InternalAhnen.g:984:3: ( rule__Beziehung__BeziehungAssignment_3_0 )
                    {
                     before(grammarAccess.getBeziehungAccess().getBeziehungAssignment_3_0()); 
                    // InternalAhnen.g:985:3: ( rule__Beziehung__BeziehungAssignment_3_0 )
                    // InternalAhnen.g:985:4: rule__Beziehung__BeziehungAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Beziehung__BeziehungAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBeziehungAccess().getBeziehungAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:989:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:989:2: ( 'unbekannt' )
                    // InternalAhnen.g:990:3: 'unbekannt'
                    {
                     before(grammarAccess.getBeziehungAccess().getUnbekanntKeyword_3_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBeziehungAccess().getUnbekanntKeyword_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAhnen.g:995:2: ( 'unerfasst' )
                    {
                    // InternalAhnen.g:995:2: ( 'unerfasst' )
                    // InternalAhnen.g:996:3: 'unerfasst'
                    {
                     before(grammarAccess.getBeziehungAccess().getUnerfasstKeyword_3_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBeziehungAccess().getUnerfasstKeyword_3_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Alternatives_3"


    // $ANTLR start "rule__Beziehung__Alternatives_6"
    // InternalAhnen.g:1005:1: rule__Beziehung__Alternatives_6 : ( ( ( rule__Beziehung__VonDatumAssignment_6_0 )? ) | ( 'unbekannt' ) );
    public final void rule__Beziehung__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1009:1: ( ( ( rule__Beziehung__VonDatumAssignment_6_0 )? ) | ( 'unbekannt' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_DATE||LA48_0==60) ) {
                alt48=1;
            }
            else if ( (LA48_0==12) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalAhnen.g:1010:2: ( ( rule__Beziehung__VonDatumAssignment_6_0 )? )
                    {
                    // InternalAhnen.g:1010:2: ( ( rule__Beziehung__VonDatumAssignment_6_0 )? )
                    // InternalAhnen.g:1011:3: ( rule__Beziehung__VonDatumAssignment_6_0 )?
                    {
                     before(grammarAccess.getBeziehungAccess().getVonDatumAssignment_6_0()); 
                    // InternalAhnen.g:1012:3: ( rule__Beziehung__VonDatumAssignment_6_0 )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_DATE) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalAhnen.g:1012:4: rule__Beziehung__VonDatumAssignment_6_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Beziehung__VonDatumAssignment_6_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getBeziehungAccess().getVonDatumAssignment_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:1016:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:1016:2: ( 'unbekannt' )
                    // InternalAhnen.g:1017:3: 'unbekannt'
                    {
                     before(grammarAccess.getBeziehungAccess().getUnbekanntKeyword_6_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBeziehungAccess().getUnbekanntKeyword_6_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Alternatives_6"


    // $ANTLR start "rule__Beziehung__Alternatives_8"
    // InternalAhnen.g:1026:1: rule__Beziehung__Alternatives_8 : ( ( ( rule__Beziehung__BisDatumAssignment_8_0 )? ) | ( 'unbekannt' ) | ( 'andauernd' ) );
    public final void rule__Beziehung__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1030:1: ( ( ( rule__Beziehung__BisDatumAssignment_8_0 )? ) | ( 'unbekannt' ) | ( 'andauernd' ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case RULE_DATE:
            case 31:
                {
                alt50=1;
                }
                break;
            case 12:
                {
                alt50=2;
                }
                break;
            case 20:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalAhnen.g:1031:2: ( ( rule__Beziehung__BisDatumAssignment_8_0 )? )
                    {
                    // InternalAhnen.g:1031:2: ( ( rule__Beziehung__BisDatumAssignment_8_0 )? )
                    // InternalAhnen.g:1032:3: ( rule__Beziehung__BisDatumAssignment_8_0 )?
                    {
                     before(grammarAccess.getBeziehungAccess().getBisDatumAssignment_8_0()); 
                    // InternalAhnen.g:1033:3: ( rule__Beziehung__BisDatumAssignment_8_0 )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_DATE) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalAhnen.g:1033:4: rule__Beziehung__BisDatumAssignment_8_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Beziehung__BisDatumAssignment_8_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getBeziehungAccess().getBisDatumAssignment_8_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:1037:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:1037:2: ( 'unbekannt' )
                    // InternalAhnen.g:1038:3: 'unbekannt'
                    {
                     before(grammarAccess.getBeziehungAccess().getUnbekanntKeyword_8_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBeziehungAccess().getUnbekanntKeyword_8_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAhnen.g:1043:2: ( 'andauernd' )
                    {
                    // InternalAhnen.g:1043:2: ( 'andauernd' )
                    // InternalAhnen.g:1044:3: 'andauernd'
                    {
                     before(grammarAccess.getBeziehungAccess().getAndauerndKeyword_8_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getBeziehungAccess().getAndauerndKeyword_8_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Alternatives_8"


    // $ANTLR start "rule__Beziehung__Alternatives_11"
    // InternalAhnen.g:1053:1: rule__Beziehung__Alternatives_11 : ( ( ( rule__Beziehung__HochzeitstagAssignment_11_0 )? ) | ( 'unbekannt' ) | ( '-' ) );
    public final void rule__Beziehung__Alternatives_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1057:1: ( ( ( rule__Beziehung__HochzeitstagAssignment_11_0 )? ) | ( 'unbekannt' ) | ( '-' ) )
            int alt52=3;
            switch ( input.LA(1) ) {
            case RULE_DATE:
            case 31:
                {
                alt52=1;
                }
                break;
            case 12:
                {
                alt52=2;
                }
                break;
            case 13:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalAhnen.g:1058:2: ( ( rule__Beziehung__HochzeitstagAssignment_11_0 )? )
                    {
                    // InternalAhnen.g:1058:2: ( ( rule__Beziehung__HochzeitstagAssignment_11_0 )? )
                    // InternalAhnen.g:1059:3: ( rule__Beziehung__HochzeitstagAssignment_11_0 )?
                    {
                     before(grammarAccess.getBeziehungAccess().getHochzeitstagAssignment_11_0()); 
                    // InternalAhnen.g:1060:3: ( rule__Beziehung__HochzeitstagAssignment_11_0 )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==RULE_DATE) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalAhnen.g:1060:4: rule__Beziehung__HochzeitstagAssignment_11_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Beziehung__HochzeitstagAssignment_11_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getBeziehungAccess().getHochzeitstagAssignment_11_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:1064:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:1064:2: ( 'unbekannt' )
                    // InternalAhnen.g:1065:3: 'unbekannt'
                    {
                     before(grammarAccess.getBeziehungAccess().getUnbekanntKeyword_11_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBeziehungAccess().getUnbekanntKeyword_11_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAhnen.g:1070:2: ( '-' )
                    {
                    // InternalAhnen.g:1070:2: ( '-' )
                    // InternalAhnen.g:1071:3: '-'
                    {
                     before(grammarAccess.getBeziehungAccess().getHyphenMinusKeyword_11_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBeziehungAccess().getHyphenMinusKeyword_11_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Alternatives_11"


    // $ANTLR start "rule__Beziehung__Alternatives_14"
    // InternalAhnen.g:1080:1: rule__Beziehung__Alternatives_14 : ( ( ( rule__Beziehung__ScheidungstagAssignment_14_0 )? ) | ( 'unbekannt' ) | ( 'unabsehbar' ) | ( 'demn\\u00E4chst' ) | ( '-' ) );
    public final void rule__Beziehung__Alternatives_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1084:1: ( ( ( rule__Beziehung__ScheidungstagAssignment_14_0 )? ) | ( 'unbekannt' ) | ( 'unabsehbar' ) | ( 'demn\\u00E4chst' ) | ( '-' ) )
            int alt54=5;
            switch ( input.LA(1) ) {
            case RULE_DATE:
            case 31:
                {
                alt54=1;
                }
                break;
            case 12:
                {
                alt54=2;
                }
                break;
            case 21:
                {
                alt54=3;
                }
                break;
            case 22:
                {
                alt54=4;
                }
                break;
            case 13:
                {
                alt54=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalAhnen.g:1085:2: ( ( rule__Beziehung__ScheidungstagAssignment_14_0 )? )
                    {
                    // InternalAhnen.g:1085:2: ( ( rule__Beziehung__ScheidungstagAssignment_14_0 )? )
                    // InternalAhnen.g:1086:3: ( rule__Beziehung__ScheidungstagAssignment_14_0 )?
                    {
                     before(grammarAccess.getBeziehungAccess().getScheidungstagAssignment_14_0()); 
                    // InternalAhnen.g:1087:3: ( rule__Beziehung__ScheidungstagAssignment_14_0 )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==RULE_DATE) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalAhnen.g:1087:4: rule__Beziehung__ScheidungstagAssignment_14_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__Beziehung__ScheidungstagAssignment_14_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getBeziehungAccess().getScheidungstagAssignment_14_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:1091:2: ( 'unbekannt' )
                    {
                    // InternalAhnen.g:1091:2: ( 'unbekannt' )
                    // InternalAhnen.g:1092:3: 'unbekannt'
                    {
                     before(grammarAccess.getBeziehungAccess().getUnbekanntKeyword_14_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBeziehungAccess().getUnbekanntKeyword_14_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAhnen.g:1097:2: ( 'unabsehbar' )
                    {
                    // InternalAhnen.g:1097:2: ( 'unabsehbar' )
                    // InternalAhnen.g:1098:3: 'unabsehbar'
                    {
                     before(grammarAccess.getBeziehungAccess().getUnabsehbarKeyword_14_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getBeziehungAccess().getUnabsehbarKeyword_14_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAhnen.g:1103:2: ( 'demn\\u00E4chst' )
                    {
                    // InternalAhnen.g:1103:2: ( 'demn\\u00E4chst' )
                    // InternalAhnen.g:1104:3: 'demn\\u00E4chst'
                    {
                     before(grammarAccess.getBeziehungAccess().getDemnächstKeyword_14_3()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getBeziehungAccess().getDemnächstKeyword_14_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAhnen.g:1109:2: ( '-' )
                    {
                    // InternalAhnen.g:1109:2: ( '-' )
                    // InternalAhnen.g:1110:3: '-'
                    {
                     before(grammarAccess.getBeziehungAccess().getHyphenMinusKeyword_14_4()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBeziehungAccess().getHyphenMinusKeyword_14_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Alternatives_14"


    // $ANTLR start "rule__Geschlecht__Alternatives"
    // InternalAhnen.g:1119:1: rule__Geschlecht__Alternatives : ( ( ( 'unbekannt' ) ) | ( ( 'm\\u00E4nnlich' ) ) | ( ( 'weiblich' ) ) );
    public final void rule__Geschlecht__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1123:1: ( ( ( 'unbekannt' ) ) | ( ( 'm\\u00E4nnlich' ) ) | ( ( 'weiblich' ) ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt55=1;
                }
                break;
            case 23:
                {
                alt55=2;
                }
                break;
            case 24:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalAhnen.g:1124:2: ( ( 'unbekannt' ) )
                    {
                    // InternalAhnen.g:1124:2: ( ( 'unbekannt' ) )
                    // InternalAhnen.g:1125:3: ( 'unbekannt' )
                    {
                     before(grammarAccess.getGeschlechtAccess().getUnbekanntEnumLiteralDeclaration_0()); 
                    // InternalAhnen.g:1126:3: ( 'unbekannt' )
                    // InternalAhnen.g:1126:4: 'unbekannt'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getGeschlechtAccess().getUnbekanntEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:1130:2: ( ( 'm\\u00E4nnlich' ) )
                    {
                    // InternalAhnen.g:1130:2: ( ( 'm\\u00E4nnlich' ) )
                    // InternalAhnen.g:1131:3: ( 'm\\u00E4nnlich' )
                    {
                     before(grammarAccess.getGeschlechtAccess().getMaennlichEnumLiteralDeclaration_1()); 
                    // InternalAhnen.g:1132:3: ( 'm\\u00E4nnlich' )
                    // InternalAhnen.g:1132:4: 'm\\u00E4nnlich'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getGeschlechtAccess().getMaennlichEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAhnen.g:1136:2: ( ( 'weiblich' ) )
                    {
                    // InternalAhnen.g:1136:2: ( ( 'weiblich' ) )
                    // InternalAhnen.g:1137:3: ( 'weiblich' )
                    {
                     before(grammarAccess.getGeschlechtAccess().getWeiblichEnumLiteralDeclaration_2()); 
                    // InternalAhnen.g:1138:3: ( 'weiblich' )
                    // InternalAhnen.g:1138:4: 'weiblich'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getGeschlechtAccess().getWeiblichEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geschlecht__Alternatives"


    // $ANTLR start "rule__Familie__Group__0"
    // InternalAhnen.g:1146:1: rule__Familie__Group__0 : rule__Familie__Group__0__Impl rule__Familie__Group__1 ;
    public final void rule__Familie__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1150:1: ( rule__Familie__Group__0__Impl rule__Familie__Group__1 )
            // InternalAhnen.g:1151:2: rule__Familie__Group__0__Impl rule__Familie__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Familie__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familie__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familie__Group__0"


    // $ANTLR start "rule__Familie__Group__0__Impl"
    // InternalAhnen.g:1158:1: rule__Familie__Group__0__Impl : ( () ) ;
    public final void rule__Familie__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1162:1: ( ( () ) )
            // InternalAhnen.g:1163:1: ( () )
            {
            // InternalAhnen.g:1163:1: ( () )
            // InternalAhnen.g:1164:2: ()
            {
             before(grammarAccess.getFamilieAccess().getFamilieAction_0()); 
            // InternalAhnen.g:1165:2: ()
            // InternalAhnen.g:1165:3: 
            {
            }

             after(grammarAccess.getFamilieAccess().getFamilieAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familie__Group__0__Impl"


    // $ANTLR start "rule__Familie__Group__1"
    // InternalAhnen.g:1173:1: rule__Familie__Group__1 : rule__Familie__Group__1__Impl rule__Familie__Group__2 ;
    public final void rule__Familie__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1177:1: ( rule__Familie__Group__1__Impl rule__Familie__Group__2 )
            // InternalAhnen.g:1178:2: rule__Familie__Group__1__Impl rule__Familie__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Familie__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familie__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familie__Group__1"


    // $ANTLR start "rule__Familie__Group__1__Impl"
    // InternalAhnen.g:1185:1: rule__Familie__Group__1__Impl : ( 'Familie' ) ;
    public final void rule__Familie__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1189:1: ( ( 'Familie' ) )
            // InternalAhnen.g:1190:1: ( 'Familie' )
            {
            // InternalAhnen.g:1190:1: ( 'Familie' )
            // InternalAhnen.g:1191:2: 'Familie'
            {
             before(grammarAccess.getFamilieAccess().getFamilieKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFamilieAccess().getFamilieKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familie__Group__1__Impl"


    // $ANTLR start "rule__Familie__Group__2"
    // InternalAhnen.g:1200:1: rule__Familie__Group__2 : rule__Familie__Group__2__Impl rule__Familie__Group__3 ;
    public final void rule__Familie__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1204:1: ( rule__Familie__Group__2__Impl rule__Familie__Group__3 )
            // InternalAhnen.g:1205:2: rule__Familie__Group__2__Impl rule__Familie__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Familie__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familie__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familie__Group__2"


    // $ANTLR start "rule__Familie__Group__2__Impl"
    // InternalAhnen.g:1212:1: rule__Familie__Group__2__Impl : ( ( rule__Familie__NameAssignment_2 ) ) ;
    public final void rule__Familie__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1216:1: ( ( ( rule__Familie__NameAssignment_2 ) ) )
            // InternalAhnen.g:1217:1: ( ( rule__Familie__NameAssignment_2 ) )
            {
            // InternalAhnen.g:1217:1: ( ( rule__Familie__NameAssignment_2 ) )
            // InternalAhnen.g:1218:2: ( rule__Familie__NameAssignment_2 )
            {
             before(grammarAccess.getFamilieAccess().getNameAssignment_2()); 
            // InternalAhnen.g:1219:2: ( rule__Familie__NameAssignment_2 )
            // InternalAhnen.g:1219:3: rule__Familie__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Familie__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFamilieAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familie__Group__2__Impl"


    // $ANTLR start "rule__Familie__Group__3"
    // InternalAhnen.g:1227:1: rule__Familie__Group__3 : rule__Familie__Group__3__Impl rule__Familie__Group__4 ;
    public final void rule__Familie__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1231:1: ( rule__Familie__Group__3__Impl rule__Familie__Group__4 )
            // InternalAhnen.g:1232:2: rule__Familie__Group__3__Impl rule__Familie__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Familie__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familie__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familie__Group__3"


    // $ANTLR start "rule__Familie__Group__3__Impl"
    // InternalAhnen.g:1239:1: rule__Familie__Group__3__Impl : ( ';' ) ;
    public final void rule__Familie__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1243:1: ( ( ';' ) )
            // InternalAhnen.g:1244:1: ( ';' )
            {
            // InternalAhnen.g:1244:1: ( ';' )
            // InternalAhnen.g:1245:2: ';'
            {
             before(grammarAccess.getFamilieAccess().getSemicolonKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFamilieAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familie__Group__3__Impl"


    // $ANTLR start "rule__Familie__Group__4"
    // InternalAhnen.g:1254:1: rule__Familie__Group__4 : rule__Familie__Group__4__Impl ;
    public final void rule__Familie__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1258:1: ( rule__Familie__Group__4__Impl )
            // InternalAhnen.g:1259:2: rule__Familie__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Familie__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familie__Group__4"


    // $ANTLR start "rule__Familie__Group__4__Impl"
    // InternalAhnen.g:1265:1: rule__Familie__Group__4__Impl : ( ( ( rule__Familie__PersonenAssignment_4 ) ) ( ( rule__Familie__PersonenAssignment_4 )* ) ) ;
    public final void rule__Familie__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1269:1: ( ( ( ( rule__Familie__PersonenAssignment_4 ) ) ( ( rule__Familie__PersonenAssignment_4 )* ) ) )
            // InternalAhnen.g:1270:1: ( ( ( rule__Familie__PersonenAssignment_4 ) ) ( ( rule__Familie__PersonenAssignment_4 )* ) )
            {
            // InternalAhnen.g:1270:1: ( ( ( rule__Familie__PersonenAssignment_4 ) ) ( ( rule__Familie__PersonenAssignment_4 )* ) )
            // InternalAhnen.g:1271:2: ( ( rule__Familie__PersonenAssignment_4 ) ) ( ( rule__Familie__PersonenAssignment_4 )* )
            {
            // InternalAhnen.g:1271:2: ( ( rule__Familie__PersonenAssignment_4 ) )
            // InternalAhnen.g:1272:3: ( rule__Familie__PersonenAssignment_4 )
            {
             before(grammarAccess.getFamilieAccess().getPersonenAssignment_4()); 
            // InternalAhnen.g:1273:3: ( rule__Familie__PersonenAssignment_4 )
            // InternalAhnen.g:1273:4: rule__Familie__PersonenAssignment_4
            {
            pushFollow(FOLLOW_9);
            rule__Familie__PersonenAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFamilieAccess().getPersonenAssignment_4()); 

            }

            // InternalAhnen.g:1276:2: ( ( rule__Familie__PersonenAssignment_4 )* )
            // InternalAhnen.g:1277:3: ( rule__Familie__PersonenAssignment_4 )*
            {
             before(grammarAccess.getFamilieAccess().getPersonenAssignment_4()); 
            // InternalAhnen.g:1278:3: ( rule__Familie__PersonenAssignment_4 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==27) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalAhnen.g:1278:4: rule__Familie__PersonenAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Familie__PersonenAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getFamilieAccess().getPersonenAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familie__Group__4__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalAhnen.g:1288:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1292:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalAhnen.g:1293:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalAhnen.g:1300:1: rule__Person__Group__0__Impl : ( () ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1304:1: ( ( () ) )
            // InternalAhnen.g:1305:1: ( () )
            {
            // InternalAhnen.g:1305:1: ( () )
            // InternalAhnen.g:1306:2: ()
            {
             before(grammarAccess.getPersonAccess().getPersonAction_0()); 
            // InternalAhnen.g:1307:2: ()
            // InternalAhnen.g:1307:3: 
            {
            }

             after(grammarAccess.getPersonAccess().getPersonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalAhnen.g:1315:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1319:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalAhnen.g:1320:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalAhnen.g:1327:1: rule__Person__Group__1__Impl : ( 'Person' ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1331:1: ( ( 'Person' ) )
            // InternalAhnen.g:1332:1: ( 'Person' )
            {
            // InternalAhnen.g:1332:1: ( 'Person' )
            // InternalAhnen.g:1333:2: 'Person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPersonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // InternalAhnen.g:1342:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1346:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalAhnen.g:1347:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Person__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // InternalAhnen.g:1354:1: rule__Person__Group__2__Impl : ( ( rule__Person__NameAssignment_2 ) ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1358:1: ( ( ( rule__Person__NameAssignment_2 ) ) )
            // InternalAhnen.g:1359:1: ( ( rule__Person__NameAssignment_2 ) )
            {
            // InternalAhnen.g:1359:1: ( ( rule__Person__NameAssignment_2 ) )
            // InternalAhnen.g:1360:2: ( rule__Person__NameAssignment_2 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_2()); 
            // InternalAhnen.g:1361:2: ( rule__Person__NameAssignment_2 )
            // InternalAhnen.g:1361:3: rule__Person__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__Person__Group__3"
    // InternalAhnen.g:1369:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1373:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalAhnen.g:1374:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Person__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__3"


    // $ANTLR start "rule__Person__Group__3__Impl"
    // InternalAhnen.g:1381:1: rule__Person__Group__3__Impl : ( '{' ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1385:1: ( ( '{' ) )
            // InternalAhnen.g:1386:1: ( '{' )
            {
            // InternalAhnen.g:1386:1: ( '{' )
            // InternalAhnen.g:1387:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__3__Impl"


    // $ANTLR start "rule__Person__Group__4"
    // InternalAhnen.g:1396:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1400:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalAhnen.g:1401:2: rule__Person__Group__4__Impl rule__Person__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Person__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__4"


    // $ANTLR start "rule__Person__Group__4__Impl"
    // InternalAhnen.g:1408:1: rule__Person__Group__4__Impl : ( 'Letzte' ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1412:1: ( ( 'Letzte' ) )
            // InternalAhnen.g:1413:1: ( 'Letzte' )
            {
            // InternalAhnen.g:1413:1: ( 'Letzte' )
            // InternalAhnen.g:1414:2: 'Letzte'
            {
             before(grammarAccess.getPersonAccess().getLetzteKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLetzteKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__4__Impl"


    // $ANTLR start "rule__Person__Group__5"
    // InternalAhnen.g:1423:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1427:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // InternalAhnen.g:1428:2: rule__Person__Group__5__Impl rule__Person__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Person__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__5"


    // $ANTLR start "rule__Person__Group__5__Impl"
    // InternalAhnen.g:1435:1: rule__Person__Group__5__Impl : ( '\\u00C4nderung:' ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1439:1: ( ( '\\u00C4nderung:' ) )
            // InternalAhnen.g:1440:1: ( '\\u00C4nderung:' )
            {
            // InternalAhnen.g:1440:1: ( '\\u00C4nderung:' )
            // InternalAhnen.g:1441:2: '\\u00C4nderung:'
            {
             before(grammarAccess.getPersonAccess().getÄnderungKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getÄnderungKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__5__Impl"


    // $ANTLR start "rule__Person__Group__6"
    // InternalAhnen.g:1450:1: rule__Person__Group__6 : rule__Person__Group__6__Impl rule__Person__Group__7 ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1454:1: ( rule__Person__Group__6__Impl rule__Person__Group__7 )
            // InternalAhnen.g:1455:2: rule__Person__Group__6__Impl rule__Person__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Person__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__6"


    // $ANTLR start "rule__Person__Group__6__Impl"
    // InternalAhnen.g:1462:1: rule__Person__Group__6__Impl : ( ( rule__Person__LetzteAenderungAssignment_6 ) ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1466:1: ( ( ( rule__Person__LetzteAenderungAssignment_6 ) ) )
            // InternalAhnen.g:1467:1: ( ( rule__Person__LetzteAenderungAssignment_6 ) )
            {
            // InternalAhnen.g:1467:1: ( ( rule__Person__LetzteAenderungAssignment_6 ) )
            // InternalAhnen.g:1468:2: ( rule__Person__LetzteAenderungAssignment_6 )
            {
             before(grammarAccess.getPersonAccess().getLetzteAenderungAssignment_6()); 
            // InternalAhnen.g:1469:2: ( rule__Person__LetzteAenderungAssignment_6 )
            // InternalAhnen.g:1469:3: rule__Person__LetzteAenderungAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Person__LetzteAenderungAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getLetzteAenderungAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__6__Impl"


    // $ANTLR start "rule__Person__Group__7"
    // InternalAhnen.g:1477:1: rule__Person__Group__7 : rule__Person__Group__7__Impl rule__Person__Group__8 ;
    public final void rule__Person__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1481:1: ( rule__Person__Group__7__Impl rule__Person__Group__8 )
            // InternalAhnen.g:1482:2: rule__Person__Group__7__Impl rule__Person__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Person__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__7"


    // $ANTLR start "rule__Person__Group__7__Impl"
    // InternalAhnen.g:1489:1: rule__Person__Group__7__Impl : ( '.' ) ;
    public final void rule__Person__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1493:1: ( ( '.' ) )
            // InternalAhnen.g:1494:1: ( '.' )
            {
            // InternalAhnen.g:1494:1: ( '.' )
            // InternalAhnen.g:1495:2: '.'
            {
             before(grammarAccess.getPersonAccess().getFullStopKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFullStopKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__7__Impl"


    // $ANTLR start "rule__Person__Group__8"
    // InternalAhnen.g:1504:1: rule__Person__Group__8 : rule__Person__Group__8__Impl rule__Person__Group__9 ;
    public final void rule__Person__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1508:1: ( rule__Person__Group__8__Impl rule__Person__Group__9 )
            // InternalAhnen.g:1509:2: rule__Person__Group__8__Impl rule__Person__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Person__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__8"


    // $ANTLR start "rule__Person__Group__8__Impl"
    // InternalAhnen.g:1516:1: rule__Person__Group__8__Impl : ( 'Vorname:' ) ;
    public final void rule__Person__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1520:1: ( ( 'Vorname:' ) )
            // InternalAhnen.g:1521:1: ( 'Vorname:' )
            {
            // InternalAhnen.g:1521:1: ( 'Vorname:' )
            // InternalAhnen.g:1522:2: 'Vorname:'
            {
             before(grammarAccess.getPersonAccess().getVornameKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getVornameKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__8__Impl"


    // $ANTLR start "rule__Person__Group__9"
    // InternalAhnen.g:1531:1: rule__Person__Group__9 : rule__Person__Group__9__Impl rule__Person__Group__10 ;
    public final void rule__Person__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1535:1: ( rule__Person__Group__9__Impl rule__Person__Group__10 )
            // InternalAhnen.g:1536:2: rule__Person__Group__9__Impl rule__Person__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__Person__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__9"


    // $ANTLR start "rule__Person__Group__9__Impl"
    // InternalAhnen.g:1543:1: rule__Person__Group__9__Impl : ( ( rule__Person__Alternatives_9 ) ) ;
    public final void rule__Person__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1547:1: ( ( ( rule__Person__Alternatives_9 ) ) )
            // InternalAhnen.g:1548:1: ( ( rule__Person__Alternatives_9 ) )
            {
            // InternalAhnen.g:1548:1: ( ( rule__Person__Alternatives_9 ) )
            // InternalAhnen.g:1549:2: ( rule__Person__Alternatives_9 )
            {
             before(grammarAccess.getPersonAccess().getAlternatives_9()); 
            // InternalAhnen.g:1550:2: ( rule__Person__Alternatives_9 )
            // InternalAhnen.g:1550:3: rule__Person__Alternatives_9
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives_9();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__9__Impl"


    // $ANTLR start "rule__Person__Group__10"
    // InternalAhnen.g:1558:1: rule__Person__Group__10 : rule__Person__Group__10__Impl rule__Person__Group__11 ;
    public final void rule__Person__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1562:1: ( rule__Person__Group__10__Impl rule__Person__Group__11 )
            // InternalAhnen.g:1563:2: rule__Person__Group__10__Impl rule__Person__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__Person__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__10"


    // $ANTLR start "rule__Person__Group__10__Impl"
    // InternalAhnen.g:1570:1: rule__Person__Group__10__Impl : ( '.' ) ;
    public final void rule__Person__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1574:1: ( ( '.' ) )
            // InternalAhnen.g:1575:1: ( '.' )
            {
            // InternalAhnen.g:1575:1: ( '.' )
            // InternalAhnen.g:1576:2: '.'
            {
             before(grammarAccess.getPersonAccess().getFullStopKeyword_10()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFullStopKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__10__Impl"


    // $ANTLR start "rule__Person__Group__11"
    // InternalAhnen.g:1585:1: rule__Person__Group__11 : rule__Person__Group__11__Impl rule__Person__Group__12 ;
    public final void rule__Person__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1589:1: ( rule__Person__Group__11__Impl rule__Person__Group__12 )
            // InternalAhnen.g:1590:2: rule__Person__Group__11__Impl rule__Person__Group__12
            {
            pushFollow(FOLLOW_19);
            rule__Person__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__11"


    // $ANTLR start "rule__Person__Group__11__Impl"
    // InternalAhnen.g:1597:1: rule__Person__Group__11__Impl : ( 'Mittelname:' ) ;
    public final void rule__Person__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1601:1: ( ( 'Mittelname:' ) )
            // InternalAhnen.g:1602:1: ( 'Mittelname:' )
            {
            // InternalAhnen.g:1602:1: ( 'Mittelname:' )
            // InternalAhnen.g:1603:2: 'Mittelname:'
            {
             before(grammarAccess.getPersonAccess().getMittelnameKeyword_11()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getMittelnameKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__11__Impl"


    // $ANTLR start "rule__Person__Group__12"
    // InternalAhnen.g:1612:1: rule__Person__Group__12 : rule__Person__Group__12__Impl rule__Person__Group__13 ;
    public final void rule__Person__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1616:1: ( rule__Person__Group__12__Impl rule__Person__Group__13 )
            // InternalAhnen.g:1617:2: rule__Person__Group__12__Impl rule__Person__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__Person__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__12"


    // $ANTLR start "rule__Person__Group__12__Impl"
    // InternalAhnen.g:1624:1: rule__Person__Group__12__Impl : ( ( rule__Person__Alternatives_12 ) ) ;
    public final void rule__Person__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1628:1: ( ( ( rule__Person__Alternatives_12 ) ) )
            // InternalAhnen.g:1629:1: ( ( rule__Person__Alternatives_12 ) )
            {
            // InternalAhnen.g:1629:1: ( ( rule__Person__Alternatives_12 ) )
            // InternalAhnen.g:1630:2: ( rule__Person__Alternatives_12 )
            {
             before(grammarAccess.getPersonAccess().getAlternatives_12()); 
            // InternalAhnen.g:1631:2: ( rule__Person__Alternatives_12 )
            // InternalAhnen.g:1631:3: rule__Person__Alternatives_12
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives_12();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__12__Impl"


    // $ANTLR start "rule__Person__Group__13"
    // InternalAhnen.g:1639:1: rule__Person__Group__13 : rule__Person__Group__13__Impl rule__Person__Group__14 ;
    public final void rule__Person__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1643:1: ( rule__Person__Group__13__Impl rule__Person__Group__14 )
            // InternalAhnen.g:1644:2: rule__Person__Group__13__Impl rule__Person__Group__14
            {
            pushFollow(FOLLOW_20);
            rule__Person__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__13"


    // $ANTLR start "rule__Person__Group__13__Impl"
    // InternalAhnen.g:1651:1: rule__Person__Group__13__Impl : ( '.' ) ;
    public final void rule__Person__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1655:1: ( ( '.' ) )
            // InternalAhnen.g:1656:1: ( '.' )
            {
            // InternalAhnen.g:1656:1: ( '.' )
            // InternalAhnen.g:1657:2: '.'
            {
             before(grammarAccess.getPersonAccess().getFullStopKeyword_13()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFullStopKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__13__Impl"


    // $ANTLR start "rule__Person__Group__14"
    // InternalAhnen.g:1666:1: rule__Person__Group__14 : rule__Person__Group__14__Impl rule__Person__Group__15 ;
    public final void rule__Person__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1670:1: ( rule__Person__Group__14__Impl rule__Person__Group__15 )
            // InternalAhnen.g:1671:2: rule__Person__Group__14__Impl rule__Person__Group__15
            {
            pushFollow(FOLLOW_17);
            rule__Person__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__14"


    // $ANTLR start "rule__Person__Group__14__Impl"
    // InternalAhnen.g:1678:1: rule__Person__Group__14__Impl : ( 'Nachname:' ) ;
    public final void rule__Person__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1682:1: ( ( 'Nachname:' ) )
            // InternalAhnen.g:1683:1: ( 'Nachname:' )
            {
            // InternalAhnen.g:1683:1: ( 'Nachname:' )
            // InternalAhnen.g:1684:2: 'Nachname:'
            {
             before(grammarAccess.getPersonAccess().getNachnameKeyword_14()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getNachnameKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__14__Impl"


    // $ANTLR start "rule__Person__Group__15"
    // InternalAhnen.g:1693:1: rule__Person__Group__15 : rule__Person__Group__15__Impl rule__Person__Group__16 ;
    public final void rule__Person__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1697:1: ( rule__Person__Group__15__Impl rule__Person__Group__16 )
            // InternalAhnen.g:1698:2: rule__Person__Group__15__Impl rule__Person__Group__16
            {
            pushFollow(FOLLOW_15);
            rule__Person__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__15"


    // $ANTLR start "rule__Person__Group__15__Impl"
    // InternalAhnen.g:1705:1: rule__Person__Group__15__Impl : ( ( rule__Person__Alternatives_15 ) ) ;
    public final void rule__Person__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1709:1: ( ( ( rule__Person__Alternatives_15 ) ) )
            // InternalAhnen.g:1710:1: ( ( rule__Person__Alternatives_15 ) )
            {
            // InternalAhnen.g:1710:1: ( ( rule__Person__Alternatives_15 ) )
            // InternalAhnen.g:1711:2: ( rule__Person__Alternatives_15 )
            {
             before(grammarAccess.getPersonAccess().getAlternatives_15()); 
            // InternalAhnen.g:1712:2: ( rule__Person__Alternatives_15 )
            // InternalAhnen.g:1712:3: rule__Person__Alternatives_15
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives_15();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__15__Impl"


    // $ANTLR start "rule__Person__Group__16"
    // InternalAhnen.g:1720:1: rule__Person__Group__16 : rule__Person__Group__16__Impl rule__Person__Group__17 ;
    public final void rule__Person__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1724:1: ( rule__Person__Group__16__Impl rule__Person__Group__17 )
            // InternalAhnen.g:1725:2: rule__Person__Group__16__Impl rule__Person__Group__17
            {
            pushFollow(FOLLOW_21);
            rule__Person__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__16"


    // $ANTLR start "rule__Person__Group__16__Impl"
    // InternalAhnen.g:1732:1: rule__Person__Group__16__Impl : ( '.' ) ;
    public final void rule__Person__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1736:1: ( ( '.' ) )
            // InternalAhnen.g:1737:1: ( '.' )
            {
            // InternalAhnen.g:1737:1: ( '.' )
            // InternalAhnen.g:1738:2: '.'
            {
             before(grammarAccess.getPersonAccess().getFullStopKeyword_16()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFullStopKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__16__Impl"


    // $ANTLR start "rule__Person__Group__17"
    // InternalAhnen.g:1747:1: rule__Person__Group__17 : rule__Person__Group__17__Impl rule__Person__Group__18 ;
    public final void rule__Person__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1751:1: ( rule__Person__Group__17__Impl rule__Person__Group__18 )
            // InternalAhnen.g:1752:2: rule__Person__Group__17__Impl rule__Person__Group__18
            {
            pushFollow(FOLLOW_17);
            rule__Person__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__17"


    // $ANTLR start "rule__Person__Group__17__Impl"
    // InternalAhnen.g:1759:1: rule__Person__Group__17__Impl : ( 'Geburtsname:' ) ;
    public final void rule__Person__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1763:1: ( ( 'Geburtsname:' ) )
            // InternalAhnen.g:1764:1: ( 'Geburtsname:' )
            {
            // InternalAhnen.g:1764:1: ( 'Geburtsname:' )
            // InternalAhnen.g:1765:2: 'Geburtsname:'
            {
             before(grammarAccess.getPersonAccess().getGeburtsnameKeyword_17()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getGeburtsnameKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__17__Impl"


    // $ANTLR start "rule__Person__Group__18"
    // InternalAhnen.g:1774:1: rule__Person__Group__18 : rule__Person__Group__18__Impl rule__Person__Group__19 ;
    public final void rule__Person__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1778:1: ( rule__Person__Group__18__Impl rule__Person__Group__19 )
            // InternalAhnen.g:1779:2: rule__Person__Group__18__Impl rule__Person__Group__19
            {
            pushFollow(FOLLOW_15);
            rule__Person__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__18"


    // $ANTLR start "rule__Person__Group__18__Impl"
    // InternalAhnen.g:1786:1: rule__Person__Group__18__Impl : ( ( rule__Person__Alternatives_18 ) ) ;
    public final void rule__Person__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1790:1: ( ( ( rule__Person__Alternatives_18 ) ) )
            // InternalAhnen.g:1791:1: ( ( rule__Person__Alternatives_18 ) )
            {
            // InternalAhnen.g:1791:1: ( ( rule__Person__Alternatives_18 ) )
            // InternalAhnen.g:1792:2: ( rule__Person__Alternatives_18 )
            {
             before(grammarAccess.getPersonAccess().getAlternatives_18()); 
            // InternalAhnen.g:1793:2: ( rule__Person__Alternatives_18 )
            // InternalAhnen.g:1793:3: rule__Person__Alternatives_18
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives_18();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__18__Impl"


    // $ANTLR start "rule__Person__Group__19"
    // InternalAhnen.g:1801:1: rule__Person__Group__19 : rule__Person__Group__19__Impl rule__Person__Group__20 ;
    public final void rule__Person__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1805:1: ( rule__Person__Group__19__Impl rule__Person__Group__20 )
            // InternalAhnen.g:1806:2: rule__Person__Group__19__Impl rule__Person__Group__20
            {
            pushFollow(FOLLOW_22);
            rule__Person__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__19"


    // $ANTLR start "rule__Person__Group__19__Impl"
    // InternalAhnen.g:1813:1: rule__Person__Group__19__Impl : ( '.' ) ;
    public final void rule__Person__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1817:1: ( ( '.' ) )
            // InternalAhnen.g:1818:1: ( '.' )
            {
            // InternalAhnen.g:1818:1: ( '.' )
            // InternalAhnen.g:1819:2: '.'
            {
             before(grammarAccess.getPersonAccess().getFullStopKeyword_19()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFullStopKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__19__Impl"


    // $ANTLR start "rule__Person__Group__20"
    // InternalAhnen.g:1828:1: rule__Person__Group__20 : rule__Person__Group__20__Impl rule__Person__Group__21 ;
    public final void rule__Person__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1832:1: ( rule__Person__Group__20__Impl rule__Person__Group__21 )
            // InternalAhnen.g:1833:2: rule__Person__Group__20__Impl rule__Person__Group__21
            {
            pushFollow(FOLLOW_17);
            rule__Person__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__20"


    // $ANTLR start "rule__Person__Group__20__Impl"
    // InternalAhnen.g:1840:1: rule__Person__Group__20__Impl : ( 'Rufname:' ) ;
    public final void rule__Person__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1844:1: ( ( 'Rufname:' ) )
            // InternalAhnen.g:1845:1: ( 'Rufname:' )
            {
            // InternalAhnen.g:1845:1: ( 'Rufname:' )
            // InternalAhnen.g:1846:2: 'Rufname:'
            {
             before(grammarAccess.getPersonAccess().getRufnameKeyword_20()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRufnameKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__20__Impl"


    // $ANTLR start "rule__Person__Group__21"
    // InternalAhnen.g:1855:1: rule__Person__Group__21 : rule__Person__Group__21__Impl rule__Person__Group__22 ;
    public final void rule__Person__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1859:1: ( rule__Person__Group__21__Impl rule__Person__Group__22 )
            // InternalAhnen.g:1860:2: rule__Person__Group__21__Impl rule__Person__Group__22
            {
            pushFollow(FOLLOW_15);
            rule__Person__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__21"


    // $ANTLR start "rule__Person__Group__21__Impl"
    // InternalAhnen.g:1867:1: rule__Person__Group__21__Impl : ( ( rule__Person__Alternatives_21 ) ) ;
    public final void rule__Person__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1871:1: ( ( ( rule__Person__Alternatives_21 ) ) )
            // InternalAhnen.g:1872:1: ( ( rule__Person__Alternatives_21 ) )
            {
            // InternalAhnen.g:1872:1: ( ( rule__Person__Alternatives_21 ) )
            // InternalAhnen.g:1873:2: ( rule__Person__Alternatives_21 )
            {
             before(grammarAccess.getPersonAccess().getAlternatives_21()); 
            // InternalAhnen.g:1874:2: ( rule__Person__Alternatives_21 )
            // InternalAhnen.g:1874:3: rule__Person__Alternatives_21
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives_21();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__21__Impl"


    // $ANTLR start "rule__Person__Group__22"
    // InternalAhnen.g:1882:1: rule__Person__Group__22 : rule__Person__Group__22__Impl rule__Person__Group__23 ;
    public final void rule__Person__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1886:1: ( rule__Person__Group__22__Impl rule__Person__Group__23 )
            // InternalAhnen.g:1887:2: rule__Person__Group__22__Impl rule__Person__Group__23
            {
            pushFollow(FOLLOW_23);
            rule__Person__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__22"


    // $ANTLR start "rule__Person__Group__22__Impl"
    // InternalAhnen.g:1894:1: rule__Person__Group__22__Impl : ( '.' ) ;
    public final void rule__Person__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1898:1: ( ( '.' ) )
            // InternalAhnen.g:1899:1: ( '.' )
            {
            // InternalAhnen.g:1899:1: ( '.' )
            // InternalAhnen.g:1900:2: '.'
            {
             before(grammarAccess.getPersonAccess().getFullStopKeyword_22()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFullStopKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__22__Impl"


    // $ANTLR start "rule__Person__Group__23"
    // InternalAhnen.g:1909:1: rule__Person__Group__23 : rule__Person__Group__23__Impl rule__Person__Group__24 ;
    public final void rule__Person__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1913:1: ( rule__Person__Group__23__Impl rule__Person__Group__24 )
            // InternalAhnen.g:1914:2: rule__Person__Group__23__Impl rule__Person__Group__24
            {
            pushFollow(FOLLOW_24);
            rule__Person__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__23"


    // $ANTLR start "rule__Person__Group__23__Impl"
    // InternalAhnen.g:1921:1: rule__Person__Group__23__Impl : ( 'Geschlecht:' ) ;
    public final void rule__Person__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1925:1: ( ( 'Geschlecht:' ) )
            // InternalAhnen.g:1926:1: ( 'Geschlecht:' )
            {
            // InternalAhnen.g:1926:1: ( 'Geschlecht:' )
            // InternalAhnen.g:1927:2: 'Geschlecht:'
            {
             before(grammarAccess.getPersonAccess().getGeschlechtKeyword_23()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getGeschlechtKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__23__Impl"


    // $ANTLR start "rule__Person__Group__24"
    // InternalAhnen.g:1936:1: rule__Person__Group__24 : rule__Person__Group__24__Impl rule__Person__Group__25 ;
    public final void rule__Person__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1940:1: ( rule__Person__Group__24__Impl rule__Person__Group__25 )
            // InternalAhnen.g:1941:2: rule__Person__Group__24__Impl rule__Person__Group__25
            {
            pushFollow(FOLLOW_24);
            rule__Person__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__24"


    // $ANTLR start "rule__Person__Group__24__Impl"
    // InternalAhnen.g:1948:1: rule__Person__Group__24__Impl : ( ( rule__Person__GeschlechtAssignment_24 )? ) ;
    public final void rule__Person__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1952:1: ( ( ( rule__Person__GeschlechtAssignment_24 )? ) )
            // InternalAhnen.g:1953:1: ( ( rule__Person__GeschlechtAssignment_24 )? )
            {
            // InternalAhnen.g:1953:1: ( ( rule__Person__GeschlechtAssignment_24 )? )
            // InternalAhnen.g:1954:2: ( rule__Person__GeschlechtAssignment_24 )?
            {
             before(grammarAccess.getPersonAccess().getGeschlechtAssignment_24()); 
            // InternalAhnen.g:1955:2: ( rule__Person__GeschlechtAssignment_24 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==12||(LA57_0>=23 && LA57_0<=24)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAhnen.g:1955:3: rule__Person__GeschlechtAssignment_24
                    {
                    pushFollow(FOLLOW_2);
                    rule__Person__GeschlechtAssignment_24();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonAccess().getGeschlechtAssignment_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__24__Impl"


    // $ANTLR start "rule__Person__Group__25"
    // InternalAhnen.g:1963:1: rule__Person__Group__25 : rule__Person__Group__25__Impl rule__Person__Group__26 ;
    public final void rule__Person__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1967:1: ( rule__Person__Group__25__Impl rule__Person__Group__26 )
            // InternalAhnen.g:1968:2: rule__Person__Group__25__Impl rule__Person__Group__26
            {
            pushFollow(FOLLOW_25);
            rule__Person__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__25"


    // $ANTLR start "rule__Person__Group__25__Impl"
    // InternalAhnen.g:1975:1: rule__Person__Group__25__Impl : ( '.' ) ;
    public final void rule__Person__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1979:1: ( ( '.' ) )
            // InternalAhnen.g:1980:1: ( '.' )
            {
            // InternalAhnen.g:1980:1: ( '.' )
            // InternalAhnen.g:1981:2: '.'
            {
             before(grammarAccess.getPersonAccess().getFullStopKeyword_25()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFullStopKeyword_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__25__Impl"


    // $ANTLR start "rule__Person__Group__26"
    // InternalAhnen.g:1990:1: rule__Person__Group__26 : rule__Person__Group__26__Impl rule__Person__Group__27 ;
    public final void rule__Person__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:1994:1: ( rule__Person__Group__26__Impl rule__Person__Group__27 )
            // InternalAhnen.g:1995:2: rule__Person__Group__26__Impl rule__Person__Group__27
            {
            pushFollow(FOLLOW_26);
            rule__Person__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__26"


    // $ANTLR start "rule__Person__Group__26__Impl"
    // InternalAhnen.g:2002:1: rule__Person__Group__26__Impl : ( 'Geburtsdatum:' ) ;
    public final void rule__Person__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2006:1: ( ( 'Geburtsdatum:' ) )
            // InternalAhnen.g:2007:1: ( 'Geburtsdatum:' )
            {
            // InternalAhnen.g:2007:1: ( 'Geburtsdatum:' )
            // InternalAhnen.g:2008:2: 'Geburtsdatum:'
            {
             before(grammarAccess.getPersonAccess().getGeburtsdatumKeyword_26()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getGeburtsdatumKeyword_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__26__Impl"


    // $ANTLR start "rule__Person__Group__27"
    // InternalAhnen.g:2017:1: rule__Person__Group__27 : rule__Person__Group__27__Impl rule__Person__Group__28 ;
    public final void rule__Person__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2021:1: ( rule__Person__Group__27__Impl rule__Person__Group__28 )
            // InternalAhnen.g:2022:2: rule__Person__Group__27__Impl rule__Person__Group__28
            {
            pushFollow(FOLLOW_15);
            rule__Person__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__28();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__27"


    // $ANTLR start "rule__Person__Group__27__Impl"
    // InternalAhnen.g:2029:1: rule__Person__Group__27__Impl : ( ( rule__Person__Alternatives_27 ) ) ;
    public final void rule__Person__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2033:1: ( ( ( rule__Person__Alternatives_27 ) ) )
            // InternalAhnen.g:2034:1: ( ( rule__Person__Alternatives_27 ) )
            {
            // InternalAhnen.g:2034:1: ( ( rule__Person__Alternatives_27 ) )
            // InternalAhnen.g:2035:2: ( rule__Person__Alternatives_27 )
            {
             before(grammarAccess.getPersonAccess().getAlternatives_27()); 
            // InternalAhnen.g:2036:2: ( rule__Person__Alternatives_27 )
            // InternalAhnen.g:2036:3: rule__Person__Alternatives_27
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives_27();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__27__Impl"


    // $ANTLR start "rule__Person__Group__28"
    // InternalAhnen.g:2044:1: rule__Person__Group__28 : rule__Person__Group__28__Impl rule__Person__Group__29 ;
    public final void rule__Person__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2048:1: ( rule__Person__Group__28__Impl rule__Person__Group__29 )
            // InternalAhnen.g:2049:2: rule__Person__Group__28__Impl rule__Person__Group__29
            {
            pushFollow(FOLLOW_27);
            rule__Person__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__29();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__28"


    // $ANTLR start "rule__Person__Group__28__Impl"
    // InternalAhnen.g:2056:1: rule__Person__Group__28__Impl : ( '.' ) ;
    public final void rule__Person__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2060:1: ( ( '.' ) )
            // InternalAhnen.g:2061:1: ( '.' )
            {
            // InternalAhnen.g:2061:1: ( '.' )
            // InternalAhnen.g:2062:2: '.'
            {
             before(grammarAccess.getPersonAccess().getFullStopKeyword_28()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFullStopKeyword_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__28__Impl"


    // $ANTLR start "rule__Person__Group__29"
    // InternalAhnen.g:2071:1: rule__Person__Group__29 : rule__Person__Group__29__Impl rule__Person__Group__30 ;
    public final void rule__Person__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2075:1: ( rule__Person__Group__29__Impl rule__Person__Group__30 )
            // InternalAhnen.g:2076:2: rule__Person__Group__29__Impl rule__Person__Group__30
            {
            pushFollow(FOLLOW_28);
            rule__Person__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__30();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__29"


    // $ANTLR start "rule__Person__Group__29__Impl"
    // InternalAhnen.g:2083:1: rule__Person__Group__29__Impl : ( 'Todesdatum:' ) ;
    public final void rule__Person__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2087:1: ( ( 'Todesdatum:' ) )
            // InternalAhnen.g:2088:1: ( 'Todesdatum:' )
            {
            // InternalAhnen.g:2088:1: ( 'Todesdatum:' )
            // InternalAhnen.g:2089:2: 'Todesdatum:'
            {
             before(grammarAccess.getPersonAccess().getTodesdatumKeyword_29()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getTodesdatumKeyword_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__29__Impl"


    // $ANTLR start "rule__Person__Group__30"
    // InternalAhnen.g:2098:1: rule__Person__Group__30 : rule__Person__Group__30__Impl rule__Person__Group__31 ;
    public final void rule__Person__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2102:1: ( rule__Person__Group__30__Impl rule__Person__Group__31 )
            // InternalAhnen.g:2103:2: rule__Person__Group__30__Impl rule__Person__Group__31
            {
            pushFollow(FOLLOW_15);
            rule__Person__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__31();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__30"


    // $ANTLR start "rule__Person__Group__30__Impl"
    // InternalAhnen.g:2110:1: rule__Person__Group__30__Impl : ( ( rule__Person__Alternatives_30 ) ) ;
    public final void rule__Person__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2114:1: ( ( ( rule__Person__Alternatives_30 ) ) )
            // InternalAhnen.g:2115:1: ( ( rule__Person__Alternatives_30 ) )
            {
            // InternalAhnen.g:2115:1: ( ( rule__Person__Alternatives_30 ) )
            // InternalAhnen.g:2116:2: ( rule__Person__Alternatives_30 )
            {
             before(grammarAccess.getPersonAccess().getAlternatives_30()); 
            // InternalAhnen.g:2117:2: ( rule__Person__Alternatives_30 )
            // InternalAhnen.g:2117:3: rule__Person__Alternatives_30
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives_30();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives_30()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__30__Impl"


    // $ANTLR start "rule__Person__Group__31"
    // InternalAhnen.g:2125:1: rule__Person__Group__31 : rule__Person__Group__31__Impl rule__Person__Group__32 ;
    public final void rule__Person__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2129:1: ( rule__Person__Group__31__Impl rule__Person__Group__32 )
            // InternalAhnen.g:2130:2: rule__Person__Group__31__Impl rule__Person__Group__32
            {
            pushFollow(FOLLOW_29);
            rule__Person__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__32();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__31"


    // $ANTLR start "rule__Person__Group__31__Impl"
    // InternalAhnen.g:2137:1: rule__Person__Group__31__Impl : ( '.' ) ;
    public final void rule__Person__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2141:1: ( ( '.' ) )
            // InternalAhnen.g:2142:1: ( '.' )
            {
            // InternalAhnen.g:2142:1: ( '.' )
            // InternalAhnen.g:2143:2: '.'
            {
             before(grammarAccess.getPersonAccess().getFullStopKeyword_31()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFullStopKeyword_31()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__31__Impl"


    // $ANTLR start "rule__Person__Group__32"
    // InternalAhnen.g:2152:1: rule__Person__Group__32 : rule__Person__Group__32__Impl rule__Person__Group__33 ;
    public final void rule__Person__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2156:1: ( rule__Person__Group__32__Impl rule__Person__Group__33 )
            // InternalAhnen.g:2157:2: rule__Person__Group__32__Impl rule__Person__Group__33
            {
            pushFollow(FOLLOW_30);
            rule__Person__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__33();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__32"


    // $ANTLR start "rule__Person__Group__32__Impl"
    // InternalAhnen.g:2164:1: rule__Person__Group__32__Impl : ( 'Vater:' ) ;
    public final void rule__Person__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2168:1: ( ( 'Vater:' ) )
            // InternalAhnen.g:2169:1: ( 'Vater:' )
            {
            // InternalAhnen.g:2169:1: ( 'Vater:' )
            // InternalAhnen.g:2170:2: 'Vater:'
            {
             before(grammarAccess.getPersonAccess().getVaterKeyword_32()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getVaterKeyword_32()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__32__Impl"


    // $ANTLR start "rule__Person__Group__33"
    // InternalAhnen.g:2179:1: rule__Person__Group__33 : rule__Person__Group__33__Impl rule__Person__Group__34 ;
    public final void rule__Person__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2183:1: ( rule__Person__Group__33__Impl rule__Person__Group__34 )
            // InternalAhnen.g:2184:2: rule__Person__Group__33__Impl rule__Person__Group__34
            {
            pushFollow(FOLLOW_15);
            rule__Person__Group__33__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__34();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__33"


    // $ANTLR start "rule__Person__Group__33__Impl"
    // InternalAhnen.g:2191:1: rule__Person__Group__33__Impl : ( ( rule__Person__Alternatives_33 ) ) ;
    public final void rule__Person__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2195:1: ( ( ( rule__Person__Alternatives_33 ) ) )
            // InternalAhnen.g:2196:1: ( ( rule__Person__Alternatives_33 ) )
            {
            // InternalAhnen.g:2196:1: ( ( rule__Person__Alternatives_33 ) )
            // InternalAhnen.g:2197:2: ( rule__Person__Alternatives_33 )
            {
             before(grammarAccess.getPersonAccess().getAlternatives_33()); 
            // InternalAhnen.g:2198:2: ( rule__Person__Alternatives_33 )
            // InternalAhnen.g:2198:3: rule__Person__Alternatives_33
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives_33();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives_33()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__33__Impl"


    // $ANTLR start "rule__Person__Group__34"
    // InternalAhnen.g:2206:1: rule__Person__Group__34 : rule__Person__Group__34__Impl rule__Person__Group__35 ;
    public final void rule__Person__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2210:1: ( rule__Person__Group__34__Impl rule__Person__Group__35 )
            // InternalAhnen.g:2211:2: rule__Person__Group__34__Impl rule__Person__Group__35
            {
            pushFollow(FOLLOW_31);
            rule__Person__Group__34__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__35();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__34"


    // $ANTLR start "rule__Person__Group__34__Impl"
    // InternalAhnen.g:2218:1: rule__Person__Group__34__Impl : ( '.' ) ;
    public final void rule__Person__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2222:1: ( ( '.' ) )
            // InternalAhnen.g:2223:1: ( '.' )
            {
            // InternalAhnen.g:2223:1: ( '.' )
            // InternalAhnen.g:2224:2: '.'
            {
             before(grammarAccess.getPersonAccess().getFullStopKeyword_34()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFullStopKeyword_34()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__34__Impl"


    // $ANTLR start "rule__Person__Group__35"
    // InternalAhnen.g:2233:1: rule__Person__Group__35 : rule__Person__Group__35__Impl rule__Person__Group__36 ;
    public final void rule__Person__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2237:1: ( rule__Person__Group__35__Impl rule__Person__Group__36 )
            // InternalAhnen.g:2238:2: rule__Person__Group__35__Impl rule__Person__Group__36
            {
            pushFollow(FOLLOW_30);
            rule__Person__Group__35__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__36();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__35"


    // $ANTLR start "rule__Person__Group__35__Impl"
    // InternalAhnen.g:2245:1: rule__Person__Group__35__Impl : ( 'Mutter:' ) ;
    public final void rule__Person__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2249:1: ( ( 'Mutter:' ) )
            // InternalAhnen.g:2250:1: ( 'Mutter:' )
            {
            // InternalAhnen.g:2250:1: ( 'Mutter:' )
            // InternalAhnen.g:2251:2: 'Mutter:'
            {
             before(grammarAccess.getPersonAccess().getMutterKeyword_35()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getMutterKeyword_35()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__35__Impl"


    // $ANTLR start "rule__Person__Group__36"
    // InternalAhnen.g:2260:1: rule__Person__Group__36 : rule__Person__Group__36__Impl rule__Person__Group__37 ;
    public final void rule__Person__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2264:1: ( rule__Person__Group__36__Impl rule__Person__Group__37 )
            // InternalAhnen.g:2265:2: rule__Person__Group__36__Impl rule__Person__Group__37
            {
            pushFollow(FOLLOW_15);
            rule__Person__Group__36__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__37();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__36"


    // $ANTLR start "rule__Person__Group__36__Impl"
    // InternalAhnen.g:2272:1: rule__Person__Group__36__Impl : ( ( rule__Person__Alternatives_36 ) ) ;
    public final void rule__Person__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2276:1: ( ( ( rule__Person__Alternatives_36 ) ) )
            // InternalAhnen.g:2277:1: ( ( rule__Person__Alternatives_36 ) )
            {
            // InternalAhnen.g:2277:1: ( ( rule__Person__Alternatives_36 ) )
            // InternalAhnen.g:2278:2: ( rule__Person__Alternatives_36 )
            {
             before(grammarAccess.getPersonAccess().getAlternatives_36()); 
            // InternalAhnen.g:2279:2: ( rule__Person__Alternatives_36 )
            // InternalAhnen.g:2279:3: rule__Person__Alternatives_36
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives_36();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives_36()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__36__Impl"


    // $ANTLR start "rule__Person__Group__37"
    // InternalAhnen.g:2287:1: rule__Person__Group__37 : rule__Person__Group__37__Impl rule__Person__Group__38 ;
    public final void rule__Person__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2291:1: ( rule__Person__Group__37__Impl rule__Person__Group__38 )
            // InternalAhnen.g:2292:2: rule__Person__Group__37__Impl rule__Person__Group__38
            {
            pushFollow(FOLLOW_32);
            rule__Person__Group__37__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__38();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__37"


    // $ANTLR start "rule__Person__Group__37__Impl"
    // InternalAhnen.g:2299:1: rule__Person__Group__37__Impl : ( '.' ) ;
    public final void rule__Person__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2303:1: ( ( '.' ) )
            // InternalAhnen.g:2304:1: ( '.' )
            {
            // InternalAhnen.g:2304:1: ( '.' )
            // InternalAhnen.g:2305:2: '.'
            {
             before(grammarAccess.getPersonAccess().getFullStopKeyword_37()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFullStopKeyword_37()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__37__Impl"


    // $ANTLR start "rule__Person__Group__38"
    // InternalAhnen.g:2314:1: rule__Person__Group__38 : rule__Person__Group__38__Impl rule__Person__Group__39 ;
    public final void rule__Person__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2318:1: ( rule__Person__Group__38__Impl rule__Person__Group__39 )
            // InternalAhnen.g:2319:2: rule__Person__Group__38__Impl rule__Person__Group__39
            {
            pushFollow(FOLLOW_33);
            rule__Person__Group__38__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__39();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__38"


    // $ANTLR start "rule__Person__Group__38__Impl"
    // InternalAhnen.g:2326:1: rule__Person__Group__38__Impl : ( 'Kinder:' ) ;
    public final void rule__Person__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2330:1: ( ( 'Kinder:' ) )
            // InternalAhnen.g:2331:1: ( 'Kinder:' )
            {
            // InternalAhnen.g:2331:1: ( 'Kinder:' )
            // InternalAhnen.g:2332:2: 'Kinder:'
            {
             before(grammarAccess.getPersonAccess().getKinderKeyword_38()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getKinderKeyword_38()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__38__Impl"


    // $ANTLR start "rule__Person__Group__39"
    // InternalAhnen.g:2341:1: rule__Person__Group__39 : rule__Person__Group__39__Impl rule__Person__Group__40 ;
    public final void rule__Person__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2345:1: ( rule__Person__Group__39__Impl rule__Person__Group__40 )
            // InternalAhnen.g:2346:2: rule__Person__Group__39__Impl rule__Person__Group__40
            {
            pushFollow(FOLLOW_15);
            rule__Person__Group__39__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__40();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__39"


    // $ANTLR start "rule__Person__Group__39__Impl"
    // InternalAhnen.g:2353:1: rule__Person__Group__39__Impl : ( ( rule__Person__Alternatives_39 ) ) ;
    public final void rule__Person__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2357:1: ( ( ( rule__Person__Alternatives_39 ) ) )
            // InternalAhnen.g:2358:1: ( ( rule__Person__Alternatives_39 ) )
            {
            // InternalAhnen.g:2358:1: ( ( rule__Person__Alternatives_39 ) )
            // InternalAhnen.g:2359:2: ( rule__Person__Alternatives_39 )
            {
             before(grammarAccess.getPersonAccess().getAlternatives_39()); 
            // InternalAhnen.g:2360:2: ( rule__Person__Alternatives_39 )
            // InternalAhnen.g:2360:3: rule__Person__Alternatives_39
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives_39();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives_39()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__39__Impl"


    // $ANTLR start "rule__Person__Group__40"
    // InternalAhnen.g:2368:1: rule__Person__Group__40 : rule__Person__Group__40__Impl rule__Person__Group__41 ;
    public final void rule__Person__Group__40() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2372:1: ( rule__Person__Group__40__Impl rule__Person__Group__41 )
            // InternalAhnen.g:2373:2: rule__Person__Group__40__Impl rule__Person__Group__41
            {
            pushFollow(FOLLOW_34);
            rule__Person__Group__40__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__41();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__40"


    // $ANTLR start "rule__Person__Group__40__Impl"
    // InternalAhnen.g:2380:1: rule__Person__Group__40__Impl : ( '.' ) ;
    public final void rule__Person__Group__40__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2384:1: ( ( '.' ) )
            // InternalAhnen.g:2385:1: ( '.' )
            {
            // InternalAhnen.g:2385:1: ( '.' )
            // InternalAhnen.g:2386:2: '.'
            {
             before(grammarAccess.getPersonAccess().getFullStopKeyword_40()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFullStopKeyword_40()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__40__Impl"


    // $ANTLR start "rule__Person__Group__41"
    // InternalAhnen.g:2395:1: rule__Person__Group__41 : rule__Person__Group__41__Impl rule__Person__Group__42 ;
    public final void rule__Person__Group__41() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2399:1: ( rule__Person__Group__41__Impl rule__Person__Group__42 )
            // InternalAhnen.g:2400:2: rule__Person__Group__41__Impl rule__Person__Group__42
            {
            pushFollow(FOLLOW_33);
            rule__Person__Group__41__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__42();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__41"


    // $ANTLR start "rule__Person__Group__41__Impl"
    // InternalAhnen.g:2407:1: rule__Person__Group__41__Impl : ( 'Stiefkinder:' ) ;
    public final void rule__Person__Group__41__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2411:1: ( ( 'Stiefkinder:' ) )
            // InternalAhnen.g:2412:1: ( 'Stiefkinder:' )
            {
            // InternalAhnen.g:2412:1: ( 'Stiefkinder:' )
            // InternalAhnen.g:2413:2: 'Stiefkinder:'
            {
             before(grammarAccess.getPersonAccess().getStiefkinderKeyword_41()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getStiefkinderKeyword_41()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__41__Impl"


    // $ANTLR start "rule__Person__Group__42"
    // InternalAhnen.g:2422:1: rule__Person__Group__42 : rule__Person__Group__42__Impl rule__Person__Group__43 ;
    public final void rule__Person__Group__42() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2426:1: ( rule__Person__Group__42__Impl rule__Person__Group__43 )
            // InternalAhnen.g:2427:2: rule__Person__Group__42__Impl rule__Person__Group__43
            {
            pushFollow(FOLLOW_15);
            rule__Person__Group__42__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__43();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__42"


    // $ANTLR start "rule__Person__Group__42__Impl"
    // InternalAhnen.g:2434:1: rule__Person__Group__42__Impl : ( ( rule__Person__Alternatives_42 ) ) ;
    public final void rule__Person__Group__42__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2438:1: ( ( ( rule__Person__Alternatives_42 ) ) )
            // InternalAhnen.g:2439:1: ( ( rule__Person__Alternatives_42 ) )
            {
            // InternalAhnen.g:2439:1: ( ( rule__Person__Alternatives_42 ) )
            // InternalAhnen.g:2440:2: ( rule__Person__Alternatives_42 )
            {
             before(grammarAccess.getPersonAccess().getAlternatives_42()); 
            // InternalAhnen.g:2441:2: ( rule__Person__Alternatives_42 )
            // InternalAhnen.g:2441:3: rule__Person__Alternatives_42
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives_42();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives_42()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__42__Impl"


    // $ANTLR start "rule__Person__Group__43"
    // InternalAhnen.g:2449:1: rule__Person__Group__43 : rule__Person__Group__43__Impl rule__Person__Group__44 ;
    public final void rule__Person__Group__43() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2453:1: ( rule__Person__Group__43__Impl rule__Person__Group__44 )
            // InternalAhnen.g:2454:2: rule__Person__Group__43__Impl rule__Person__Group__44
            {
            pushFollow(FOLLOW_35);
            rule__Person__Group__43__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__44();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__43"


    // $ANTLR start "rule__Person__Group__43__Impl"
    // InternalAhnen.g:2461:1: rule__Person__Group__43__Impl : ( '.' ) ;
    public final void rule__Person__Group__43__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2465:1: ( ( '.' ) )
            // InternalAhnen.g:2466:1: ( '.' )
            {
            // InternalAhnen.g:2466:1: ( '.' )
            // InternalAhnen.g:2467:2: '.'
            {
             before(grammarAccess.getPersonAccess().getFullStopKeyword_43()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFullStopKeyword_43()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__43__Impl"


    // $ANTLR start "rule__Person__Group__44"
    // InternalAhnen.g:2476:1: rule__Person__Group__44 : rule__Person__Group__44__Impl rule__Person__Group__45 ;
    public final void rule__Person__Group__44() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2480:1: ( rule__Person__Group__44__Impl rule__Person__Group__45 )
            // InternalAhnen.g:2481:2: rule__Person__Group__44__Impl rule__Person__Group__45
            {
            pushFollow(FOLLOW_11);
            rule__Person__Group__44__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__45();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__44"


    // $ANTLR start "rule__Person__Group__44__Impl"
    // InternalAhnen.g:2488:1: rule__Person__Group__44__Impl : ( 'Beziehungen:' ) ;
    public final void rule__Person__Group__44__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2492:1: ( ( 'Beziehungen:' ) )
            // InternalAhnen.g:2493:1: ( 'Beziehungen:' )
            {
            // InternalAhnen.g:2493:1: ( 'Beziehungen:' )
            // InternalAhnen.g:2494:2: 'Beziehungen:'
            {
             before(grammarAccess.getPersonAccess().getBeziehungenKeyword_44()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getBeziehungenKeyword_44()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__44__Impl"


    // $ANTLR start "rule__Person__Group__45"
    // InternalAhnen.g:2503:1: rule__Person__Group__45 : rule__Person__Group__45__Impl rule__Person__Group__46 ;
    public final void rule__Person__Group__45() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2507:1: ( rule__Person__Group__45__Impl rule__Person__Group__46 )
            // InternalAhnen.g:2508:2: rule__Person__Group__45__Impl rule__Person__Group__46
            {
            pushFollow(FOLLOW_36);
            rule__Person__Group__45__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__46();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__45"


    // $ANTLR start "rule__Person__Group__45__Impl"
    // InternalAhnen.g:2515:1: rule__Person__Group__45__Impl : ( '{' ) ;
    public final void rule__Person__Group__45__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2519:1: ( ( '{' ) )
            // InternalAhnen.g:2520:1: ( '{' )
            {
            // InternalAhnen.g:2520:1: ( '{' )
            // InternalAhnen.g:2521:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_45()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_45()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__45__Impl"


    // $ANTLR start "rule__Person__Group__46"
    // InternalAhnen.g:2530:1: rule__Person__Group__46 : rule__Person__Group__46__Impl rule__Person__Group__47 ;
    public final void rule__Person__Group__46() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2534:1: ( rule__Person__Group__46__Impl rule__Person__Group__47 )
            // InternalAhnen.g:2535:2: rule__Person__Group__46__Impl rule__Person__Group__47
            {
            pushFollow(FOLLOW_37);
            rule__Person__Group__46__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__47();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__46"


    // $ANTLR start "rule__Person__Group__46__Impl"
    // InternalAhnen.g:2542:1: rule__Person__Group__46__Impl : ( ( rule__Person__Alternatives_46 ) ) ;
    public final void rule__Person__Group__46__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2546:1: ( ( ( rule__Person__Alternatives_46 ) ) )
            // InternalAhnen.g:2547:1: ( ( rule__Person__Alternatives_46 ) )
            {
            // InternalAhnen.g:2547:1: ( ( rule__Person__Alternatives_46 ) )
            // InternalAhnen.g:2548:2: ( rule__Person__Alternatives_46 )
            {
             before(grammarAccess.getPersonAccess().getAlternatives_46()); 
            // InternalAhnen.g:2549:2: ( rule__Person__Alternatives_46 )
            // InternalAhnen.g:2549:3: rule__Person__Alternatives_46
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives_46();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives_46()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__46__Impl"


    // $ANTLR start "rule__Person__Group__47"
    // InternalAhnen.g:2557:1: rule__Person__Group__47 : rule__Person__Group__47__Impl rule__Person__Group__48 ;
    public final void rule__Person__Group__47() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2561:1: ( rule__Person__Group__47__Impl rule__Person__Group__48 )
            // InternalAhnen.g:2562:2: rule__Person__Group__47__Impl rule__Person__Group__48
            {
            pushFollow(FOLLOW_38);
            rule__Person__Group__47__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__48();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__47"


    // $ANTLR start "rule__Person__Group__47__Impl"
    // InternalAhnen.g:2569:1: rule__Person__Group__47__Impl : ( '}' ) ;
    public final void rule__Person__Group__47__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2573:1: ( ( '}' ) )
            // InternalAhnen.g:2574:1: ( '}' )
            {
            // InternalAhnen.g:2574:1: ( '}' )
            // InternalAhnen.g:2575:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_47()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_47()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__47__Impl"


    // $ANTLR start "rule__Person__Group__48"
    // InternalAhnen.g:2584:1: rule__Person__Group__48 : rule__Person__Group__48__Impl rule__Person__Group__49 ;
    public final void rule__Person__Group__48() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2588:1: ( rule__Person__Group__48__Impl rule__Person__Group__49 )
            // InternalAhnen.g:2589:2: rule__Person__Group__48__Impl rule__Person__Group__49
            {
            pushFollow(FOLLOW_11);
            rule__Person__Group__48__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__49();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__48"


    // $ANTLR start "rule__Person__Group__48__Impl"
    // InternalAhnen.g:2596:1: rule__Person__Group__48__Impl : ( 'Ereignisse:' ) ;
    public final void rule__Person__Group__48__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2600:1: ( ( 'Ereignisse:' ) )
            // InternalAhnen.g:2601:1: ( 'Ereignisse:' )
            {
            // InternalAhnen.g:2601:1: ( 'Ereignisse:' )
            // InternalAhnen.g:2602:2: 'Ereignisse:'
            {
             before(grammarAccess.getPersonAccess().getEreignisseKeyword_48()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getEreignisseKeyword_48()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__48__Impl"


    // $ANTLR start "rule__Person__Group__49"
    // InternalAhnen.g:2611:1: rule__Person__Group__49 : rule__Person__Group__49__Impl rule__Person__Group__50 ;
    public final void rule__Person__Group__49() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2615:1: ( rule__Person__Group__49__Impl rule__Person__Group__50 )
            // InternalAhnen.g:2616:2: rule__Person__Group__49__Impl rule__Person__Group__50
            {
            pushFollow(FOLLOW_39);
            rule__Person__Group__49__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__50();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__49"


    // $ANTLR start "rule__Person__Group__49__Impl"
    // InternalAhnen.g:2623:1: rule__Person__Group__49__Impl : ( '{' ) ;
    public final void rule__Person__Group__49__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2627:1: ( ( '{' ) )
            // InternalAhnen.g:2628:1: ( '{' )
            {
            // InternalAhnen.g:2628:1: ( '{' )
            // InternalAhnen.g:2629:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_49()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_49()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__49__Impl"


    // $ANTLR start "rule__Person__Group__50"
    // InternalAhnen.g:2638:1: rule__Person__Group__50 : rule__Person__Group__50__Impl rule__Person__Group__51 ;
    public final void rule__Person__Group__50() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2642:1: ( rule__Person__Group__50__Impl rule__Person__Group__51 )
            // InternalAhnen.g:2643:2: rule__Person__Group__50__Impl rule__Person__Group__51
            {
            pushFollow(FOLLOW_37);
            rule__Person__Group__50__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__51();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__50"


    // $ANTLR start "rule__Person__Group__50__Impl"
    // InternalAhnen.g:2650:1: rule__Person__Group__50__Impl : ( ( rule__Person__Alternatives_50 ) ) ;
    public final void rule__Person__Group__50__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2654:1: ( ( ( rule__Person__Alternatives_50 ) ) )
            // InternalAhnen.g:2655:1: ( ( rule__Person__Alternatives_50 ) )
            {
            // InternalAhnen.g:2655:1: ( ( rule__Person__Alternatives_50 ) )
            // InternalAhnen.g:2656:2: ( rule__Person__Alternatives_50 )
            {
             before(grammarAccess.getPersonAccess().getAlternatives_50()); 
            // InternalAhnen.g:2657:2: ( rule__Person__Alternatives_50 )
            // InternalAhnen.g:2657:3: rule__Person__Alternatives_50
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives_50();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives_50()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__50__Impl"


    // $ANTLR start "rule__Person__Group__51"
    // InternalAhnen.g:2665:1: rule__Person__Group__51 : rule__Person__Group__51__Impl rule__Person__Group__52 ;
    public final void rule__Person__Group__51() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2669:1: ( rule__Person__Group__51__Impl rule__Person__Group__52 )
            // InternalAhnen.g:2670:2: rule__Person__Group__51__Impl rule__Person__Group__52
            {
            pushFollow(FOLLOW_37);
            rule__Person__Group__51__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__52();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__51"


    // $ANTLR start "rule__Person__Group__51__Impl"
    // InternalAhnen.g:2677:1: rule__Person__Group__51__Impl : ( '}' ) ;
    public final void rule__Person__Group__51__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2681:1: ( ( '}' ) )
            // InternalAhnen.g:2682:1: ( '}' )
            {
            // InternalAhnen.g:2682:1: ( '}' )
            // InternalAhnen.g:2683:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_51()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_51()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__51__Impl"


    // $ANTLR start "rule__Person__Group__52"
    // InternalAhnen.g:2692:1: rule__Person__Group__52 : rule__Person__Group__52__Impl ;
    public final void rule__Person__Group__52() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2696:1: ( rule__Person__Group__52__Impl )
            // InternalAhnen.g:2697:2: rule__Person__Group__52__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__52__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__52"


    // $ANTLR start "rule__Person__Group__52__Impl"
    // InternalAhnen.g:2703:1: rule__Person__Group__52__Impl : ( '}' ) ;
    public final void rule__Person__Group__52__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2707:1: ( ( '}' ) )
            // InternalAhnen.g:2708:1: ( '}' )
            {
            // InternalAhnen.g:2708:1: ( '}' )
            // InternalAhnen.g:2709:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_52()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_52()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__52__Impl"


    // $ANTLR start "rule__Person__Group_50_1__0"
    // InternalAhnen.g:2719:1: rule__Person__Group_50_1__0 : rule__Person__Group_50_1__0__Impl rule__Person__Group_50_1__1 ;
    public final void rule__Person__Group_50_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2723:1: ( rule__Person__Group_50_1__0__Impl rule__Person__Group_50_1__1 )
            // InternalAhnen.g:2724:2: rule__Person__Group_50_1__0__Impl rule__Person__Group_50_1__1
            {
            pushFollow(FOLLOW_40);
            rule__Person__Group_50_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_50_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_50_1__0"


    // $ANTLR start "rule__Person__Group_50_1__0__Impl"
    // InternalAhnen.g:2731:1: rule__Person__Group_50_1__0__Impl : ( 'keine' ) ;
    public final void rule__Person__Group_50_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2735:1: ( ( 'keine' ) )
            // InternalAhnen.g:2736:1: ( 'keine' )
            {
            // InternalAhnen.g:2736:1: ( 'keine' )
            // InternalAhnen.g:2737:2: 'keine'
            {
             before(grammarAccess.getPersonAccess().getKeineKeyword_50_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getKeineKeyword_50_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_50_1__0__Impl"


    // $ANTLR start "rule__Person__Group_50_1__1"
    // InternalAhnen.g:2746:1: rule__Person__Group_50_1__1 : rule__Person__Group_50_1__1__Impl ;
    public final void rule__Person__Group_50_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2750:1: ( rule__Person__Group_50_1__1__Impl )
            // InternalAhnen.g:2751:2: rule__Person__Group_50_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_50_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_50_1__1"


    // $ANTLR start "rule__Person__Group_50_1__1__Impl"
    // InternalAhnen.g:2757:1: rule__Person__Group_50_1__1__Impl : ( 'bekannt' ) ;
    public final void rule__Person__Group_50_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2761:1: ( ( 'bekannt' ) )
            // InternalAhnen.g:2762:1: ( 'bekannt' )
            {
            // InternalAhnen.g:2762:1: ( 'bekannt' )
            // InternalAhnen.g:2763:2: 'bekannt'
            {
             before(grammarAccess.getPersonAccess().getBekanntKeyword_50_1_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getBekanntKeyword_50_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_50_1__1__Impl"


    // $ANTLR start "rule__Schulausbildung__Group__0"
    // InternalAhnen.g:2773:1: rule__Schulausbildung__Group__0 : rule__Schulausbildung__Group__0__Impl rule__Schulausbildung__Group__1 ;
    public final void rule__Schulausbildung__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2777:1: ( rule__Schulausbildung__Group__0__Impl rule__Schulausbildung__Group__1 )
            // InternalAhnen.g:2778:2: rule__Schulausbildung__Group__0__Impl rule__Schulausbildung__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Schulausbildung__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schulausbildung__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__0"


    // $ANTLR start "rule__Schulausbildung__Group__0__Impl"
    // InternalAhnen.g:2785:1: rule__Schulausbildung__Group__0__Impl : ( () ) ;
    public final void rule__Schulausbildung__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2789:1: ( ( () ) )
            // InternalAhnen.g:2790:1: ( () )
            {
            // InternalAhnen.g:2790:1: ( () )
            // InternalAhnen.g:2791:2: ()
            {
             before(grammarAccess.getSchulausbildungAccess().getSchulausbildungAction_0()); 
            // InternalAhnen.g:2792:2: ()
            // InternalAhnen.g:2792:3: 
            {
            }

             after(grammarAccess.getSchulausbildungAccess().getSchulausbildungAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__0__Impl"


    // $ANTLR start "rule__Schulausbildung__Group__1"
    // InternalAhnen.g:2800:1: rule__Schulausbildung__Group__1 : rule__Schulausbildung__Group__1__Impl rule__Schulausbildung__Group__2 ;
    public final void rule__Schulausbildung__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2804:1: ( rule__Schulausbildung__Group__1__Impl rule__Schulausbildung__Group__2 )
            // InternalAhnen.g:2805:2: rule__Schulausbildung__Group__1__Impl rule__Schulausbildung__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__Schulausbildung__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schulausbildung__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__1"


    // $ANTLR start "rule__Schulausbildung__Group__1__Impl"
    // InternalAhnen.g:2812:1: rule__Schulausbildung__Group__1__Impl : ( 'Schulausbildung:' ) ;
    public final void rule__Schulausbildung__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2816:1: ( ( 'Schulausbildung:' ) )
            // InternalAhnen.g:2817:1: ( 'Schulausbildung:' )
            {
            // InternalAhnen.g:2817:1: ( 'Schulausbildung:' )
            // InternalAhnen.g:2818:2: 'Schulausbildung:'
            {
             before(grammarAccess.getSchulausbildungAccess().getSchulausbildungKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSchulausbildungAccess().getSchulausbildungKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__1__Impl"


    // $ANTLR start "rule__Schulausbildung__Group__2"
    // InternalAhnen.g:2827:1: rule__Schulausbildung__Group__2 : rule__Schulausbildung__Group__2__Impl rule__Schulausbildung__Group__3 ;
    public final void rule__Schulausbildung__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2831:1: ( rule__Schulausbildung__Group__2__Impl rule__Schulausbildung__Group__3 )
            // InternalAhnen.g:2832:2: rule__Schulausbildung__Group__2__Impl rule__Schulausbildung__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Schulausbildung__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schulausbildung__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__2"


    // $ANTLR start "rule__Schulausbildung__Group__2__Impl"
    // InternalAhnen.g:2839:1: rule__Schulausbildung__Group__2__Impl : ( 'von' ) ;
    public final void rule__Schulausbildung__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2843:1: ( ( 'von' ) )
            // InternalAhnen.g:2844:1: ( 'von' )
            {
            // InternalAhnen.g:2844:1: ( 'von' )
            // InternalAhnen.g:2845:2: 'von'
            {
             before(grammarAccess.getSchulausbildungAccess().getVonKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSchulausbildungAccess().getVonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__2__Impl"


    // $ANTLR start "rule__Schulausbildung__Group__3"
    // InternalAhnen.g:2854:1: rule__Schulausbildung__Group__3 : rule__Schulausbildung__Group__3__Impl rule__Schulausbildung__Group__4 ;
    public final void rule__Schulausbildung__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2858:1: ( rule__Schulausbildung__Group__3__Impl rule__Schulausbildung__Group__4 )
            // InternalAhnen.g:2859:2: rule__Schulausbildung__Group__3__Impl rule__Schulausbildung__Group__4
            {
            pushFollow(FOLLOW_43);
            rule__Schulausbildung__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schulausbildung__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__3"


    // $ANTLR start "rule__Schulausbildung__Group__3__Impl"
    // InternalAhnen.g:2866:1: rule__Schulausbildung__Group__3__Impl : ( ( rule__Schulausbildung__Alternatives_3 ) ) ;
    public final void rule__Schulausbildung__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2870:1: ( ( ( rule__Schulausbildung__Alternatives_3 ) ) )
            // InternalAhnen.g:2871:1: ( ( rule__Schulausbildung__Alternatives_3 ) )
            {
            // InternalAhnen.g:2871:1: ( ( rule__Schulausbildung__Alternatives_3 ) )
            // InternalAhnen.g:2872:2: ( rule__Schulausbildung__Alternatives_3 )
            {
             before(grammarAccess.getSchulausbildungAccess().getAlternatives_3()); 
            // InternalAhnen.g:2873:2: ( rule__Schulausbildung__Alternatives_3 )
            // InternalAhnen.g:2873:3: rule__Schulausbildung__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Schulausbildung__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getSchulausbildungAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__3__Impl"


    // $ANTLR start "rule__Schulausbildung__Group__4"
    // InternalAhnen.g:2881:1: rule__Schulausbildung__Group__4 : rule__Schulausbildung__Group__4__Impl rule__Schulausbildung__Group__5 ;
    public final void rule__Schulausbildung__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2885:1: ( rule__Schulausbildung__Group__4__Impl rule__Schulausbildung__Group__5 )
            // InternalAhnen.g:2886:2: rule__Schulausbildung__Group__4__Impl rule__Schulausbildung__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Schulausbildung__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schulausbildung__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__4"


    // $ANTLR start "rule__Schulausbildung__Group__4__Impl"
    // InternalAhnen.g:2893:1: rule__Schulausbildung__Group__4__Impl : ( 'bis' ) ;
    public final void rule__Schulausbildung__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2897:1: ( ( 'bis' ) )
            // InternalAhnen.g:2898:1: ( 'bis' )
            {
            // InternalAhnen.g:2898:1: ( 'bis' )
            // InternalAhnen.g:2899:2: 'bis'
            {
             before(grammarAccess.getSchulausbildungAccess().getBisKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSchulausbildungAccess().getBisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__4__Impl"


    // $ANTLR start "rule__Schulausbildung__Group__5"
    // InternalAhnen.g:2908:1: rule__Schulausbildung__Group__5 : rule__Schulausbildung__Group__5__Impl rule__Schulausbildung__Group__6 ;
    public final void rule__Schulausbildung__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2912:1: ( rule__Schulausbildung__Group__5__Impl rule__Schulausbildung__Group__6 )
            // InternalAhnen.g:2913:2: rule__Schulausbildung__Group__5__Impl rule__Schulausbildung__Group__6
            {
            pushFollow(FOLLOW_44);
            rule__Schulausbildung__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schulausbildung__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__5"


    // $ANTLR start "rule__Schulausbildung__Group__5__Impl"
    // InternalAhnen.g:2920:1: rule__Schulausbildung__Group__5__Impl : ( ( rule__Schulausbildung__Alternatives_5 ) ) ;
    public final void rule__Schulausbildung__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2924:1: ( ( ( rule__Schulausbildung__Alternatives_5 ) ) )
            // InternalAhnen.g:2925:1: ( ( rule__Schulausbildung__Alternatives_5 ) )
            {
            // InternalAhnen.g:2925:1: ( ( rule__Schulausbildung__Alternatives_5 ) )
            // InternalAhnen.g:2926:2: ( rule__Schulausbildung__Alternatives_5 )
            {
             before(grammarAccess.getSchulausbildungAccess().getAlternatives_5()); 
            // InternalAhnen.g:2927:2: ( rule__Schulausbildung__Alternatives_5 )
            // InternalAhnen.g:2927:3: rule__Schulausbildung__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Schulausbildung__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getSchulausbildungAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__5__Impl"


    // $ANTLR start "rule__Schulausbildung__Group__6"
    // InternalAhnen.g:2935:1: rule__Schulausbildung__Group__6 : rule__Schulausbildung__Group__6__Impl rule__Schulausbildung__Group__7 ;
    public final void rule__Schulausbildung__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2939:1: ( rule__Schulausbildung__Group__6__Impl rule__Schulausbildung__Group__7 )
            // InternalAhnen.g:2940:2: rule__Schulausbildung__Group__6__Impl rule__Schulausbildung__Group__7
            {
            pushFollow(FOLLOW_45);
            rule__Schulausbildung__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schulausbildung__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__6"


    // $ANTLR start "rule__Schulausbildung__Group__6__Impl"
    // InternalAhnen.g:2947:1: rule__Schulausbildung__Group__6__Impl : ( 'Abschluss:' ) ;
    public final void rule__Schulausbildung__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2951:1: ( ( 'Abschluss:' ) )
            // InternalAhnen.g:2952:1: ( 'Abschluss:' )
            {
            // InternalAhnen.g:2952:1: ( 'Abschluss:' )
            // InternalAhnen.g:2953:2: 'Abschluss:'
            {
             before(grammarAccess.getSchulausbildungAccess().getAbschlussKeyword_6()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSchulausbildungAccess().getAbschlussKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__6__Impl"


    // $ANTLR start "rule__Schulausbildung__Group__7"
    // InternalAhnen.g:2962:1: rule__Schulausbildung__Group__7 : rule__Schulausbildung__Group__7__Impl rule__Schulausbildung__Group__8 ;
    public final void rule__Schulausbildung__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2966:1: ( rule__Schulausbildung__Group__7__Impl rule__Schulausbildung__Group__8 )
            // InternalAhnen.g:2967:2: rule__Schulausbildung__Group__7__Impl rule__Schulausbildung__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Schulausbildung__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schulausbildung__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__7"


    // $ANTLR start "rule__Schulausbildung__Group__7__Impl"
    // InternalAhnen.g:2974:1: rule__Schulausbildung__Group__7__Impl : ( ( rule__Schulausbildung__Alternatives_7 ) ) ;
    public final void rule__Schulausbildung__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2978:1: ( ( ( rule__Schulausbildung__Alternatives_7 ) ) )
            // InternalAhnen.g:2979:1: ( ( rule__Schulausbildung__Alternatives_7 ) )
            {
            // InternalAhnen.g:2979:1: ( ( rule__Schulausbildung__Alternatives_7 ) )
            // InternalAhnen.g:2980:2: ( rule__Schulausbildung__Alternatives_7 )
            {
             before(grammarAccess.getSchulausbildungAccess().getAlternatives_7()); 
            // InternalAhnen.g:2981:2: ( rule__Schulausbildung__Alternatives_7 )
            // InternalAhnen.g:2981:3: rule__Schulausbildung__Alternatives_7
            {
            pushFollow(FOLLOW_2);
            rule__Schulausbildung__Alternatives_7();

            state._fsp--;


            }

             after(grammarAccess.getSchulausbildungAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__7__Impl"


    // $ANTLR start "rule__Schulausbildung__Group__8"
    // InternalAhnen.g:2989:1: rule__Schulausbildung__Group__8 : rule__Schulausbildung__Group__8__Impl ;
    public final void rule__Schulausbildung__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:2993:1: ( rule__Schulausbildung__Group__8__Impl )
            // InternalAhnen.g:2994:2: rule__Schulausbildung__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schulausbildung__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__8"


    // $ANTLR start "rule__Schulausbildung__Group__8__Impl"
    // InternalAhnen.g:3000:1: rule__Schulausbildung__Group__8__Impl : ( '.' ) ;
    public final void rule__Schulausbildung__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3004:1: ( ( '.' ) )
            // InternalAhnen.g:3005:1: ( '.' )
            {
            // InternalAhnen.g:3005:1: ( '.' )
            // InternalAhnen.g:3006:2: '.'
            {
             before(grammarAccess.getSchulausbildungAccess().getFullStopKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSchulausbildungAccess().getFullStopKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__Group__8__Impl"


    // $ANTLR start "rule__Taetigkeit__Group__0"
    // InternalAhnen.g:3016:1: rule__Taetigkeit__Group__0 : rule__Taetigkeit__Group__0__Impl rule__Taetigkeit__Group__1 ;
    public final void rule__Taetigkeit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3020:1: ( rule__Taetigkeit__Group__0__Impl rule__Taetigkeit__Group__1 )
            // InternalAhnen.g:3021:2: rule__Taetigkeit__Group__0__Impl rule__Taetigkeit__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Taetigkeit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__0"


    // $ANTLR start "rule__Taetigkeit__Group__0__Impl"
    // InternalAhnen.g:3028:1: rule__Taetigkeit__Group__0__Impl : ( () ) ;
    public final void rule__Taetigkeit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3032:1: ( ( () ) )
            // InternalAhnen.g:3033:1: ( () )
            {
            // InternalAhnen.g:3033:1: ( () )
            // InternalAhnen.g:3034:2: ()
            {
             before(grammarAccess.getTaetigkeitAccess().getTaetigkeitAction_0()); 
            // InternalAhnen.g:3035:2: ()
            // InternalAhnen.g:3035:3: 
            {
            }

             after(grammarAccess.getTaetigkeitAccess().getTaetigkeitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__0__Impl"


    // $ANTLR start "rule__Taetigkeit__Group__1"
    // InternalAhnen.g:3043:1: rule__Taetigkeit__Group__1 : rule__Taetigkeit__Group__1__Impl rule__Taetigkeit__Group__2 ;
    public final void rule__Taetigkeit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3047:1: ( rule__Taetigkeit__Group__1__Impl rule__Taetigkeit__Group__2 )
            // InternalAhnen.g:3048:2: rule__Taetigkeit__Group__1__Impl rule__Taetigkeit__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__Taetigkeit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__1"


    // $ANTLR start "rule__Taetigkeit__Group__1__Impl"
    // InternalAhnen.g:3055:1: rule__Taetigkeit__Group__1__Impl : ( 'T\\u00E4tigkeit:' ) ;
    public final void rule__Taetigkeit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3059:1: ( ( 'T\\u00E4tigkeit:' ) )
            // InternalAhnen.g:3060:1: ( 'T\\u00E4tigkeit:' )
            {
            // InternalAhnen.g:3060:1: ( 'T\\u00E4tigkeit:' )
            // InternalAhnen.g:3061:2: 'T\\u00E4tigkeit:'
            {
             before(grammarAccess.getTaetigkeitAccess().getTätigkeitKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTaetigkeitAccess().getTätigkeitKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__1__Impl"


    // $ANTLR start "rule__Taetigkeit__Group__2"
    // InternalAhnen.g:3070:1: rule__Taetigkeit__Group__2 : rule__Taetigkeit__Group__2__Impl rule__Taetigkeit__Group__3 ;
    public final void rule__Taetigkeit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3074:1: ( rule__Taetigkeit__Group__2__Impl rule__Taetigkeit__Group__3 )
            // InternalAhnen.g:3075:2: rule__Taetigkeit__Group__2__Impl rule__Taetigkeit__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Taetigkeit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__2"


    // $ANTLR start "rule__Taetigkeit__Group__2__Impl"
    // InternalAhnen.g:3082:1: rule__Taetigkeit__Group__2__Impl : ( 'als' ) ;
    public final void rule__Taetigkeit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3086:1: ( ( 'als' ) )
            // InternalAhnen.g:3087:1: ( 'als' )
            {
            // InternalAhnen.g:3087:1: ( 'als' )
            // InternalAhnen.g:3088:2: 'als'
            {
             before(grammarAccess.getTaetigkeitAccess().getAlsKeyword_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getTaetigkeitAccess().getAlsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__2__Impl"


    // $ANTLR start "rule__Taetigkeit__Group__3"
    // InternalAhnen.g:3097:1: rule__Taetigkeit__Group__3 : rule__Taetigkeit__Group__3__Impl rule__Taetigkeit__Group__4 ;
    public final void rule__Taetigkeit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3101:1: ( rule__Taetigkeit__Group__3__Impl rule__Taetigkeit__Group__4 )
            // InternalAhnen.g:3102:2: rule__Taetigkeit__Group__3__Impl rule__Taetigkeit__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__Taetigkeit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__3"


    // $ANTLR start "rule__Taetigkeit__Group__3__Impl"
    // InternalAhnen.g:3109:1: rule__Taetigkeit__Group__3__Impl : ( ( rule__Taetigkeit__Alternatives_3 ) ) ;
    public final void rule__Taetigkeit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3113:1: ( ( ( rule__Taetigkeit__Alternatives_3 ) ) )
            // InternalAhnen.g:3114:1: ( ( rule__Taetigkeit__Alternatives_3 ) )
            {
            // InternalAhnen.g:3114:1: ( ( rule__Taetigkeit__Alternatives_3 ) )
            // InternalAhnen.g:3115:2: ( rule__Taetigkeit__Alternatives_3 )
            {
             before(grammarAccess.getTaetigkeitAccess().getAlternatives_3()); 
            // InternalAhnen.g:3116:2: ( rule__Taetigkeit__Alternatives_3 )
            // InternalAhnen.g:3116:3: rule__Taetigkeit__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getTaetigkeitAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__3__Impl"


    // $ANTLR start "rule__Taetigkeit__Group__4"
    // InternalAhnen.g:3124:1: rule__Taetigkeit__Group__4 : rule__Taetigkeit__Group__4__Impl rule__Taetigkeit__Group__5 ;
    public final void rule__Taetigkeit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3128:1: ( rule__Taetigkeit__Group__4__Impl rule__Taetigkeit__Group__5 )
            // InternalAhnen.g:3129:2: rule__Taetigkeit__Group__4__Impl rule__Taetigkeit__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Taetigkeit__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__4"


    // $ANTLR start "rule__Taetigkeit__Group__4__Impl"
    // InternalAhnen.g:3136:1: rule__Taetigkeit__Group__4__Impl : ( 'bei' ) ;
    public final void rule__Taetigkeit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3140:1: ( ( 'bei' ) )
            // InternalAhnen.g:3141:1: ( 'bei' )
            {
            // InternalAhnen.g:3141:1: ( 'bei' )
            // InternalAhnen.g:3142:2: 'bei'
            {
             before(grammarAccess.getTaetigkeitAccess().getBeiKeyword_4()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getTaetigkeitAccess().getBeiKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__4__Impl"


    // $ANTLR start "rule__Taetigkeit__Group__5"
    // InternalAhnen.g:3151:1: rule__Taetigkeit__Group__5 : rule__Taetigkeit__Group__5__Impl rule__Taetigkeit__Group__6 ;
    public final void rule__Taetigkeit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3155:1: ( rule__Taetigkeit__Group__5__Impl rule__Taetigkeit__Group__6 )
            // InternalAhnen.g:3156:2: rule__Taetigkeit__Group__5__Impl rule__Taetigkeit__Group__6
            {
            pushFollow(FOLLOW_49);
            rule__Taetigkeit__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__5"


    // $ANTLR start "rule__Taetigkeit__Group__5__Impl"
    // InternalAhnen.g:3163:1: rule__Taetigkeit__Group__5__Impl : ( ( rule__Taetigkeit__Alternatives_5 ) ) ;
    public final void rule__Taetigkeit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3167:1: ( ( ( rule__Taetigkeit__Alternatives_5 ) ) )
            // InternalAhnen.g:3168:1: ( ( rule__Taetigkeit__Alternatives_5 ) )
            {
            // InternalAhnen.g:3168:1: ( ( rule__Taetigkeit__Alternatives_5 ) )
            // InternalAhnen.g:3169:2: ( rule__Taetigkeit__Alternatives_5 )
            {
             before(grammarAccess.getTaetigkeitAccess().getAlternatives_5()); 
            // InternalAhnen.g:3170:2: ( rule__Taetigkeit__Alternatives_5 )
            // InternalAhnen.g:3170:3: rule__Taetigkeit__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getTaetigkeitAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__5__Impl"


    // $ANTLR start "rule__Taetigkeit__Group__6"
    // InternalAhnen.g:3178:1: rule__Taetigkeit__Group__6 : rule__Taetigkeit__Group__6__Impl rule__Taetigkeit__Group__7 ;
    public final void rule__Taetigkeit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3182:1: ( rule__Taetigkeit__Group__6__Impl rule__Taetigkeit__Group__7 )
            // InternalAhnen.g:3183:2: rule__Taetigkeit__Group__6__Impl rule__Taetigkeit__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Taetigkeit__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__6"


    // $ANTLR start "rule__Taetigkeit__Group__6__Impl"
    // InternalAhnen.g:3190:1: rule__Taetigkeit__Group__6__Impl : ( 'in' ) ;
    public final void rule__Taetigkeit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3194:1: ( ( 'in' ) )
            // InternalAhnen.g:3195:1: ( 'in' )
            {
            // InternalAhnen.g:3195:1: ( 'in' )
            // InternalAhnen.g:3196:2: 'in'
            {
             before(grammarAccess.getTaetigkeitAccess().getInKeyword_6()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTaetigkeitAccess().getInKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__6__Impl"


    // $ANTLR start "rule__Taetigkeit__Group__7"
    // InternalAhnen.g:3205:1: rule__Taetigkeit__Group__7 : rule__Taetigkeit__Group__7__Impl rule__Taetigkeit__Group__8 ;
    public final void rule__Taetigkeit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3209:1: ( rule__Taetigkeit__Group__7__Impl rule__Taetigkeit__Group__8 )
            // InternalAhnen.g:3210:2: rule__Taetigkeit__Group__7__Impl rule__Taetigkeit__Group__8
            {
            pushFollow(FOLLOW_42);
            rule__Taetigkeit__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__7"


    // $ANTLR start "rule__Taetigkeit__Group__7__Impl"
    // InternalAhnen.g:3217:1: rule__Taetigkeit__Group__7__Impl : ( ( rule__Taetigkeit__Alternatives_7 ) ) ;
    public final void rule__Taetigkeit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3221:1: ( ( ( rule__Taetigkeit__Alternatives_7 ) ) )
            // InternalAhnen.g:3222:1: ( ( rule__Taetigkeit__Alternatives_7 ) )
            {
            // InternalAhnen.g:3222:1: ( ( rule__Taetigkeit__Alternatives_7 ) )
            // InternalAhnen.g:3223:2: ( rule__Taetigkeit__Alternatives_7 )
            {
             before(grammarAccess.getTaetigkeitAccess().getAlternatives_7()); 
            // InternalAhnen.g:3224:2: ( rule__Taetigkeit__Alternatives_7 )
            // InternalAhnen.g:3224:3: rule__Taetigkeit__Alternatives_7
            {
            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Alternatives_7();

            state._fsp--;


            }

             after(grammarAccess.getTaetigkeitAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__7__Impl"


    // $ANTLR start "rule__Taetigkeit__Group__8"
    // InternalAhnen.g:3232:1: rule__Taetigkeit__Group__8 : rule__Taetigkeit__Group__8__Impl rule__Taetigkeit__Group__9 ;
    public final void rule__Taetigkeit__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3236:1: ( rule__Taetigkeit__Group__8__Impl rule__Taetigkeit__Group__9 )
            // InternalAhnen.g:3237:2: rule__Taetigkeit__Group__8__Impl rule__Taetigkeit__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__Taetigkeit__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__8"


    // $ANTLR start "rule__Taetigkeit__Group__8__Impl"
    // InternalAhnen.g:3244:1: rule__Taetigkeit__Group__8__Impl : ( 'von' ) ;
    public final void rule__Taetigkeit__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3248:1: ( ( 'von' ) )
            // InternalAhnen.g:3249:1: ( 'von' )
            {
            // InternalAhnen.g:3249:1: ( 'von' )
            // InternalAhnen.g:3250:2: 'von'
            {
             before(grammarAccess.getTaetigkeitAccess().getVonKeyword_8()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTaetigkeitAccess().getVonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__8__Impl"


    // $ANTLR start "rule__Taetigkeit__Group__9"
    // InternalAhnen.g:3259:1: rule__Taetigkeit__Group__9 : rule__Taetigkeit__Group__9__Impl rule__Taetigkeit__Group__10 ;
    public final void rule__Taetigkeit__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3263:1: ( rule__Taetigkeit__Group__9__Impl rule__Taetigkeit__Group__10 )
            // InternalAhnen.g:3264:2: rule__Taetigkeit__Group__9__Impl rule__Taetigkeit__Group__10
            {
            pushFollow(FOLLOW_43);
            rule__Taetigkeit__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__9"


    // $ANTLR start "rule__Taetigkeit__Group__9__Impl"
    // InternalAhnen.g:3271:1: rule__Taetigkeit__Group__9__Impl : ( ( rule__Taetigkeit__Alternatives_9 ) ) ;
    public final void rule__Taetigkeit__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3275:1: ( ( ( rule__Taetigkeit__Alternatives_9 ) ) )
            // InternalAhnen.g:3276:1: ( ( rule__Taetigkeit__Alternatives_9 ) )
            {
            // InternalAhnen.g:3276:1: ( ( rule__Taetigkeit__Alternatives_9 ) )
            // InternalAhnen.g:3277:2: ( rule__Taetigkeit__Alternatives_9 )
            {
             before(grammarAccess.getTaetigkeitAccess().getAlternatives_9()); 
            // InternalAhnen.g:3278:2: ( rule__Taetigkeit__Alternatives_9 )
            // InternalAhnen.g:3278:3: rule__Taetigkeit__Alternatives_9
            {
            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Alternatives_9();

            state._fsp--;


            }

             after(grammarAccess.getTaetigkeitAccess().getAlternatives_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__9__Impl"


    // $ANTLR start "rule__Taetigkeit__Group__10"
    // InternalAhnen.g:3286:1: rule__Taetigkeit__Group__10 : rule__Taetigkeit__Group__10__Impl rule__Taetigkeit__Group__11 ;
    public final void rule__Taetigkeit__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3290:1: ( rule__Taetigkeit__Group__10__Impl rule__Taetigkeit__Group__11 )
            // InternalAhnen.g:3291:2: rule__Taetigkeit__Group__10__Impl rule__Taetigkeit__Group__11
            {
            pushFollow(FOLLOW_26);
            rule__Taetigkeit__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__10"


    // $ANTLR start "rule__Taetigkeit__Group__10__Impl"
    // InternalAhnen.g:3298:1: rule__Taetigkeit__Group__10__Impl : ( 'bis' ) ;
    public final void rule__Taetigkeit__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3302:1: ( ( 'bis' ) )
            // InternalAhnen.g:3303:1: ( 'bis' )
            {
            // InternalAhnen.g:3303:1: ( 'bis' )
            // InternalAhnen.g:3304:2: 'bis'
            {
             before(grammarAccess.getTaetigkeitAccess().getBisKeyword_10()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTaetigkeitAccess().getBisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__10__Impl"


    // $ANTLR start "rule__Taetigkeit__Group__11"
    // InternalAhnen.g:3313:1: rule__Taetigkeit__Group__11 : rule__Taetigkeit__Group__11__Impl rule__Taetigkeit__Group__12 ;
    public final void rule__Taetigkeit__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3317:1: ( rule__Taetigkeit__Group__11__Impl rule__Taetigkeit__Group__12 )
            // InternalAhnen.g:3318:2: rule__Taetigkeit__Group__11__Impl rule__Taetigkeit__Group__12
            {
            pushFollow(FOLLOW_15);
            rule__Taetigkeit__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__11"


    // $ANTLR start "rule__Taetigkeit__Group__11__Impl"
    // InternalAhnen.g:3325:1: rule__Taetigkeit__Group__11__Impl : ( ( rule__Taetigkeit__Alternatives_11 ) ) ;
    public final void rule__Taetigkeit__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3329:1: ( ( ( rule__Taetigkeit__Alternatives_11 ) ) )
            // InternalAhnen.g:3330:1: ( ( rule__Taetigkeit__Alternatives_11 ) )
            {
            // InternalAhnen.g:3330:1: ( ( rule__Taetigkeit__Alternatives_11 ) )
            // InternalAhnen.g:3331:2: ( rule__Taetigkeit__Alternatives_11 )
            {
             before(grammarAccess.getTaetigkeitAccess().getAlternatives_11()); 
            // InternalAhnen.g:3332:2: ( rule__Taetigkeit__Alternatives_11 )
            // InternalAhnen.g:3332:3: rule__Taetigkeit__Alternatives_11
            {
            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Alternatives_11();

            state._fsp--;


            }

             after(grammarAccess.getTaetigkeitAccess().getAlternatives_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__11__Impl"


    // $ANTLR start "rule__Taetigkeit__Group__12"
    // InternalAhnen.g:3340:1: rule__Taetigkeit__Group__12 : rule__Taetigkeit__Group__12__Impl ;
    public final void rule__Taetigkeit__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3344:1: ( rule__Taetigkeit__Group__12__Impl )
            // InternalAhnen.g:3345:2: rule__Taetigkeit__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Taetigkeit__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__12"


    // $ANTLR start "rule__Taetigkeit__Group__12__Impl"
    // InternalAhnen.g:3351:1: rule__Taetigkeit__Group__12__Impl : ( '.' ) ;
    public final void rule__Taetigkeit__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3355:1: ( ( '.' ) )
            // InternalAhnen.g:3356:1: ( '.' )
            {
            // InternalAhnen.g:3356:1: ( '.' )
            // InternalAhnen.g:3357:2: '.'
            {
             before(grammarAccess.getTaetigkeitAccess().getFullStopKeyword_12()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTaetigkeitAccess().getFullStopKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__Group__12__Impl"


    // $ANTLR start "rule__Kinder__Group__0"
    // InternalAhnen.g:3367:1: rule__Kinder__Group__0 : rule__Kinder__Group__0__Impl rule__Kinder__Group__1 ;
    public final void rule__Kinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3371:1: ( rule__Kinder__Group__0__Impl rule__Kinder__Group__1 )
            // InternalAhnen.g:3372:2: rule__Kinder__Group__0__Impl rule__Kinder__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Kinder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kinder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinder__Group__0"


    // $ANTLR start "rule__Kinder__Group__0__Impl"
    // InternalAhnen.g:3379:1: rule__Kinder__Group__0__Impl : ( () ) ;
    public final void rule__Kinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3383:1: ( ( () ) )
            // InternalAhnen.g:3384:1: ( () )
            {
            // InternalAhnen.g:3384:1: ( () )
            // InternalAhnen.g:3385:2: ()
            {
             before(grammarAccess.getKinderAccess().getKinderAction_0()); 
            // InternalAhnen.g:3386:2: ()
            // InternalAhnen.g:3386:3: 
            {
            }

             after(grammarAccess.getKinderAccess().getKinderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinder__Group__0__Impl"


    // $ANTLR start "rule__Kinder__Group__1"
    // InternalAhnen.g:3394:1: rule__Kinder__Group__1 : rule__Kinder__Group__1__Impl rule__Kinder__Group__2 ;
    public final void rule__Kinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3398:1: ( rule__Kinder__Group__1__Impl rule__Kinder__Group__2 )
            // InternalAhnen.g:3399:2: rule__Kinder__Group__1__Impl rule__Kinder__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__Kinder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kinder__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinder__Group__1"


    // $ANTLR start "rule__Kinder__Group__1__Impl"
    // InternalAhnen.g:3406:1: rule__Kinder__Group__1__Impl : ( ( rule__Kinder__Alternatives_1 ) ) ;
    public final void rule__Kinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3410:1: ( ( ( rule__Kinder__Alternatives_1 ) ) )
            // InternalAhnen.g:3411:1: ( ( rule__Kinder__Alternatives_1 ) )
            {
            // InternalAhnen.g:3411:1: ( ( rule__Kinder__Alternatives_1 ) )
            // InternalAhnen.g:3412:2: ( rule__Kinder__Alternatives_1 )
            {
             before(grammarAccess.getKinderAccess().getAlternatives_1()); 
            // InternalAhnen.g:3413:2: ( rule__Kinder__Alternatives_1 )
            // InternalAhnen.g:3413:3: rule__Kinder__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Kinder__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getKinderAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinder__Group__1__Impl"


    // $ANTLR start "rule__Kinder__Group__2"
    // InternalAhnen.g:3421:1: rule__Kinder__Group__2 : rule__Kinder__Group__2__Impl ;
    public final void rule__Kinder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3425:1: ( rule__Kinder__Group__2__Impl )
            // InternalAhnen.g:3426:2: rule__Kinder__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kinder__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinder__Group__2"


    // $ANTLR start "rule__Kinder__Group__2__Impl"
    // InternalAhnen.g:3432:1: rule__Kinder__Group__2__Impl : ( ( rule__Kinder__Group_2__0 )? ) ;
    public final void rule__Kinder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3436:1: ( ( ( rule__Kinder__Group_2__0 )? ) )
            // InternalAhnen.g:3437:1: ( ( rule__Kinder__Group_2__0 )? )
            {
            // InternalAhnen.g:3437:1: ( ( rule__Kinder__Group_2__0 )? )
            // InternalAhnen.g:3438:2: ( rule__Kinder__Group_2__0 )?
            {
             before(grammarAccess.getKinderAccess().getGroup_2()); 
            // InternalAhnen.g:3439:2: ( rule__Kinder__Group_2__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==56) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAhnen.g:3439:3: rule__Kinder__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kinder__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKinderAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinder__Group__2__Impl"


    // $ANTLR start "rule__Kinder__Group_2__0"
    // InternalAhnen.g:3448:1: rule__Kinder__Group_2__0 : rule__Kinder__Group_2__0__Impl rule__Kinder__Group_2__1 ;
    public final void rule__Kinder__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3452:1: ( rule__Kinder__Group_2__0__Impl rule__Kinder__Group_2__1 )
            // InternalAhnen.g:3453:2: rule__Kinder__Group_2__0__Impl rule__Kinder__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__Kinder__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kinder__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinder__Group_2__0"


    // $ANTLR start "rule__Kinder__Group_2__0__Impl"
    // InternalAhnen.g:3460:1: rule__Kinder__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Kinder__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3464:1: ( ( ',' ) )
            // InternalAhnen.g:3465:1: ( ',' )
            {
            // InternalAhnen.g:3465:1: ( ',' )
            // InternalAhnen.g:3466:2: ','
            {
             before(grammarAccess.getKinderAccess().getCommaKeyword_2_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getKinderAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinder__Group_2__0__Impl"


    // $ANTLR start "rule__Kinder__Group_2__1"
    // InternalAhnen.g:3475:1: rule__Kinder__Group_2__1 : rule__Kinder__Group_2__1__Impl ;
    public final void rule__Kinder__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3479:1: ( rule__Kinder__Group_2__1__Impl )
            // InternalAhnen.g:3480:2: rule__Kinder__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kinder__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinder__Group_2__1"


    // $ANTLR start "rule__Kinder__Group_2__1__Impl"
    // InternalAhnen.g:3486:1: rule__Kinder__Group_2__1__Impl : ( ( rule__Kinder__NextAssignment_2_1 ) ) ;
    public final void rule__Kinder__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3490:1: ( ( ( rule__Kinder__NextAssignment_2_1 ) ) )
            // InternalAhnen.g:3491:1: ( ( rule__Kinder__NextAssignment_2_1 ) )
            {
            // InternalAhnen.g:3491:1: ( ( rule__Kinder__NextAssignment_2_1 ) )
            // InternalAhnen.g:3492:2: ( rule__Kinder__NextAssignment_2_1 )
            {
             before(grammarAccess.getKinderAccess().getNextAssignment_2_1()); 
            // InternalAhnen.g:3493:2: ( rule__Kinder__NextAssignment_2_1 )
            // InternalAhnen.g:3493:3: rule__Kinder__NextAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Kinder__NextAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getKinderAccess().getNextAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinder__Group_2__1__Impl"


    // $ANTLR start "rule__Beziehung__Group__0"
    // InternalAhnen.g:3502:1: rule__Beziehung__Group__0 : rule__Beziehung__Group__0__Impl rule__Beziehung__Group__1 ;
    public final void rule__Beziehung__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3506:1: ( rule__Beziehung__Group__0__Impl rule__Beziehung__Group__1 )
            // InternalAhnen.g:3507:2: rule__Beziehung__Group__0__Impl rule__Beziehung__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__Beziehung__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beziehung__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__0"


    // $ANTLR start "rule__Beziehung__Group__0__Impl"
    // InternalAhnen.g:3514:1: rule__Beziehung__Group__0__Impl : ( () ) ;
    public final void rule__Beziehung__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3518:1: ( ( () ) )
            // InternalAhnen.g:3519:1: ( () )
            {
            // InternalAhnen.g:3519:1: ( () )
            // InternalAhnen.g:3520:2: ()
            {
             before(grammarAccess.getBeziehungAccess().getBeziehungAction_0()); 
            // InternalAhnen.g:3521:2: ()
            // InternalAhnen.g:3521:3: 
            {
            }

             after(grammarAccess.getBeziehungAccess().getBeziehungAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__0__Impl"


    // $ANTLR start "rule__Beziehung__Group__1"
    // InternalAhnen.g:3529:1: rule__Beziehung__Group__1 : rule__Beziehung__Group__1__Impl rule__Beziehung__Group__2 ;
    public final void rule__Beziehung__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3533:1: ( rule__Beziehung__Group__1__Impl rule__Beziehung__Group__2 )
            // InternalAhnen.g:3534:2: rule__Beziehung__Group__1__Impl rule__Beziehung__Group__2
            {
            pushFollow(FOLLOW_52);
            rule__Beziehung__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beziehung__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__1"


    // $ANTLR start "rule__Beziehung__Group__1__Impl"
    // InternalAhnen.g:3541:1: rule__Beziehung__Group__1__Impl : ( 'Beziehung:' ) ;
    public final void rule__Beziehung__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3545:1: ( ( 'Beziehung:' ) )
            // InternalAhnen.g:3546:1: ( 'Beziehung:' )
            {
            // InternalAhnen.g:3546:1: ( 'Beziehung:' )
            // InternalAhnen.g:3547:2: 'Beziehung:'
            {
             before(grammarAccess.getBeziehungAccess().getBeziehungKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getBeziehungAccess().getBeziehungKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__1__Impl"


    // $ANTLR start "rule__Beziehung__Group__2"
    // InternalAhnen.g:3556:1: rule__Beziehung__Group__2 : rule__Beziehung__Group__2__Impl rule__Beziehung__Group__3 ;
    public final void rule__Beziehung__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3560:1: ( rule__Beziehung__Group__2__Impl rule__Beziehung__Group__3 )
            // InternalAhnen.g:3561:2: rule__Beziehung__Group__2__Impl rule__Beziehung__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Beziehung__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beziehung__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__2"


    // $ANTLR start "rule__Beziehung__Group__2__Impl"
    // InternalAhnen.g:3568:1: rule__Beziehung__Group__2__Impl : ( 'mit' ) ;
    public final void rule__Beziehung__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3572:1: ( ( 'mit' ) )
            // InternalAhnen.g:3573:1: ( 'mit' )
            {
            // InternalAhnen.g:3573:1: ( 'mit' )
            // InternalAhnen.g:3574:2: 'mit'
            {
             before(grammarAccess.getBeziehungAccess().getMitKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getBeziehungAccess().getMitKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__2__Impl"


    // $ANTLR start "rule__Beziehung__Group__3"
    // InternalAhnen.g:3583:1: rule__Beziehung__Group__3 : rule__Beziehung__Group__3__Impl rule__Beziehung__Group__4 ;
    public final void rule__Beziehung__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3587:1: ( rule__Beziehung__Group__3__Impl rule__Beziehung__Group__4 )
            // InternalAhnen.g:3588:2: rule__Beziehung__Group__3__Impl rule__Beziehung__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Beziehung__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beziehung__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__3"


    // $ANTLR start "rule__Beziehung__Group__3__Impl"
    // InternalAhnen.g:3595:1: rule__Beziehung__Group__3__Impl : ( ( rule__Beziehung__Alternatives_3 ) ) ;
    public final void rule__Beziehung__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3599:1: ( ( ( rule__Beziehung__Alternatives_3 ) ) )
            // InternalAhnen.g:3600:1: ( ( rule__Beziehung__Alternatives_3 ) )
            {
            // InternalAhnen.g:3600:1: ( ( rule__Beziehung__Alternatives_3 ) )
            // InternalAhnen.g:3601:2: ( rule__Beziehung__Alternatives_3 )
            {
             before(grammarAccess.getBeziehungAccess().getAlternatives_3()); 
            // InternalAhnen.g:3602:2: ( rule__Beziehung__Alternatives_3 )
            // InternalAhnen.g:3602:3: rule__Beziehung__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Beziehung__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getBeziehungAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__3__Impl"


    // $ANTLR start "rule__Beziehung__Group__4"
    // InternalAhnen.g:3610:1: rule__Beziehung__Group__4 : rule__Beziehung__Group__4__Impl rule__Beziehung__Group__5 ;
    public final void rule__Beziehung__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3614:1: ( rule__Beziehung__Group__4__Impl rule__Beziehung__Group__5 )
            // InternalAhnen.g:3615:2: rule__Beziehung__Group__4__Impl rule__Beziehung__Group__5
            {
            pushFollow(FOLLOW_53);
            rule__Beziehung__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beziehung__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__4"


    // $ANTLR start "rule__Beziehung__Group__4__Impl"
    // InternalAhnen.g:3622:1: rule__Beziehung__Group__4__Impl : ( '.' ) ;
    public final void rule__Beziehung__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3626:1: ( ( '.' ) )
            // InternalAhnen.g:3627:1: ( '.' )
            {
            // InternalAhnen.g:3627:1: ( '.' )
            // InternalAhnen.g:3628:2: '.'
            {
             before(grammarAccess.getBeziehungAccess().getFullStopKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBeziehungAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__4__Impl"


    // $ANTLR start "rule__Beziehung__Group__5"
    // InternalAhnen.g:3637:1: rule__Beziehung__Group__5 : rule__Beziehung__Group__5__Impl rule__Beziehung__Group__6 ;
    public final void rule__Beziehung__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3641:1: ( rule__Beziehung__Group__5__Impl rule__Beziehung__Group__6 )
            // InternalAhnen.g:3642:2: rule__Beziehung__Group__5__Impl rule__Beziehung__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Beziehung__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beziehung__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__5"


    // $ANTLR start "rule__Beziehung__Group__5__Impl"
    // InternalAhnen.g:3649:1: rule__Beziehung__Group__5__Impl : ( 'von:' ) ;
    public final void rule__Beziehung__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3653:1: ( ( 'von:' ) )
            // InternalAhnen.g:3654:1: ( 'von:' )
            {
            // InternalAhnen.g:3654:1: ( 'von:' )
            // InternalAhnen.g:3655:2: 'von:'
            {
             before(grammarAccess.getBeziehungAccess().getVonKeyword_5()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getBeziehungAccess().getVonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__5__Impl"


    // $ANTLR start "rule__Beziehung__Group__6"
    // InternalAhnen.g:3664:1: rule__Beziehung__Group__6 : rule__Beziehung__Group__6__Impl rule__Beziehung__Group__7 ;
    public final void rule__Beziehung__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3668:1: ( rule__Beziehung__Group__6__Impl rule__Beziehung__Group__7 )
            // InternalAhnen.g:3669:2: rule__Beziehung__Group__6__Impl rule__Beziehung__Group__7
            {
            pushFollow(FOLLOW_54);
            rule__Beziehung__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beziehung__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__6"


    // $ANTLR start "rule__Beziehung__Group__6__Impl"
    // InternalAhnen.g:3676:1: rule__Beziehung__Group__6__Impl : ( ( rule__Beziehung__Alternatives_6 ) ) ;
    public final void rule__Beziehung__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3680:1: ( ( ( rule__Beziehung__Alternatives_6 ) ) )
            // InternalAhnen.g:3681:1: ( ( rule__Beziehung__Alternatives_6 ) )
            {
            // InternalAhnen.g:3681:1: ( ( rule__Beziehung__Alternatives_6 ) )
            // InternalAhnen.g:3682:2: ( rule__Beziehung__Alternatives_6 )
            {
             before(grammarAccess.getBeziehungAccess().getAlternatives_6()); 
            // InternalAhnen.g:3683:2: ( rule__Beziehung__Alternatives_6 )
            // InternalAhnen.g:3683:3: rule__Beziehung__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__Beziehung__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getBeziehungAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__6__Impl"


    // $ANTLR start "rule__Beziehung__Group__7"
    // InternalAhnen.g:3691:1: rule__Beziehung__Group__7 : rule__Beziehung__Group__7__Impl rule__Beziehung__Group__8 ;
    public final void rule__Beziehung__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3695:1: ( rule__Beziehung__Group__7__Impl rule__Beziehung__Group__8 )
            // InternalAhnen.g:3696:2: rule__Beziehung__Group__7__Impl rule__Beziehung__Group__8
            {
            pushFollow(FOLLOW_55);
            rule__Beziehung__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beziehung__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__7"


    // $ANTLR start "rule__Beziehung__Group__7__Impl"
    // InternalAhnen.g:3703:1: rule__Beziehung__Group__7__Impl : ( 'bis:' ) ;
    public final void rule__Beziehung__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3707:1: ( ( 'bis:' ) )
            // InternalAhnen.g:3708:1: ( 'bis:' )
            {
            // InternalAhnen.g:3708:1: ( 'bis:' )
            // InternalAhnen.g:3709:2: 'bis:'
            {
             before(grammarAccess.getBeziehungAccess().getBisKeyword_7()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getBeziehungAccess().getBisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__7__Impl"


    // $ANTLR start "rule__Beziehung__Group__8"
    // InternalAhnen.g:3718:1: rule__Beziehung__Group__8 : rule__Beziehung__Group__8__Impl rule__Beziehung__Group__9 ;
    public final void rule__Beziehung__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3722:1: ( rule__Beziehung__Group__8__Impl rule__Beziehung__Group__9 )
            // InternalAhnen.g:3723:2: rule__Beziehung__Group__8__Impl rule__Beziehung__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Beziehung__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beziehung__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__8"


    // $ANTLR start "rule__Beziehung__Group__8__Impl"
    // InternalAhnen.g:3730:1: rule__Beziehung__Group__8__Impl : ( ( rule__Beziehung__Alternatives_8 ) ) ;
    public final void rule__Beziehung__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3734:1: ( ( ( rule__Beziehung__Alternatives_8 ) ) )
            // InternalAhnen.g:3735:1: ( ( rule__Beziehung__Alternatives_8 ) )
            {
            // InternalAhnen.g:3735:1: ( ( rule__Beziehung__Alternatives_8 ) )
            // InternalAhnen.g:3736:2: ( rule__Beziehung__Alternatives_8 )
            {
             before(grammarAccess.getBeziehungAccess().getAlternatives_8()); 
            // InternalAhnen.g:3737:2: ( rule__Beziehung__Alternatives_8 )
            // InternalAhnen.g:3737:3: rule__Beziehung__Alternatives_8
            {
            pushFollow(FOLLOW_2);
            rule__Beziehung__Alternatives_8();

            state._fsp--;


            }

             after(grammarAccess.getBeziehungAccess().getAlternatives_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__8__Impl"


    // $ANTLR start "rule__Beziehung__Group__9"
    // InternalAhnen.g:3745:1: rule__Beziehung__Group__9 : rule__Beziehung__Group__9__Impl rule__Beziehung__Group__10 ;
    public final void rule__Beziehung__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3749:1: ( rule__Beziehung__Group__9__Impl rule__Beziehung__Group__10 )
            // InternalAhnen.g:3750:2: rule__Beziehung__Group__9__Impl rule__Beziehung__Group__10
            {
            pushFollow(FOLLOW_56);
            rule__Beziehung__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beziehung__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__9"


    // $ANTLR start "rule__Beziehung__Group__9__Impl"
    // InternalAhnen.g:3757:1: rule__Beziehung__Group__9__Impl : ( '.' ) ;
    public final void rule__Beziehung__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3761:1: ( ( '.' ) )
            // InternalAhnen.g:3762:1: ( '.' )
            {
            // InternalAhnen.g:3762:1: ( '.' )
            // InternalAhnen.g:3763:2: '.'
            {
             before(grammarAccess.getBeziehungAccess().getFullStopKeyword_9()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBeziehungAccess().getFullStopKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__9__Impl"


    // $ANTLR start "rule__Beziehung__Group__10"
    // InternalAhnen.g:3772:1: rule__Beziehung__Group__10 : rule__Beziehung__Group__10__Impl rule__Beziehung__Group__11 ;
    public final void rule__Beziehung__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3776:1: ( rule__Beziehung__Group__10__Impl rule__Beziehung__Group__11 )
            // InternalAhnen.g:3777:2: rule__Beziehung__Group__10__Impl rule__Beziehung__Group__11
            {
            pushFollow(FOLLOW_57);
            rule__Beziehung__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beziehung__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__10"


    // $ANTLR start "rule__Beziehung__Group__10__Impl"
    // InternalAhnen.g:3784:1: rule__Beziehung__Group__10__Impl : ( 'Hochzeit:' ) ;
    public final void rule__Beziehung__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3788:1: ( ( 'Hochzeit:' ) )
            // InternalAhnen.g:3789:1: ( 'Hochzeit:' )
            {
            // InternalAhnen.g:3789:1: ( 'Hochzeit:' )
            // InternalAhnen.g:3790:2: 'Hochzeit:'
            {
             before(grammarAccess.getBeziehungAccess().getHochzeitKeyword_10()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getBeziehungAccess().getHochzeitKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__10__Impl"


    // $ANTLR start "rule__Beziehung__Group__11"
    // InternalAhnen.g:3799:1: rule__Beziehung__Group__11 : rule__Beziehung__Group__11__Impl rule__Beziehung__Group__12 ;
    public final void rule__Beziehung__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3803:1: ( rule__Beziehung__Group__11__Impl rule__Beziehung__Group__12 )
            // InternalAhnen.g:3804:2: rule__Beziehung__Group__11__Impl rule__Beziehung__Group__12
            {
            pushFollow(FOLLOW_15);
            rule__Beziehung__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beziehung__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__11"


    // $ANTLR start "rule__Beziehung__Group__11__Impl"
    // InternalAhnen.g:3811:1: rule__Beziehung__Group__11__Impl : ( ( rule__Beziehung__Alternatives_11 ) ) ;
    public final void rule__Beziehung__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3815:1: ( ( ( rule__Beziehung__Alternatives_11 ) ) )
            // InternalAhnen.g:3816:1: ( ( rule__Beziehung__Alternatives_11 ) )
            {
            // InternalAhnen.g:3816:1: ( ( rule__Beziehung__Alternatives_11 ) )
            // InternalAhnen.g:3817:2: ( rule__Beziehung__Alternatives_11 )
            {
             before(grammarAccess.getBeziehungAccess().getAlternatives_11()); 
            // InternalAhnen.g:3818:2: ( rule__Beziehung__Alternatives_11 )
            // InternalAhnen.g:3818:3: rule__Beziehung__Alternatives_11
            {
            pushFollow(FOLLOW_2);
            rule__Beziehung__Alternatives_11();

            state._fsp--;


            }

             after(grammarAccess.getBeziehungAccess().getAlternatives_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__11__Impl"


    // $ANTLR start "rule__Beziehung__Group__12"
    // InternalAhnen.g:3826:1: rule__Beziehung__Group__12 : rule__Beziehung__Group__12__Impl rule__Beziehung__Group__13 ;
    public final void rule__Beziehung__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3830:1: ( rule__Beziehung__Group__12__Impl rule__Beziehung__Group__13 )
            // InternalAhnen.g:3831:2: rule__Beziehung__Group__12__Impl rule__Beziehung__Group__13
            {
            pushFollow(FOLLOW_58);
            rule__Beziehung__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beziehung__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__12"


    // $ANTLR start "rule__Beziehung__Group__12__Impl"
    // InternalAhnen.g:3838:1: rule__Beziehung__Group__12__Impl : ( '.' ) ;
    public final void rule__Beziehung__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3842:1: ( ( '.' ) )
            // InternalAhnen.g:3843:1: ( '.' )
            {
            // InternalAhnen.g:3843:1: ( '.' )
            // InternalAhnen.g:3844:2: '.'
            {
             before(grammarAccess.getBeziehungAccess().getFullStopKeyword_12()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBeziehungAccess().getFullStopKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__12__Impl"


    // $ANTLR start "rule__Beziehung__Group__13"
    // InternalAhnen.g:3853:1: rule__Beziehung__Group__13 : rule__Beziehung__Group__13__Impl rule__Beziehung__Group__14 ;
    public final void rule__Beziehung__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3857:1: ( rule__Beziehung__Group__13__Impl rule__Beziehung__Group__14 )
            // InternalAhnen.g:3858:2: rule__Beziehung__Group__13__Impl rule__Beziehung__Group__14
            {
            pushFollow(FOLLOW_59);
            rule__Beziehung__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beziehung__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__13"


    // $ANTLR start "rule__Beziehung__Group__13__Impl"
    // InternalAhnen.g:3865:1: rule__Beziehung__Group__13__Impl : ( 'Scheidung:' ) ;
    public final void rule__Beziehung__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3869:1: ( ( 'Scheidung:' ) )
            // InternalAhnen.g:3870:1: ( 'Scheidung:' )
            {
            // InternalAhnen.g:3870:1: ( 'Scheidung:' )
            // InternalAhnen.g:3871:2: 'Scheidung:'
            {
             before(grammarAccess.getBeziehungAccess().getScheidungKeyword_13()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getBeziehungAccess().getScheidungKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__13__Impl"


    // $ANTLR start "rule__Beziehung__Group__14"
    // InternalAhnen.g:3880:1: rule__Beziehung__Group__14 : rule__Beziehung__Group__14__Impl rule__Beziehung__Group__15 ;
    public final void rule__Beziehung__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3884:1: ( rule__Beziehung__Group__14__Impl rule__Beziehung__Group__15 )
            // InternalAhnen.g:3885:2: rule__Beziehung__Group__14__Impl rule__Beziehung__Group__15
            {
            pushFollow(FOLLOW_15);
            rule__Beziehung__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beziehung__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__14"


    // $ANTLR start "rule__Beziehung__Group__14__Impl"
    // InternalAhnen.g:3892:1: rule__Beziehung__Group__14__Impl : ( ( rule__Beziehung__Alternatives_14 ) ) ;
    public final void rule__Beziehung__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3896:1: ( ( ( rule__Beziehung__Alternatives_14 ) ) )
            // InternalAhnen.g:3897:1: ( ( rule__Beziehung__Alternatives_14 ) )
            {
            // InternalAhnen.g:3897:1: ( ( rule__Beziehung__Alternatives_14 ) )
            // InternalAhnen.g:3898:2: ( rule__Beziehung__Alternatives_14 )
            {
             before(grammarAccess.getBeziehungAccess().getAlternatives_14()); 
            // InternalAhnen.g:3899:2: ( rule__Beziehung__Alternatives_14 )
            // InternalAhnen.g:3899:3: rule__Beziehung__Alternatives_14
            {
            pushFollow(FOLLOW_2);
            rule__Beziehung__Alternatives_14();

            state._fsp--;


            }

             after(grammarAccess.getBeziehungAccess().getAlternatives_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__14__Impl"


    // $ANTLR start "rule__Beziehung__Group__15"
    // InternalAhnen.g:3907:1: rule__Beziehung__Group__15 : rule__Beziehung__Group__15__Impl ;
    public final void rule__Beziehung__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3911:1: ( rule__Beziehung__Group__15__Impl )
            // InternalAhnen.g:3912:2: rule__Beziehung__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Beziehung__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__15"


    // $ANTLR start "rule__Beziehung__Group__15__Impl"
    // InternalAhnen.g:3918:1: rule__Beziehung__Group__15__Impl : ( '.' ) ;
    public final void rule__Beziehung__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3922:1: ( ( '.' ) )
            // InternalAhnen.g:3923:1: ( '.' )
            {
            // InternalAhnen.g:3923:1: ( '.' )
            // InternalAhnen.g:3924:2: '.'
            {
             before(grammarAccess.getBeziehungAccess().getFullStopKeyword_15()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBeziehungAccess().getFullStopKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__15__Impl"


    // $ANTLR start "rule__Familienbuch__Group__0"
    // InternalAhnen.g:3934:1: rule__Familienbuch__Group__0 : rule__Familienbuch__Group__0__Impl rule__Familienbuch__Group__1 ;
    public final void rule__Familienbuch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3938:1: ( rule__Familienbuch__Group__0__Impl rule__Familienbuch__Group__1 )
            // InternalAhnen.g:3939:2: rule__Familienbuch__Group__0__Impl rule__Familienbuch__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Familienbuch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__0"


    // $ANTLR start "rule__Familienbuch__Group__0__Impl"
    // InternalAhnen.g:3946:1: rule__Familienbuch__Group__0__Impl : ( 'Familienbuch' ) ;
    public final void rule__Familienbuch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3950:1: ( ( 'Familienbuch' ) )
            // InternalAhnen.g:3951:1: ( 'Familienbuch' )
            {
            // InternalAhnen.g:3951:1: ( 'Familienbuch' )
            // InternalAhnen.g:3952:2: 'Familienbuch'
            {
             before(grammarAccess.getFamilienbuchAccess().getFamilienbuchKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getFamilienbuchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__0__Impl"


    // $ANTLR start "rule__Familienbuch__Group__1"
    // InternalAhnen.g:3961:1: rule__Familienbuch__Group__1 : rule__Familienbuch__Group__1__Impl rule__Familienbuch__Group__2 ;
    public final void rule__Familienbuch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3965:1: ( rule__Familienbuch__Group__1__Impl rule__Familienbuch__Group__2 )
            // InternalAhnen.g:3966:2: rule__Familienbuch__Group__1__Impl rule__Familienbuch__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Familienbuch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__1"


    // $ANTLR start "rule__Familienbuch__Group__1__Impl"
    // InternalAhnen.g:3973:1: rule__Familienbuch__Group__1__Impl : ( ( rule__Familienbuch__NameAssignment_1 ) ) ;
    public final void rule__Familienbuch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3977:1: ( ( ( rule__Familienbuch__NameAssignment_1 ) ) )
            // InternalAhnen.g:3978:1: ( ( rule__Familienbuch__NameAssignment_1 ) )
            {
            // InternalAhnen.g:3978:1: ( ( rule__Familienbuch__NameAssignment_1 ) )
            // InternalAhnen.g:3979:2: ( rule__Familienbuch__NameAssignment_1 )
            {
             before(grammarAccess.getFamilienbuchAccess().getNameAssignment_1()); 
            // InternalAhnen.g:3980:2: ( rule__Familienbuch__NameAssignment_1 )
            // InternalAhnen.g:3980:3: rule__Familienbuch__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Familienbuch__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFamilienbuchAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__1__Impl"


    // $ANTLR start "rule__Familienbuch__Group__2"
    // InternalAhnen.g:3988:1: rule__Familienbuch__Group__2 : rule__Familienbuch__Group__2__Impl rule__Familienbuch__Group__3 ;
    public final void rule__Familienbuch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:3992:1: ( rule__Familienbuch__Group__2__Impl rule__Familienbuch__Group__3 )
            // InternalAhnen.g:3993:2: rule__Familienbuch__Group__2__Impl rule__Familienbuch__Group__3
            {
            pushFollow(FOLLOW_60);
            rule__Familienbuch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__2"


    // $ANTLR start "rule__Familienbuch__Group__2__Impl"
    // InternalAhnen.g:4000:1: rule__Familienbuch__Group__2__Impl : ( ';' ) ;
    public final void rule__Familienbuch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4004:1: ( ( ';' ) )
            // InternalAhnen.g:4005:1: ( ';' )
            {
            // InternalAhnen.g:4005:1: ( ';' )
            // InternalAhnen.g:4006:2: ';'
            {
             before(grammarAccess.getFamilienbuchAccess().getSemicolonKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__2__Impl"


    // $ANTLR start "rule__Familienbuch__Group__3"
    // InternalAhnen.g:4015:1: rule__Familienbuch__Group__3 : rule__Familienbuch__Group__3__Impl rule__Familienbuch__Group__4 ;
    public final void rule__Familienbuch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4019:1: ( rule__Familienbuch__Group__3__Impl rule__Familienbuch__Group__4 )
            // InternalAhnen.g:4020:2: rule__Familienbuch__Group__3__Impl rule__Familienbuch__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Familienbuch__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__3"


    // $ANTLR start "rule__Familienbuch__Group__3__Impl"
    // InternalAhnen.g:4027:1: rule__Familienbuch__Group__3__Impl : ( 'Familie:' ) ;
    public final void rule__Familienbuch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4031:1: ( ( 'Familie:' ) )
            // InternalAhnen.g:4032:1: ( 'Familie:' )
            {
            // InternalAhnen.g:4032:1: ( 'Familie:' )
            // InternalAhnen.g:4033:2: 'Familie:'
            {
             before(grammarAccess.getFamilienbuchAccess().getFamilieKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getFamilieKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__3__Impl"


    // $ANTLR start "rule__Familienbuch__Group__4"
    // InternalAhnen.g:4042:1: rule__Familienbuch__Group__4 : rule__Familienbuch__Group__4__Impl rule__Familienbuch__Group__5 ;
    public final void rule__Familienbuch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4046:1: ( rule__Familienbuch__Group__4__Impl rule__Familienbuch__Group__5 )
            // InternalAhnen.g:4047:2: rule__Familienbuch__Group__4__Impl rule__Familienbuch__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Familienbuch__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__4"


    // $ANTLR start "rule__Familienbuch__Group__4__Impl"
    // InternalAhnen.g:4054:1: rule__Familienbuch__Group__4__Impl : ( ( rule__Familienbuch__FamilieAssignment_4 ) ) ;
    public final void rule__Familienbuch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4058:1: ( ( ( rule__Familienbuch__FamilieAssignment_4 ) ) )
            // InternalAhnen.g:4059:1: ( ( rule__Familienbuch__FamilieAssignment_4 ) )
            {
            // InternalAhnen.g:4059:1: ( ( rule__Familienbuch__FamilieAssignment_4 ) )
            // InternalAhnen.g:4060:2: ( rule__Familienbuch__FamilieAssignment_4 )
            {
             before(grammarAccess.getFamilienbuchAccess().getFamilieAssignment_4()); 
            // InternalAhnen.g:4061:2: ( rule__Familienbuch__FamilieAssignment_4 )
            // InternalAhnen.g:4061:3: rule__Familienbuch__FamilieAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Familienbuch__FamilieAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFamilienbuchAccess().getFamilieAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__4__Impl"


    // $ANTLR start "rule__Familienbuch__Group__5"
    // InternalAhnen.g:4069:1: rule__Familienbuch__Group__5 : rule__Familienbuch__Group__5__Impl rule__Familienbuch__Group__6 ;
    public final void rule__Familienbuch__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4073:1: ( rule__Familienbuch__Group__5__Impl rule__Familienbuch__Group__6 )
            // InternalAhnen.g:4074:2: rule__Familienbuch__Group__5__Impl rule__Familienbuch__Group__6
            {
            pushFollow(FOLLOW_61);
            rule__Familienbuch__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__5"


    // $ANTLR start "rule__Familienbuch__Group__5__Impl"
    // InternalAhnen.g:4081:1: rule__Familienbuch__Group__5__Impl : ( '.' ) ;
    public final void rule__Familienbuch__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4085:1: ( ( '.' ) )
            // InternalAhnen.g:4086:1: ( '.' )
            {
            // InternalAhnen.g:4086:1: ( '.' )
            // InternalAhnen.g:4087:2: '.'
            {
             before(grammarAccess.getFamilienbuchAccess().getFullStopKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__5__Impl"


    // $ANTLR start "rule__Familienbuch__Group__6"
    // InternalAhnen.g:4096:1: rule__Familienbuch__Group__6 : rule__Familienbuch__Group__6__Impl rule__Familienbuch__Group__7 ;
    public final void rule__Familienbuch__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4100:1: ( rule__Familienbuch__Group__6__Impl rule__Familienbuch__Group__7 )
            // InternalAhnen.g:4101:2: rule__Familienbuch__Group__6__Impl rule__Familienbuch__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Familienbuch__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__6"


    // $ANTLR start "rule__Familienbuch__Group__6__Impl"
    // InternalAhnen.g:4108:1: rule__Familienbuch__Group__6__Impl : ( 'Person:' ) ;
    public final void rule__Familienbuch__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4112:1: ( ( 'Person:' ) )
            // InternalAhnen.g:4113:1: ( 'Person:' )
            {
            // InternalAhnen.g:4113:1: ( 'Person:' )
            // InternalAhnen.g:4114:2: 'Person:'
            {
             before(grammarAccess.getFamilienbuchAccess().getPersonKeyword_6()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getPersonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__6__Impl"


    // $ANTLR start "rule__Familienbuch__Group__7"
    // InternalAhnen.g:4123:1: rule__Familienbuch__Group__7 : rule__Familienbuch__Group__7__Impl rule__Familienbuch__Group__8 ;
    public final void rule__Familienbuch__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4127:1: ( rule__Familienbuch__Group__7__Impl rule__Familienbuch__Group__8 )
            // InternalAhnen.g:4128:2: rule__Familienbuch__Group__7__Impl rule__Familienbuch__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Familienbuch__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__7"


    // $ANTLR start "rule__Familienbuch__Group__7__Impl"
    // InternalAhnen.g:4135:1: rule__Familienbuch__Group__7__Impl : ( ( rule__Familienbuch__PersonAssignment_7 ) ) ;
    public final void rule__Familienbuch__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4139:1: ( ( ( rule__Familienbuch__PersonAssignment_7 ) ) )
            // InternalAhnen.g:4140:1: ( ( rule__Familienbuch__PersonAssignment_7 ) )
            {
            // InternalAhnen.g:4140:1: ( ( rule__Familienbuch__PersonAssignment_7 ) )
            // InternalAhnen.g:4141:2: ( rule__Familienbuch__PersonAssignment_7 )
            {
             before(grammarAccess.getFamilienbuchAccess().getPersonAssignment_7()); 
            // InternalAhnen.g:4142:2: ( rule__Familienbuch__PersonAssignment_7 )
            // InternalAhnen.g:4142:3: rule__Familienbuch__PersonAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Familienbuch__PersonAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFamilienbuchAccess().getPersonAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__7__Impl"


    // $ANTLR start "rule__Familienbuch__Group__8"
    // InternalAhnen.g:4150:1: rule__Familienbuch__Group__8 : rule__Familienbuch__Group__8__Impl rule__Familienbuch__Group__9 ;
    public final void rule__Familienbuch__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4154:1: ( rule__Familienbuch__Group__8__Impl rule__Familienbuch__Group__9 )
            // InternalAhnen.g:4155:2: rule__Familienbuch__Group__8__Impl rule__Familienbuch__Group__9
            {
            pushFollow(FOLLOW_62);
            rule__Familienbuch__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__8"


    // $ANTLR start "rule__Familienbuch__Group__8__Impl"
    // InternalAhnen.g:4162:1: rule__Familienbuch__Group__8__Impl : ( '.' ) ;
    public final void rule__Familienbuch__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4166:1: ( ( '.' ) )
            // InternalAhnen.g:4167:1: ( '.' )
            {
            // InternalAhnen.g:4167:1: ( '.' )
            // InternalAhnen.g:4168:2: '.'
            {
             before(grammarAccess.getFamilienbuchAccess().getFullStopKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getFullStopKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__8__Impl"


    // $ANTLR start "rule__Familienbuch__Group__9"
    // InternalAhnen.g:4177:1: rule__Familienbuch__Group__9 : rule__Familienbuch__Group__9__Impl rule__Familienbuch__Group__10 ;
    public final void rule__Familienbuch__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4181:1: ( rule__Familienbuch__Group__9__Impl rule__Familienbuch__Group__10 )
            // InternalAhnen.g:4182:2: rule__Familienbuch__Group__9__Impl rule__Familienbuch__Group__10
            {
            pushFollow(FOLLOW_63);
            rule__Familienbuch__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__9"


    // $ANTLR start "rule__Familienbuch__Group__9__Impl"
    // InternalAhnen.g:4189:1: rule__Familienbuch__Group__9__Impl : ( 'Version:' ) ;
    public final void rule__Familienbuch__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4193:1: ( ( 'Version:' ) )
            // InternalAhnen.g:4194:1: ( 'Version:' )
            {
            // InternalAhnen.g:4194:1: ( 'Version:' )
            // InternalAhnen.g:4195:2: 'Version:'
            {
             before(grammarAccess.getFamilienbuchAccess().getVersionKeyword_9()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getVersionKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__9__Impl"


    // $ANTLR start "rule__Familienbuch__Group__10"
    // InternalAhnen.g:4204:1: rule__Familienbuch__Group__10 : rule__Familienbuch__Group__10__Impl rule__Familienbuch__Group__11 ;
    public final void rule__Familienbuch__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4208:1: ( rule__Familienbuch__Group__10__Impl rule__Familienbuch__Group__11 )
            // InternalAhnen.g:4209:2: rule__Familienbuch__Group__10__Impl rule__Familienbuch__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__Familienbuch__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__10"


    // $ANTLR start "rule__Familienbuch__Group__10__Impl"
    // InternalAhnen.g:4216:1: rule__Familienbuch__Group__10__Impl : ( ( rule__Familienbuch__VersionAssignment_10 ) ) ;
    public final void rule__Familienbuch__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4220:1: ( ( ( rule__Familienbuch__VersionAssignment_10 ) ) )
            // InternalAhnen.g:4221:1: ( ( rule__Familienbuch__VersionAssignment_10 ) )
            {
            // InternalAhnen.g:4221:1: ( ( rule__Familienbuch__VersionAssignment_10 ) )
            // InternalAhnen.g:4222:2: ( rule__Familienbuch__VersionAssignment_10 )
            {
             before(grammarAccess.getFamilienbuchAccess().getVersionAssignment_10()); 
            // InternalAhnen.g:4223:2: ( rule__Familienbuch__VersionAssignment_10 )
            // InternalAhnen.g:4223:3: rule__Familienbuch__VersionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Familienbuch__VersionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getFamilienbuchAccess().getVersionAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__10__Impl"


    // $ANTLR start "rule__Familienbuch__Group__11"
    // InternalAhnen.g:4231:1: rule__Familienbuch__Group__11 : rule__Familienbuch__Group__11__Impl rule__Familienbuch__Group__12 ;
    public final void rule__Familienbuch__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4235:1: ( rule__Familienbuch__Group__11__Impl rule__Familienbuch__Group__12 )
            // InternalAhnen.g:4236:2: rule__Familienbuch__Group__11__Impl rule__Familienbuch__Group__12
            {
            pushFollow(FOLLOW_64);
            rule__Familienbuch__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__11"


    // $ANTLR start "rule__Familienbuch__Group__11__Impl"
    // InternalAhnen.g:4243:1: rule__Familienbuch__Group__11__Impl : ( '.' ) ;
    public final void rule__Familienbuch__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4247:1: ( ( '.' ) )
            // InternalAhnen.g:4248:1: ( '.' )
            {
            // InternalAhnen.g:4248:1: ( '.' )
            // InternalAhnen.g:4249:2: '.'
            {
             before(grammarAccess.getFamilienbuchAccess().getFullStopKeyword_11()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getFullStopKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__11__Impl"


    // $ANTLR start "rule__Familienbuch__Group__12"
    // InternalAhnen.g:4258:1: rule__Familienbuch__Group__12 : rule__Familienbuch__Group__12__Impl rule__Familienbuch__Group__13 ;
    public final void rule__Familienbuch__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4262:1: ( rule__Familienbuch__Group__12__Impl rule__Familienbuch__Group__13 )
            // InternalAhnen.g:4263:2: rule__Familienbuch__Group__12__Impl rule__Familienbuch__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__Familienbuch__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__12"


    // $ANTLR start "rule__Familienbuch__Group__12__Impl"
    // InternalAhnen.g:4270:1: rule__Familienbuch__Group__12__Impl : ( 'Titel:' ) ;
    public final void rule__Familienbuch__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4274:1: ( ( 'Titel:' ) )
            // InternalAhnen.g:4275:1: ( 'Titel:' )
            {
            // InternalAhnen.g:4275:1: ( 'Titel:' )
            // InternalAhnen.g:4276:2: 'Titel:'
            {
             before(grammarAccess.getFamilienbuchAccess().getTitelKeyword_12()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getTitelKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__12__Impl"


    // $ANTLR start "rule__Familienbuch__Group__13"
    // InternalAhnen.g:4285:1: rule__Familienbuch__Group__13 : rule__Familienbuch__Group__13__Impl rule__Familienbuch__Group__14 ;
    public final void rule__Familienbuch__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4289:1: ( rule__Familienbuch__Group__13__Impl rule__Familienbuch__Group__14 )
            // InternalAhnen.g:4290:2: rule__Familienbuch__Group__13__Impl rule__Familienbuch__Group__14
            {
            pushFollow(FOLLOW_15);
            rule__Familienbuch__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__13"


    // $ANTLR start "rule__Familienbuch__Group__13__Impl"
    // InternalAhnen.g:4297:1: rule__Familienbuch__Group__13__Impl : ( ( rule__Familienbuch__TitelAssignment_13 ) ) ;
    public final void rule__Familienbuch__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4301:1: ( ( ( rule__Familienbuch__TitelAssignment_13 ) ) )
            // InternalAhnen.g:4302:1: ( ( rule__Familienbuch__TitelAssignment_13 ) )
            {
            // InternalAhnen.g:4302:1: ( ( rule__Familienbuch__TitelAssignment_13 ) )
            // InternalAhnen.g:4303:2: ( rule__Familienbuch__TitelAssignment_13 )
            {
             before(grammarAccess.getFamilienbuchAccess().getTitelAssignment_13()); 
            // InternalAhnen.g:4304:2: ( rule__Familienbuch__TitelAssignment_13 )
            // InternalAhnen.g:4304:3: rule__Familienbuch__TitelAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Familienbuch__TitelAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getFamilienbuchAccess().getTitelAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__13__Impl"


    // $ANTLR start "rule__Familienbuch__Group__14"
    // InternalAhnen.g:4312:1: rule__Familienbuch__Group__14 : rule__Familienbuch__Group__14__Impl rule__Familienbuch__Group__15 ;
    public final void rule__Familienbuch__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4316:1: ( rule__Familienbuch__Group__14__Impl rule__Familienbuch__Group__15 )
            // InternalAhnen.g:4317:2: rule__Familienbuch__Group__14__Impl rule__Familienbuch__Group__15
            {
            pushFollow(FOLLOW_65);
            rule__Familienbuch__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__14"


    // $ANTLR start "rule__Familienbuch__Group__14__Impl"
    // InternalAhnen.g:4324:1: rule__Familienbuch__Group__14__Impl : ( '.' ) ;
    public final void rule__Familienbuch__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4328:1: ( ( '.' ) )
            // InternalAhnen.g:4329:1: ( '.' )
            {
            // InternalAhnen.g:4329:1: ( '.' )
            // InternalAhnen.g:4330:2: '.'
            {
             before(grammarAccess.getFamilienbuchAccess().getFullStopKeyword_14()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getFullStopKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__14__Impl"


    // $ANTLR start "rule__Familienbuch__Group__15"
    // InternalAhnen.g:4339:1: rule__Familienbuch__Group__15 : rule__Familienbuch__Group__15__Impl rule__Familienbuch__Group__16 ;
    public final void rule__Familienbuch__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4343:1: ( rule__Familienbuch__Group__15__Impl rule__Familienbuch__Group__16 )
            // InternalAhnen.g:4344:2: rule__Familienbuch__Group__15__Impl rule__Familienbuch__Group__16
            {
            pushFollow(FOLLOW_11);
            rule__Familienbuch__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__15"


    // $ANTLR start "rule__Familienbuch__Group__15__Impl"
    // InternalAhnen.g:4351:1: rule__Familienbuch__Group__15__Impl : ( 'Vorwort:' ) ;
    public final void rule__Familienbuch__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4355:1: ( ( 'Vorwort:' ) )
            // InternalAhnen.g:4356:1: ( 'Vorwort:' )
            {
            // InternalAhnen.g:4356:1: ( 'Vorwort:' )
            // InternalAhnen.g:4357:2: 'Vorwort:'
            {
             before(grammarAccess.getFamilienbuchAccess().getVorwortKeyword_15()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getVorwortKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__15__Impl"


    // $ANTLR start "rule__Familienbuch__Group__16"
    // InternalAhnen.g:4366:1: rule__Familienbuch__Group__16 : rule__Familienbuch__Group__16__Impl rule__Familienbuch__Group__17 ;
    public final void rule__Familienbuch__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4370:1: ( rule__Familienbuch__Group__16__Impl rule__Familienbuch__Group__17 )
            // InternalAhnen.g:4371:2: rule__Familienbuch__Group__16__Impl rule__Familienbuch__Group__17
            {
            pushFollow(FOLLOW_10);
            rule__Familienbuch__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__16"


    // $ANTLR start "rule__Familienbuch__Group__16__Impl"
    // InternalAhnen.g:4378:1: rule__Familienbuch__Group__16__Impl : ( '{' ) ;
    public final void rule__Familienbuch__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4382:1: ( ( '{' ) )
            // InternalAhnen.g:4383:1: ( '{' )
            {
            // InternalAhnen.g:4383:1: ( '{' )
            // InternalAhnen.g:4384:2: '{'
            {
             before(grammarAccess.getFamilienbuchAccess().getLeftCurlyBracketKeyword_16()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getLeftCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__16__Impl"


    // $ANTLR start "rule__Familienbuch__Group__17"
    // InternalAhnen.g:4393:1: rule__Familienbuch__Group__17 : rule__Familienbuch__Group__17__Impl rule__Familienbuch__Group__18 ;
    public final void rule__Familienbuch__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4397:1: ( rule__Familienbuch__Group__17__Impl rule__Familienbuch__Group__18 )
            // InternalAhnen.g:4398:2: rule__Familienbuch__Group__17__Impl rule__Familienbuch__Group__18
            {
            pushFollow(FOLLOW_37);
            rule__Familienbuch__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__17"


    // $ANTLR start "rule__Familienbuch__Group__17__Impl"
    // InternalAhnen.g:4405:1: rule__Familienbuch__Group__17__Impl : ( ( rule__Familienbuch__VorwortAssignment_17 ) ) ;
    public final void rule__Familienbuch__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4409:1: ( ( ( rule__Familienbuch__VorwortAssignment_17 ) ) )
            // InternalAhnen.g:4410:1: ( ( rule__Familienbuch__VorwortAssignment_17 ) )
            {
            // InternalAhnen.g:4410:1: ( ( rule__Familienbuch__VorwortAssignment_17 ) )
            // InternalAhnen.g:4411:2: ( rule__Familienbuch__VorwortAssignment_17 )
            {
             before(grammarAccess.getFamilienbuchAccess().getVorwortAssignment_17()); 
            // InternalAhnen.g:4412:2: ( rule__Familienbuch__VorwortAssignment_17 )
            // InternalAhnen.g:4412:3: rule__Familienbuch__VorwortAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Familienbuch__VorwortAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getFamilienbuchAccess().getVorwortAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__17__Impl"


    // $ANTLR start "rule__Familienbuch__Group__18"
    // InternalAhnen.g:4420:1: rule__Familienbuch__Group__18 : rule__Familienbuch__Group__18__Impl rule__Familienbuch__Group__19 ;
    public final void rule__Familienbuch__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4424:1: ( rule__Familienbuch__Group__18__Impl rule__Familienbuch__Group__19 )
            // InternalAhnen.g:4425:2: rule__Familienbuch__Group__18__Impl rule__Familienbuch__Group__19
            {
            pushFollow(FOLLOW_66);
            rule__Familienbuch__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__18"


    // $ANTLR start "rule__Familienbuch__Group__18__Impl"
    // InternalAhnen.g:4432:1: rule__Familienbuch__Group__18__Impl : ( '}' ) ;
    public final void rule__Familienbuch__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4436:1: ( ( '}' ) )
            // InternalAhnen.g:4437:1: ( '}' )
            {
            // InternalAhnen.g:4437:1: ( '}' )
            // InternalAhnen.g:4438:2: '}'
            {
             before(grammarAccess.getFamilienbuchAccess().getRightCurlyBracketKeyword_18()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__18__Impl"


    // $ANTLR start "rule__Familienbuch__Group__19"
    // InternalAhnen.g:4447:1: rule__Familienbuch__Group__19 : rule__Familienbuch__Group__19__Impl rule__Familienbuch__Group__20 ;
    public final void rule__Familienbuch__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4451:1: ( rule__Familienbuch__Group__19__Impl rule__Familienbuch__Group__20 )
            // InternalAhnen.g:4452:2: rule__Familienbuch__Group__19__Impl rule__Familienbuch__Group__20
            {
            pushFollow(FOLLOW_11);
            rule__Familienbuch__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__19"


    // $ANTLR start "rule__Familienbuch__Group__19__Impl"
    // InternalAhnen.g:4459:1: rule__Familienbuch__Group__19__Impl : ( 'Autor:' ) ;
    public final void rule__Familienbuch__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4463:1: ( ( 'Autor:' ) )
            // InternalAhnen.g:4464:1: ( 'Autor:' )
            {
            // InternalAhnen.g:4464:1: ( 'Autor:' )
            // InternalAhnen.g:4465:2: 'Autor:'
            {
             before(grammarAccess.getFamilienbuchAccess().getAutorKeyword_19()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getAutorKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__19__Impl"


    // $ANTLR start "rule__Familienbuch__Group__20"
    // InternalAhnen.g:4474:1: rule__Familienbuch__Group__20 : rule__Familienbuch__Group__20__Impl rule__Familienbuch__Group__21 ;
    public final void rule__Familienbuch__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4478:1: ( rule__Familienbuch__Group__20__Impl rule__Familienbuch__Group__21 )
            // InternalAhnen.g:4479:2: rule__Familienbuch__Group__20__Impl rule__Familienbuch__Group__21
            {
            pushFollow(FOLLOW_16);
            rule__Familienbuch__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__20"


    // $ANTLR start "rule__Familienbuch__Group__20__Impl"
    // InternalAhnen.g:4486:1: rule__Familienbuch__Group__20__Impl : ( '{' ) ;
    public final void rule__Familienbuch__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4490:1: ( ( '{' ) )
            // InternalAhnen.g:4491:1: ( '{' )
            {
            // InternalAhnen.g:4491:1: ( '{' )
            // InternalAhnen.g:4492:2: '{'
            {
             before(grammarAccess.getFamilienbuchAccess().getLeftCurlyBracketKeyword_20()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getLeftCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__20__Impl"


    // $ANTLR start "rule__Familienbuch__Group__21"
    // InternalAhnen.g:4501:1: rule__Familienbuch__Group__21 : rule__Familienbuch__Group__21__Impl rule__Familienbuch__Group__22 ;
    public final void rule__Familienbuch__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4505:1: ( rule__Familienbuch__Group__21__Impl rule__Familienbuch__Group__22 )
            // InternalAhnen.g:4506:2: rule__Familienbuch__Group__21__Impl rule__Familienbuch__Group__22
            {
            pushFollow(FOLLOW_37);
            rule__Familienbuch__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__21"


    // $ANTLR start "rule__Familienbuch__Group__21__Impl"
    // InternalAhnen.g:4513:1: rule__Familienbuch__Group__21__Impl : ( ( rule__Familienbuch__AutorAssignment_21 ) ) ;
    public final void rule__Familienbuch__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4517:1: ( ( ( rule__Familienbuch__AutorAssignment_21 ) ) )
            // InternalAhnen.g:4518:1: ( ( rule__Familienbuch__AutorAssignment_21 ) )
            {
            // InternalAhnen.g:4518:1: ( ( rule__Familienbuch__AutorAssignment_21 ) )
            // InternalAhnen.g:4519:2: ( rule__Familienbuch__AutorAssignment_21 )
            {
             before(grammarAccess.getFamilienbuchAccess().getAutorAssignment_21()); 
            // InternalAhnen.g:4520:2: ( rule__Familienbuch__AutorAssignment_21 )
            // InternalAhnen.g:4520:3: rule__Familienbuch__AutorAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__Familienbuch__AutorAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getFamilienbuchAccess().getAutorAssignment_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__21__Impl"


    // $ANTLR start "rule__Familienbuch__Group__22"
    // InternalAhnen.g:4528:1: rule__Familienbuch__Group__22 : rule__Familienbuch__Group__22__Impl rule__Familienbuch__Group__23 ;
    public final void rule__Familienbuch__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4532:1: ( rule__Familienbuch__Group__22__Impl rule__Familienbuch__Group__23 )
            // InternalAhnen.g:4533:2: rule__Familienbuch__Group__22__Impl rule__Familienbuch__Group__23
            {
            pushFollow(FOLLOW_67);
            rule__Familienbuch__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__22"


    // $ANTLR start "rule__Familienbuch__Group__22__Impl"
    // InternalAhnen.g:4540:1: rule__Familienbuch__Group__22__Impl : ( '}' ) ;
    public final void rule__Familienbuch__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4544:1: ( ( '}' ) )
            // InternalAhnen.g:4545:1: ( '}' )
            {
            // InternalAhnen.g:4545:1: ( '}' )
            // InternalAhnen.g:4546:2: '}'
            {
             before(grammarAccess.getFamilienbuchAccess().getRightCurlyBracketKeyword_22()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getRightCurlyBracketKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__22__Impl"


    // $ANTLR start "rule__Familienbuch__Group__23"
    // InternalAhnen.g:4555:1: rule__Familienbuch__Group__23 : rule__Familienbuch__Group__23__Impl rule__Familienbuch__Group__24 ;
    public final void rule__Familienbuch__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4559:1: ( rule__Familienbuch__Group__23__Impl rule__Familienbuch__Group__24 )
            // InternalAhnen.g:4560:2: rule__Familienbuch__Group__23__Impl rule__Familienbuch__Group__24
            {
            pushFollow(FOLLOW_11);
            rule__Familienbuch__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__23"


    // $ANTLR start "rule__Familienbuch__Group__23__Impl"
    // InternalAhnen.g:4567:1: rule__Familienbuch__Group__23__Impl : ( 'Familien:' ) ;
    public final void rule__Familienbuch__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4571:1: ( ( 'Familien:' ) )
            // InternalAhnen.g:4572:1: ( 'Familien:' )
            {
            // InternalAhnen.g:4572:1: ( 'Familien:' )
            // InternalAhnen.g:4573:2: 'Familien:'
            {
             before(grammarAccess.getFamilienbuchAccess().getFamilienKeyword_23()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getFamilienKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__23__Impl"


    // $ANTLR start "rule__Familienbuch__Group__24"
    // InternalAhnen.g:4582:1: rule__Familienbuch__Group__24 : rule__Familienbuch__Group__24__Impl rule__Familienbuch__Group__25 ;
    public final void rule__Familienbuch__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4586:1: ( rule__Familienbuch__Group__24__Impl rule__Familienbuch__Group__25 )
            // InternalAhnen.g:4587:2: rule__Familienbuch__Group__24__Impl rule__Familienbuch__Group__25
            {
            pushFollow(FOLLOW_68);
            rule__Familienbuch__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__24"


    // $ANTLR start "rule__Familienbuch__Group__24__Impl"
    // InternalAhnen.g:4594:1: rule__Familienbuch__Group__24__Impl : ( '{' ) ;
    public final void rule__Familienbuch__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4598:1: ( ( '{' ) )
            // InternalAhnen.g:4599:1: ( '{' )
            {
            // InternalAhnen.g:4599:1: ( '{' )
            // InternalAhnen.g:4600:2: '{'
            {
             before(grammarAccess.getFamilienbuchAccess().getLeftCurlyBracketKeyword_24()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getLeftCurlyBracketKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__24__Impl"


    // $ANTLR start "rule__Familienbuch__Group__25"
    // InternalAhnen.g:4609:1: rule__Familienbuch__Group__25 : rule__Familienbuch__Group__25__Impl rule__Familienbuch__Group__26 ;
    public final void rule__Familienbuch__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4613:1: ( rule__Familienbuch__Group__25__Impl rule__Familienbuch__Group__26 )
            // InternalAhnen.g:4614:2: rule__Familienbuch__Group__25__Impl rule__Familienbuch__Group__26
            {
            pushFollow(FOLLOW_37);
            rule__Familienbuch__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__25"


    // $ANTLR start "rule__Familienbuch__Group__25__Impl"
    // InternalAhnen.g:4621:1: rule__Familienbuch__Group__25__Impl : ( ( ( rule__Familienbuch__FamilienAssignment_25 ) ) ( ( rule__Familienbuch__FamilienAssignment_25 )* ) ) ;
    public final void rule__Familienbuch__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4625:1: ( ( ( ( rule__Familienbuch__FamilienAssignment_25 ) ) ( ( rule__Familienbuch__FamilienAssignment_25 )* ) ) )
            // InternalAhnen.g:4626:1: ( ( ( rule__Familienbuch__FamilienAssignment_25 ) ) ( ( rule__Familienbuch__FamilienAssignment_25 )* ) )
            {
            // InternalAhnen.g:4626:1: ( ( ( rule__Familienbuch__FamilienAssignment_25 ) ) ( ( rule__Familienbuch__FamilienAssignment_25 )* ) )
            // InternalAhnen.g:4627:2: ( ( rule__Familienbuch__FamilienAssignment_25 ) ) ( ( rule__Familienbuch__FamilienAssignment_25 )* )
            {
            // InternalAhnen.g:4627:2: ( ( rule__Familienbuch__FamilienAssignment_25 ) )
            // InternalAhnen.g:4628:3: ( rule__Familienbuch__FamilienAssignment_25 )
            {
             before(grammarAccess.getFamilienbuchAccess().getFamilienAssignment_25()); 
            // InternalAhnen.g:4629:3: ( rule__Familienbuch__FamilienAssignment_25 )
            // InternalAhnen.g:4629:4: rule__Familienbuch__FamilienAssignment_25
            {
            pushFollow(FOLLOW_69);
            rule__Familienbuch__FamilienAssignment_25();

            state._fsp--;


            }

             after(grammarAccess.getFamilienbuchAccess().getFamilienAssignment_25()); 

            }

            // InternalAhnen.g:4632:2: ( ( rule__Familienbuch__FamilienAssignment_25 )* )
            // InternalAhnen.g:4633:3: ( rule__Familienbuch__FamilienAssignment_25 )*
            {
             before(grammarAccess.getFamilienbuchAccess().getFamilienAssignment_25()); 
            // InternalAhnen.g:4634:3: ( rule__Familienbuch__FamilienAssignment_25 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==71) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalAhnen.g:4634:4: rule__Familienbuch__FamilienAssignment_25
            	    {
            	    pushFollow(FOLLOW_69);
            	    rule__Familienbuch__FamilienAssignment_25();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getFamilienbuchAccess().getFamilienAssignment_25()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__25__Impl"


    // $ANTLR start "rule__Familienbuch__Group__26"
    // InternalAhnen.g:4643:1: rule__Familienbuch__Group__26 : rule__Familienbuch__Group__26__Impl ;
    public final void rule__Familienbuch__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4647:1: ( rule__Familienbuch__Group__26__Impl )
            // InternalAhnen.g:4648:2: rule__Familienbuch__Group__26__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Familienbuch__Group__26__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__26"


    // $ANTLR start "rule__Familienbuch__Group__26__Impl"
    // InternalAhnen.g:4654:1: rule__Familienbuch__Group__26__Impl : ( '}' ) ;
    public final void rule__Familienbuch__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4658:1: ( ( '}' ) )
            // InternalAhnen.g:4659:1: ( '}' )
            {
            // InternalAhnen.g:4659:1: ( '}' )
            // InternalAhnen.g:4660:2: '}'
            {
             before(grammarAccess.getFamilienbuchAccess().getRightCurlyBracketKeyword_26()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getRightCurlyBracketKeyword_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__Group__26__Impl"


    // $ANTLR start "rule__FamilienImport__Group__0"
    // InternalAhnen.g:4670:1: rule__FamilienImport__Group__0 : rule__FamilienImport__Group__0__Impl rule__FamilienImport__Group__1 ;
    public final void rule__FamilienImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4674:1: ( rule__FamilienImport__Group__0__Impl rule__FamilienImport__Group__1 )
            // InternalAhnen.g:4675:2: rule__FamilienImport__Group__0__Impl rule__FamilienImport__Group__1
            {
            pushFollow(FOLLOW_70);
            rule__FamilienImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FamilienImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FamilienImport__Group__0"


    // $ANTLR start "rule__FamilienImport__Group__0__Impl"
    // InternalAhnen.g:4682:1: rule__FamilienImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__FamilienImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4686:1: ( ( 'import' ) )
            // InternalAhnen.g:4687:1: ( 'import' )
            {
            // InternalAhnen.g:4687:1: ( 'import' )
            // InternalAhnen.g:4688:2: 'import'
            {
             before(grammarAccess.getFamilienImportAccess().getImportKeyword_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getFamilienImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FamilienImport__Group__0__Impl"


    // $ANTLR start "rule__FamilienImport__Group__1"
    // InternalAhnen.g:4697:1: rule__FamilienImport__Group__1 : rule__FamilienImport__Group__1__Impl rule__FamilienImport__Group__2 ;
    public final void rule__FamilienImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4701:1: ( rule__FamilienImport__Group__1__Impl rule__FamilienImport__Group__2 )
            // InternalAhnen.g:4702:2: rule__FamilienImport__Group__1__Impl rule__FamilienImport__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__FamilienImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FamilienImport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FamilienImport__Group__1"


    // $ANTLR start "rule__FamilienImport__Group__1__Impl"
    // InternalAhnen.g:4709:1: rule__FamilienImport__Group__1__Impl : ( 'familie' ) ;
    public final void rule__FamilienImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4713:1: ( ( 'familie' ) )
            // InternalAhnen.g:4714:1: ( 'familie' )
            {
            // InternalAhnen.g:4714:1: ( 'familie' )
            // InternalAhnen.g:4715:2: 'familie'
            {
             before(grammarAccess.getFamilienImportAccess().getFamilieKeyword_1()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getFamilienImportAccess().getFamilieKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FamilienImport__Group__1__Impl"


    // $ANTLR start "rule__FamilienImport__Group__2"
    // InternalAhnen.g:4724:1: rule__FamilienImport__Group__2 : rule__FamilienImport__Group__2__Impl rule__FamilienImport__Group__3 ;
    public final void rule__FamilienImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4728:1: ( rule__FamilienImport__Group__2__Impl rule__FamilienImport__Group__3 )
            // InternalAhnen.g:4729:2: rule__FamilienImport__Group__2__Impl rule__FamilienImport__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__FamilienImport__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FamilienImport__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FamilienImport__Group__2"


    // $ANTLR start "rule__FamilienImport__Group__2__Impl"
    // InternalAhnen.g:4736:1: rule__FamilienImport__Group__2__Impl : ( ( rule__FamilienImport__FamilieAssignment_2 ) ) ;
    public final void rule__FamilienImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4740:1: ( ( ( rule__FamilienImport__FamilieAssignment_2 ) ) )
            // InternalAhnen.g:4741:1: ( ( rule__FamilienImport__FamilieAssignment_2 ) )
            {
            // InternalAhnen.g:4741:1: ( ( rule__FamilienImport__FamilieAssignment_2 ) )
            // InternalAhnen.g:4742:2: ( rule__FamilienImport__FamilieAssignment_2 )
            {
             before(grammarAccess.getFamilienImportAccess().getFamilieAssignment_2()); 
            // InternalAhnen.g:4743:2: ( rule__FamilienImport__FamilieAssignment_2 )
            // InternalAhnen.g:4743:3: rule__FamilienImport__FamilieAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FamilienImport__FamilieAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFamilienImportAccess().getFamilieAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FamilienImport__Group__2__Impl"


    // $ANTLR start "rule__FamilienImport__Group__3"
    // InternalAhnen.g:4751:1: rule__FamilienImport__Group__3 : rule__FamilienImport__Group__3__Impl ;
    public final void rule__FamilienImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4755:1: ( rule__FamilienImport__Group__3__Impl )
            // InternalAhnen.g:4756:2: rule__FamilienImport__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FamilienImport__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FamilienImport__Group__3"


    // $ANTLR start "rule__FamilienImport__Group__3__Impl"
    // InternalAhnen.g:4762:1: rule__FamilienImport__Group__3__Impl : ( '.' ) ;
    public final void rule__FamilienImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4766:1: ( ( '.' ) )
            // InternalAhnen.g:4767:1: ( '.' )
            {
            // InternalAhnen.g:4767:1: ( '.' )
            // InternalAhnen.g:4768:2: '.'
            {
             before(grammarAccess.getFamilienImportAccess().getFullStopKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFamilienImportAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FamilienImport__Group__3__Impl"


    // $ANTLR start "rule__Autor__Group__0"
    // InternalAhnen.g:4778:1: rule__Autor__Group__0 : rule__Autor__Group__0__Impl rule__Autor__Group__1 ;
    public final void rule__Autor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4782:1: ( rule__Autor__Group__0__Impl rule__Autor__Group__1 )
            // InternalAhnen.g:4783:2: rule__Autor__Group__0__Impl rule__Autor__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Autor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Autor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__0"


    // $ANTLR start "rule__Autor__Group__0__Impl"
    // InternalAhnen.g:4790:1: rule__Autor__Group__0__Impl : ( 'Vorname:' ) ;
    public final void rule__Autor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4794:1: ( ( 'Vorname:' ) )
            // InternalAhnen.g:4795:1: ( 'Vorname:' )
            {
            // InternalAhnen.g:4795:1: ( 'Vorname:' )
            // InternalAhnen.g:4796:2: 'Vorname:'
            {
             before(grammarAccess.getAutorAccess().getVornameKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAutorAccess().getVornameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__0__Impl"


    // $ANTLR start "rule__Autor__Group__1"
    // InternalAhnen.g:4805:1: rule__Autor__Group__1 : rule__Autor__Group__1__Impl rule__Autor__Group__2 ;
    public final void rule__Autor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4809:1: ( rule__Autor__Group__1__Impl rule__Autor__Group__2 )
            // InternalAhnen.g:4810:2: rule__Autor__Group__1__Impl rule__Autor__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Autor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Autor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__1"


    // $ANTLR start "rule__Autor__Group__1__Impl"
    // InternalAhnen.g:4817:1: rule__Autor__Group__1__Impl : ( ( rule__Autor__VornameAssignment_1 ) ) ;
    public final void rule__Autor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4821:1: ( ( ( rule__Autor__VornameAssignment_1 ) ) )
            // InternalAhnen.g:4822:1: ( ( rule__Autor__VornameAssignment_1 ) )
            {
            // InternalAhnen.g:4822:1: ( ( rule__Autor__VornameAssignment_1 ) )
            // InternalAhnen.g:4823:2: ( rule__Autor__VornameAssignment_1 )
            {
             before(grammarAccess.getAutorAccess().getVornameAssignment_1()); 
            // InternalAhnen.g:4824:2: ( rule__Autor__VornameAssignment_1 )
            // InternalAhnen.g:4824:3: rule__Autor__VornameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Autor__VornameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAutorAccess().getVornameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__1__Impl"


    // $ANTLR start "rule__Autor__Group__2"
    // InternalAhnen.g:4832:1: rule__Autor__Group__2 : rule__Autor__Group__2__Impl rule__Autor__Group__3 ;
    public final void rule__Autor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4836:1: ( rule__Autor__Group__2__Impl rule__Autor__Group__3 )
            // InternalAhnen.g:4837:2: rule__Autor__Group__2__Impl rule__Autor__Group__3
            {
            pushFollow(FOLLOW_71);
            rule__Autor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Autor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__2"


    // $ANTLR start "rule__Autor__Group__2__Impl"
    // InternalAhnen.g:4844:1: rule__Autor__Group__2__Impl : ( '.' ) ;
    public final void rule__Autor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4848:1: ( ( '.' ) )
            // InternalAhnen.g:4849:1: ( '.' )
            {
            // InternalAhnen.g:4849:1: ( '.' )
            // InternalAhnen.g:4850:2: '.'
            {
             before(grammarAccess.getAutorAccess().getFullStopKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAutorAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__2__Impl"


    // $ANTLR start "rule__Autor__Group__3"
    // InternalAhnen.g:4859:1: rule__Autor__Group__3 : rule__Autor__Group__3__Impl rule__Autor__Group__4 ;
    public final void rule__Autor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4863:1: ( rule__Autor__Group__3__Impl rule__Autor__Group__4 )
            // InternalAhnen.g:4864:2: rule__Autor__Group__3__Impl rule__Autor__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Autor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Autor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__3"


    // $ANTLR start "rule__Autor__Group__3__Impl"
    // InternalAhnen.g:4871:1: rule__Autor__Group__3__Impl : ( 'Name:' ) ;
    public final void rule__Autor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4875:1: ( ( 'Name:' ) )
            // InternalAhnen.g:4876:1: ( 'Name:' )
            {
            // InternalAhnen.g:4876:1: ( 'Name:' )
            // InternalAhnen.g:4877:2: 'Name:'
            {
             before(grammarAccess.getAutorAccess().getNameKeyword_3()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getAutorAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__3__Impl"


    // $ANTLR start "rule__Autor__Group__4"
    // InternalAhnen.g:4886:1: rule__Autor__Group__4 : rule__Autor__Group__4__Impl rule__Autor__Group__5 ;
    public final void rule__Autor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4890:1: ( rule__Autor__Group__4__Impl rule__Autor__Group__5 )
            // InternalAhnen.g:4891:2: rule__Autor__Group__4__Impl rule__Autor__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Autor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Autor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__4"


    // $ANTLR start "rule__Autor__Group__4__Impl"
    // InternalAhnen.g:4898:1: rule__Autor__Group__4__Impl : ( ( rule__Autor__NachnameAssignment_4 ) ) ;
    public final void rule__Autor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4902:1: ( ( ( rule__Autor__NachnameAssignment_4 ) ) )
            // InternalAhnen.g:4903:1: ( ( rule__Autor__NachnameAssignment_4 ) )
            {
            // InternalAhnen.g:4903:1: ( ( rule__Autor__NachnameAssignment_4 ) )
            // InternalAhnen.g:4904:2: ( rule__Autor__NachnameAssignment_4 )
            {
             before(grammarAccess.getAutorAccess().getNachnameAssignment_4()); 
            // InternalAhnen.g:4905:2: ( rule__Autor__NachnameAssignment_4 )
            // InternalAhnen.g:4905:3: rule__Autor__NachnameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Autor__NachnameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAutorAccess().getNachnameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__4__Impl"


    // $ANTLR start "rule__Autor__Group__5"
    // InternalAhnen.g:4913:1: rule__Autor__Group__5 : rule__Autor__Group__5__Impl rule__Autor__Group__6 ;
    public final void rule__Autor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4917:1: ( rule__Autor__Group__5__Impl rule__Autor__Group__6 )
            // InternalAhnen.g:4918:2: rule__Autor__Group__5__Impl rule__Autor__Group__6
            {
            pushFollow(FOLLOW_72);
            rule__Autor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Autor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__5"


    // $ANTLR start "rule__Autor__Group__5__Impl"
    // InternalAhnen.g:4925:1: rule__Autor__Group__5__Impl : ( '.' ) ;
    public final void rule__Autor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4929:1: ( ( '.' ) )
            // InternalAhnen.g:4930:1: ( '.' )
            {
            // InternalAhnen.g:4930:1: ( '.' )
            // InternalAhnen.g:4931:2: '.'
            {
             before(grammarAccess.getAutorAccess().getFullStopKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAutorAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__5__Impl"


    // $ANTLR start "rule__Autor__Group__6"
    // InternalAhnen.g:4940:1: rule__Autor__Group__6 : rule__Autor__Group__6__Impl rule__Autor__Group__7 ;
    public final void rule__Autor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4944:1: ( rule__Autor__Group__6__Impl rule__Autor__Group__7 )
            // InternalAhnen.g:4945:2: rule__Autor__Group__6__Impl rule__Autor__Group__7
            {
            pushFollow(FOLLOW_73);
            rule__Autor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Autor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__6"


    // $ANTLR start "rule__Autor__Group__6__Impl"
    // InternalAhnen.g:4952:1: rule__Autor__Group__6__Impl : ( 'Organisation' ) ;
    public final void rule__Autor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4956:1: ( ( 'Organisation' ) )
            // InternalAhnen.g:4957:1: ( 'Organisation' )
            {
            // InternalAhnen.g:4957:1: ( 'Organisation' )
            // InternalAhnen.g:4958:2: 'Organisation'
            {
             before(grammarAccess.getAutorAccess().getOrganisationKeyword_6()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getAutorAccess().getOrganisationKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__6__Impl"


    // $ANTLR start "rule__Autor__Group__7"
    // InternalAhnen.g:4967:1: rule__Autor__Group__7 : rule__Autor__Group__7__Impl rule__Autor__Group__8 ;
    public final void rule__Autor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4971:1: ( rule__Autor__Group__7__Impl rule__Autor__Group__8 )
            // InternalAhnen.g:4972:2: rule__Autor__Group__7__Impl rule__Autor__Group__8
            {
            pushFollow(FOLLOW_73);
            rule__Autor__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Autor__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__7"


    // $ANTLR start "rule__Autor__Group__7__Impl"
    // InternalAhnen.g:4979:1: rule__Autor__Group__7__Impl : ( ( rule__Autor__OrganisationsNameAssignment_7 )? ) ;
    public final void rule__Autor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4983:1: ( ( ( rule__Autor__OrganisationsNameAssignment_7 )? ) )
            // InternalAhnen.g:4984:1: ( ( rule__Autor__OrganisationsNameAssignment_7 )? )
            {
            // InternalAhnen.g:4984:1: ( ( rule__Autor__OrganisationsNameAssignment_7 )? )
            // InternalAhnen.g:4985:2: ( rule__Autor__OrganisationsNameAssignment_7 )?
            {
             before(grammarAccess.getAutorAccess().getOrganisationsNameAssignment_7()); 
            // InternalAhnen.g:4986:2: ( rule__Autor__OrganisationsNameAssignment_7 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_STRING) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAhnen.g:4986:3: rule__Autor__OrganisationsNameAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Autor__OrganisationsNameAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutorAccess().getOrganisationsNameAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__7__Impl"


    // $ANTLR start "rule__Autor__Group__8"
    // InternalAhnen.g:4994:1: rule__Autor__Group__8 : rule__Autor__Group__8__Impl ;
    public final void rule__Autor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:4998:1: ( rule__Autor__Group__8__Impl )
            // InternalAhnen.g:4999:2: rule__Autor__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Autor__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__8"


    // $ANTLR start "rule__Autor__Group__8__Impl"
    // InternalAhnen.g:5005:1: rule__Autor__Group__8__Impl : ( '.' ) ;
    public final void rule__Autor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5009:1: ( ( '.' ) )
            // InternalAhnen.g:5010:1: ( '.' )
            {
            // InternalAhnen.g:5010:1: ( '.' )
            // InternalAhnen.g:5011:2: '.'
            {
             before(grammarAccess.getAutorAccess().getFullStopKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAutorAccess().getFullStopKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__Group__8__Impl"


    // $ANTLR start "rule__VERSION__Group__0"
    // InternalAhnen.g:5021:1: rule__VERSION__Group__0 : rule__VERSION__Group__0__Impl rule__VERSION__Group__1 ;
    public final void rule__VERSION__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5025:1: ( rule__VERSION__Group__0__Impl rule__VERSION__Group__1 )
            // InternalAhnen.g:5026:2: rule__VERSION__Group__0__Impl rule__VERSION__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__VERSION__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERSION__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERSION__Group__0"


    // $ANTLR start "rule__VERSION__Group__0__Impl"
    // InternalAhnen.g:5033:1: rule__VERSION__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__VERSION__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5037:1: ( ( RULE_INT ) )
            // InternalAhnen.g:5038:1: ( RULE_INT )
            {
            // InternalAhnen.g:5038:1: ( RULE_INT )
            // InternalAhnen.g:5039:2: RULE_INT
            {
             before(grammarAccess.getVERSIONAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVERSIONAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERSION__Group__0__Impl"


    // $ANTLR start "rule__VERSION__Group__1"
    // InternalAhnen.g:5048:1: rule__VERSION__Group__1 : rule__VERSION__Group__1__Impl rule__VERSION__Group__2 ;
    public final void rule__VERSION__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5052:1: ( rule__VERSION__Group__1__Impl rule__VERSION__Group__2 )
            // InternalAhnen.g:5053:2: rule__VERSION__Group__1__Impl rule__VERSION__Group__2
            {
            pushFollow(FOLLOW_63);
            rule__VERSION__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERSION__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERSION__Group__1"


    // $ANTLR start "rule__VERSION__Group__1__Impl"
    // InternalAhnen.g:5060:1: rule__VERSION__Group__1__Impl : ( '.' ) ;
    public final void rule__VERSION__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5064:1: ( ( '.' ) )
            // InternalAhnen.g:5065:1: ( '.' )
            {
            // InternalAhnen.g:5065:1: ( '.' )
            // InternalAhnen.g:5066:2: '.'
            {
             before(grammarAccess.getVERSIONAccess().getFullStopKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVERSIONAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERSION__Group__1__Impl"


    // $ANTLR start "rule__VERSION__Group__2"
    // InternalAhnen.g:5075:1: rule__VERSION__Group__2 : rule__VERSION__Group__2__Impl rule__VERSION__Group__3 ;
    public final void rule__VERSION__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5079:1: ( rule__VERSION__Group__2__Impl rule__VERSION__Group__3 )
            // InternalAhnen.g:5080:2: rule__VERSION__Group__2__Impl rule__VERSION__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__VERSION__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERSION__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERSION__Group__2"


    // $ANTLR start "rule__VERSION__Group__2__Impl"
    // InternalAhnen.g:5087:1: rule__VERSION__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__VERSION__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5091:1: ( ( RULE_INT ) )
            // InternalAhnen.g:5092:1: ( RULE_INT )
            {
            // InternalAhnen.g:5092:1: ( RULE_INT )
            // InternalAhnen.g:5093:2: RULE_INT
            {
             before(grammarAccess.getVERSIONAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVERSIONAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERSION__Group__2__Impl"


    // $ANTLR start "rule__VERSION__Group__3"
    // InternalAhnen.g:5102:1: rule__VERSION__Group__3 : rule__VERSION__Group__3__Impl rule__VERSION__Group__4 ;
    public final void rule__VERSION__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5106:1: ( rule__VERSION__Group__3__Impl rule__VERSION__Group__4 )
            // InternalAhnen.g:5107:2: rule__VERSION__Group__3__Impl rule__VERSION__Group__4
            {
            pushFollow(FOLLOW_63);
            rule__VERSION__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VERSION__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERSION__Group__3"


    // $ANTLR start "rule__VERSION__Group__3__Impl"
    // InternalAhnen.g:5114:1: rule__VERSION__Group__3__Impl : ( '.' ) ;
    public final void rule__VERSION__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5118:1: ( ( '.' ) )
            // InternalAhnen.g:5119:1: ( '.' )
            {
            // InternalAhnen.g:5119:1: ( '.' )
            // InternalAhnen.g:5120:2: '.'
            {
             before(grammarAccess.getVERSIONAccess().getFullStopKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVERSIONAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERSION__Group__3__Impl"


    // $ANTLR start "rule__VERSION__Group__4"
    // InternalAhnen.g:5129:1: rule__VERSION__Group__4 : rule__VERSION__Group__4__Impl ;
    public final void rule__VERSION__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5133:1: ( rule__VERSION__Group__4__Impl )
            // InternalAhnen.g:5134:2: rule__VERSION__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VERSION__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERSION__Group__4"


    // $ANTLR start "rule__VERSION__Group__4__Impl"
    // InternalAhnen.g:5140:1: rule__VERSION__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__VERSION__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5144:1: ( ( RULE_INT ) )
            // InternalAhnen.g:5145:1: ( RULE_INT )
            {
            // InternalAhnen.g:5145:1: ( RULE_INT )
            // InternalAhnen.g:5146:2: RULE_INT
            {
             before(grammarAccess.getVERSIONAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVERSIONAccess().getINTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VERSION__Group__4__Impl"


    // $ANTLR start "rule__Model__DateiAssignment"
    // InternalAhnen.g:5156:1: rule__Model__DateiAssignment : ( ruleDateiart ) ;
    public final void rule__Model__DateiAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5160:1: ( ( ruleDateiart ) )
            // InternalAhnen.g:5161:2: ( ruleDateiart )
            {
            // InternalAhnen.g:5161:2: ( ruleDateiart )
            // InternalAhnen.g:5162:3: ruleDateiart
            {
             before(grammarAccess.getModelAccess().getDateiDateiartParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDateiart();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDateiDateiartParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DateiAssignment"


    // $ANTLR start "rule__Dateiart__BuchAssignment_0"
    // InternalAhnen.g:5171:1: rule__Dateiart__BuchAssignment_0 : ( ruleFamilienbuch ) ;
    public final void rule__Dateiart__BuchAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5175:1: ( ( ruleFamilienbuch ) )
            // InternalAhnen.g:5176:2: ( ruleFamilienbuch )
            {
            // InternalAhnen.g:5176:2: ( ruleFamilienbuch )
            // InternalAhnen.g:5177:3: ruleFamilienbuch
            {
             before(grammarAccess.getDateiartAccess().getBuchFamilienbuchParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFamilienbuch();

            state._fsp--;

             after(grammarAccess.getDateiartAccess().getBuchFamilienbuchParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dateiart__BuchAssignment_0"


    // $ANTLR start "rule__Dateiart__FamilieAssignment_1"
    // InternalAhnen.g:5186:1: rule__Dateiart__FamilieAssignment_1 : ( ruleFamilie ) ;
    public final void rule__Dateiart__FamilieAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5190:1: ( ( ruleFamilie ) )
            // InternalAhnen.g:5191:2: ( ruleFamilie )
            {
            // InternalAhnen.g:5191:2: ( ruleFamilie )
            // InternalAhnen.g:5192:3: ruleFamilie
            {
             before(grammarAccess.getDateiartAccess().getFamilieFamilieParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFamilie();

            state._fsp--;

             after(grammarAccess.getDateiartAccess().getFamilieFamilieParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dateiart__FamilieAssignment_1"


    // $ANTLR start "rule__Familie__NameAssignment_2"
    // InternalAhnen.g:5201:1: rule__Familie__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Familie__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5205:1: ( ( RULE_ID ) )
            // InternalAhnen.g:5206:2: ( RULE_ID )
            {
            // InternalAhnen.g:5206:2: ( RULE_ID )
            // InternalAhnen.g:5207:3: RULE_ID
            {
             before(grammarAccess.getFamilieAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFamilieAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familie__NameAssignment_2"


    // $ANTLR start "rule__Familie__PersonenAssignment_4"
    // InternalAhnen.g:5216:1: rule__Familie__PersonenAssignment_4 : ( rulePerson ) ;
    public final void rule__Familie__PersonenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5220:1: ( ( rulePerson ) )
            // InternalAhnen.g:5221:2: ( rulePerson )
            {
            // InternalAhnen.g:5221:2: ( rulePerson )
            // InternalAhnen.g:5222:3: rulePerson
            {
             before(grammarAccess.getFamilieAccess().getPersonenPersonParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getFamilieAccess().getPersonenPersonParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familie__PersonenAssignment_4"


    // $ANTLR start "rule__Person__NameAssignment_2"
    // InternalAhnen.g:5231:1: rule__Person__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Person__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5235:1: ( ( RULE_STRING ) )
            // InternalAhnen.g:5236:2: ( RULE_STRING )
            {
            // InternalAhnen.g:5236:2: ( RULE_STRING )
            // InternalAhnen.g:5237:3: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__NameAssignment_2"


    // $ANTLR start "rule__Person__LetzteAenderungAssignment_6"
    // InternalAhnen.g:5246:1: rule__Person__LetzteAenderungAssignment_6 : ( ruleDATUM ) ;
    public final void rule__Person__LetzteAenderungAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5250:1: ( ( ruleDATUM ) )
            // InternalAhnen.g:5251:2: ( ruleDATUM )
            {
            // InternalAhnen.g:5251:2: ( ruleDATUM )
            // InternalAhnen.g:5252:3: ruleDATUM
            {
             before(grammarAccess.getPersonAccess().getLetzteAenderungDATUMParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDATUM();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getLetzteAenderungDATUMParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__LetzteAenderungAssignment_6"


    // $ANTLR start "rule__Person__VornameAssignment_9_0"
    // InternalAhnen.g:5261:1: rule__Person__VornameAssignment_9_0 : ( RULE_STRING ) ;
    public final void rule__Person__VornameAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5265:1: ( ( RULE_STRING ) )
            // InternalAhnen.g:5266:2: ( RULE_STRING )
            {
            // InternalAhnen.g:5266:2: ( RULE_STRING )
            // InternalAhnen.g:5267:3: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getVornameSTRINGTerminalRuleCall_9_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getVornameSTRINGTerminalRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__VornameAssignment_9_0"


    // $ANTLR start "rule__Person__MittelnameAssignment_12_0"
    // InternalAhnen.g:5276:1: rule__Person__MittelnameAssignment_12_0 : ( RULE_STRING ) ;
    public final void rule__Person__MittelnameAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5280:1: ( ( RULE_STRING ) )
            // InternalAhnen.g:5281:2: ( RULE_STRING )
            {
            // InternalAhnen.g:5281:2: ( RULE_STRING )
            // InternalAhnen.g:5282:3: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getMittelnameSTRINGTerminalRuleCall_12_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getMittelnameSTRINGTerminalRuleCall_12_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__MittelnameAssignment_12_0"


    // $ANTLR start "rule__Person__NachnameAssignment_15_0"
    // InternalAhnen.g:5291:1: rule__Person__NachnameAssignment_15_0 : ( RULE_STRING ) ;
    public final void rule__Person__NachnameAssignment_15_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5295:1: ( ( RULE_STRING ) )
            // InternalAhnen.g:5296:2: ( RULE_STRING )
            {
            // InternalAhnen.g:5296:2: ( RULE_STRING )
            // InternalAhnen.g:5297:3: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getNachnameSTRINGTerminalRuleCall_15_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getNachnameSTRINGTerminalRuleCall_15_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__NachnameAssignment_15_0"


    // $ANTLR start "rule__Person__GeburtsnameAssignment_18_0"
    // InternalAhnen.g:5306:1: rule__Person__GeburtsnameAssignment_18_0 : ( RULE_STRING ) ;
    public final void rule__Person__GeburtsnameAssignment_18_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5310:1: ( ( RULE_STRING ) )
            // InternalAhnen.g:5311:2: ( RULE_STRING )
            {
            // InternalAhnen.g:5311:2: ( RULE_STRING )
            // InternalAhnen.g:5312:3: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getGeburtsnameSTRINGTerminalRuleCall_18_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getGeburtsnameSTRINGTerminalRuleCall_18_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__GeburtsnameAssignment_18_0"


    // $ANTLR start "rule__Person__RufnameAssignment_21_0"
    // InternalAhnen.g:5321:1: rule__Person__RufnameAssignment_21_0 : ( RULE_STRING ) ;
    public final void rule__Person__RufnameAssignment_21_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5325:1: ( ( RULE_STRING ) )
            // InternalAhnen.g:5326:2: ( RULE_STRING )
            {
            // InternalAhnen.g:5326:2: ( RULE_STRING )
            // InternalAhnen.g:5327:3: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getRufnameSTRINGTerminalRuleCall_21_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRufnameSTRINGTerminalRuleCall_21_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__RufnameAssignment_21_0"


    // $ANTLR start "rule__Person__GeschlechtAssignment_24"
    // InternalAhnen.g:5336:1: rule__Person__GeschlechtAssignment_24 : ( ruleGeschlecht ) ;
    public final void rule__Person__GeschlechtAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5340:1: ( ( ruleGeschlecht ) )
            // InternalAhnen.g:5341:2: ( ruleGeschlecht )
            {
            // InternalAhnen.g:5341:2: ( ruleGeschlecht )
            // InternalAhnen.g:5342:3: ruleGeschlecht
            {
             before(grammarAccess.getPersonAccess().getGeschlechtGeschlechtEnumRuleCall_24_0()); 
            pushFollow(FOLLOW_2);
            ruleGeschlecht();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getGeschlechtGeschlechtEnumRuleCall_24_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__GeschlechtAssignment_24"


    // $ANTLR start "rule__Person__GeburtsDatumAssignment_27_0"
    // InternalAhnen.g:5351:1: rule__Person__GeburtsDatumAssignment_27_0 : ( ruleDATUM ) ;
    public final void rule__Person__GeburtsDatumAssignment_27_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5355:1: ( ( ruleDATUM ) )
            // InternalAhnen.g:5356:2: ( ruleDATUM )
            {
            // InternalAhnen.g:5356:2: ( ruleDATUM )
            // InternalAhnen.g:5357:3: ruleDATUM
            {
             before(grammarAccess.getPersonAccess().getGeburtsDatumDATUMParserRuleCall_27_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDATUM();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getGeburtsDatumDATUMParserRuleCall_27_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__GeburtsDatumAssignment_27_0"


    // $ANTLR start "rule__Person__TodesDatumAssignment_30_0"
    // InternalAhnen.g:5366:1: rule__Person__TodesDatumAssignment_30_0 : ( ruleDATUM ) ;
    public final void rule__Person__TodesDatumAssignment_30_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5370:1: ( ( ruleDATUM ) )
            // InternalAhnen.g:5371:2: ( ruleDATUM )
            {
            // InternalAhnen.g:5371:2: ( ruleDATUM )
            // InternalAhnen.g:5372:3: ruleDATUM
            {
             before(grammarAccess.getPersonAccess().getTodesDatumDATUMParserRuleCall_30_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDATUM();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getTodesDatumDATUMParserRuleCall_30_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__TodesDatumAssignment_30_0"


    // $ANTLR start "rule__Person__VaterAssignment_33_0"
    // InternalAhnen.g:5381:1: rule__Person__VaterAssignment_33_0 : ( ( RULE_STRING ) ) ;
    public final void rule__Person__VaterAssignment_33_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5385:1: ( ( ( RULE_STRING ) ) )
            // InternalAhnen.g:5386:2: ( ( RULE_STRING ) )
            {
            // InternalAhnen.g:5386:2: ( ( RULE_STRING ) )
            // InternalAhnen.g:5387:3: ( RULE_STRING )
            {
             before(grammarAccess.getPersonAccess().getVaterPersonCrossReference_33_0_0()); 
            // InternalAhnen.g:5388:3: ( RULE_STRING )
            // InternalAhnen.g:5389:4: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getVaterPersonSTRINGTerminalRuleCall_33_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getVaterPersonSTRINGTerminalRuleCall_33_0_0_1()); 

            }

             after(grammarAccess.getPersonAccess().getVaterPersonCrossReference_33_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__VaterAssignment_33_0"


    // $ANTLR start "rule__Person__MutterAssignment_36_0"
    // InternalAhnen.g:5400:1: rule__Person__MutterAssignment_36_0 : ( ( RULE_STRING ) ) ;
    public final void rule__Person__MutterAssignment_36_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5404:1: ( ( ( RULE_STRING ) ) )
            // InternalAhnen.g:5405:2: ( ( RULE_STRING ) )
            {
            // InternalAhnen.g:5405:2: ( ( RULE_STRING ) )
            // InternalAhnen.g:5406:3: ( RULE_STRING )
            {
             before(grammarAccess.getPersonAccess().getMutterPersonCrossReference_36_0_0()); 
            // InternalAhnen.g:5407:3: ( RULE_STRING )
            // InternalAhnen.g:5408:4: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getMutterPersonSTRINGTerminalRuleCall_36_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getMutterPersonSTRINGTerminalRuleCall_36_0_0_1()); 

            }

             after(grammarAccess.getPersonAccess().getMutterPersonCrossReference_36_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__MutterAssignment_36_0"


    // $ANTLR start "rule__Person__KinderAssignment_39_0"
    // InternalAhnen.g:5419:1: rule__Person__KinderAssignment_39_0 : ( ruleKinder ) ;
    public final void rule__Person__KinderAssignment_39_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5423:1: ( ( ruleKinder ) )
            // InternalAhnen.g:5424:2: ( ruleKinder )
            {
            // InternalAhnen.g:5424:2: ( ruleKinder )
            // InternalAhnen.g:5425:3: ruleKinder
            {
             before(grammarAccess.getPersonAccess().getKinderKinderParserRuleCall_39_0_0()); 
            pushFollow(FOLLOW_2);
            ruleKinder();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getKinderKinderParserRuleCall_39_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__KinderAssignment_39_0"


    // $ANTLR start "rule__Person__StiefkinderAssignment_42_0"
    // InternalAhnen.g:5434:1: rule__Person__StiefkinderAssignment_42_0 : ( ruleKinder ) ;
    public final void rule__Person__StiefkinderAssignment_42_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5438:1: ( ( ruleKinder ) )
            // InternalAhnen.g:5439:2: ( ruleKinder )
            {
            // InternalAhnen.g:5439:2: ( ruleKinder )
            // InternalAhnen.g:5440:3: ruleKinder
            {
             before(grammarAccess.getPersonAccess().getStiefkinderKinderParserRuleCall_42_0_0()); 
            pushFollow(FOLLOW_2);
            ruleKinder();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getStiefkinderKinderParserRuleCall_42_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__StiefkinderAssignment_42_0"


    // $ANTLR start "rule__Person__BeziehungenAssignment_46_0"
    // InternalAhnen.g:5449:1: rule__Person__BeziehungenAssignment_46_0 : ( ruleBeziehung ) ;
    public final void rule__Person__BeziehungenAssignment_46_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5453:1: ( ( ruleBeziehung ) )
            // InternalAhnen.g:5454:2: ( ruleBeziehung )
            {
            // InternalAhnen.g:5454:2: ( ruleBeziehung )
            // InternalAhnen.g:5455:3: ruleBeziehung
            {
             before(grammarAccess.getPersonAccess().getBeziehungenBeziehungParserRuleCall_46_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBeziehung();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getBeziehungenBeziehungParserRuleCall_46_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__BeziehungenAssignment_46_0"


    // $ANTLR start "rule__Person__EreignisseAssignment_50_0"
    // InternalAhnen.g:5464:1: rule__Person__EreignisseAssignment_50_0 : ( ruleEreignis ) ;
    public final void rule__Person__EreignisseAssignment_50_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5468:1: ( ( ruleEreignis ) )
            // InternalAhnen.g:5469:2: ( ruleEreignis )
            {
            // InternalAhnen.g:5469:2: ( ruleEreignis )
            // InternalAhnen.g:5470:3: ruleEreignis
            {
             before(grammarAccess.getPersonAccess().getEreignisseEreignisParserRuleCall_50_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEreignis();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getEreignisseEreignisParserRuleCall_50_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__EreignisseAssignment_50_0"


    // $ANTLR start "rule__Schulausbildung__VonAssignment_3_0"
    // InternalAhnen.g:5479:1: rule__Schulausbildung__VonAssignment_3_0 : ( ruleDATUM ) ;
    public final void rule__Schulausbildung__VonAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5483:1: ( ( ruleDATUM ) )
            // InternalAhnen.g:5484:2: ( ruleDATUM )
            {
            // InternalAhnen.g:5484:2: ( ruleDATUM )
            // InternalAhnen.g:5485:3: ruleDATUM
            {
             before(grammarAccess.getSchulausbildungAccess().getVonDATUMParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDATUM();

            state._fsp--;

             after(grammarAccess.getSchulausbildungAccess().getVonDATUMParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__VonAssignment_3_0"


    // $ANTLR start "rule__Schulausbildung__BisAssignment_5_0"
    // InternalAhnen.g:5494:1: rule__Schulausbildung__BisAssignment_5_0 : ( ruleDATUM ) ;
    public final void rule__Schulausbildung__BisAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5498:1: ( ( ruleDATUM ) )
            // InternalAhnen.g:5499:2: ( ruleDATUM )
            {
            // InternalAhnen.g:5499:2: ( ruleDATUM )
            // InternalAhnen.g:5500:3: ruleDATUM
            {
             before(grammarAccess.getSchulausbildungAccess().getBisDATUMParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDATUM();

            state._fsp--;

             after(grammarAccess.getSchulausbildungAccess().getBisDATUMParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__BisAssignment_5_0"


    // $ANTLR start "rule__Schulausbildung__AbschlussAssignment_7_0"
    // InternalAhnen.g:5509:1: rule__Schulausbildung__AbschlussAssignment_7_0 : ( RULE_STRING ) ;
    public final void rule__Schulausbildung__AbschlussAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5513:1: ( ( RULE_STRING ) )
            // InternalAhnen.g:5514:2: ( RULE_STRING )
            {
            // InternalAhnen.g:5514:2: ( RULE_STRING )
            // InternalAhnen.g:5515:3: RULE_STRING
            {
             before(grammarAccess.getSchulausbildungAccess().getAbschlussSTRINGTerminalRuleCall_7_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSchulausbildungAccess().getAbschlussSTRINGTerminalRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schulausbildung__AbschlussAssignment_7_0"


    // $ANTLR start "rule__Taetigkeit__BerufAssignment_3_0"
    // InternalAhnen.g:5524:1: rule__Taetigkeit__BerufAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__Taetigkeit__BerufAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5528:1: ( ( RULE_STRING ) )
            // InternalAhnen.g:5529:2: ( RULE_STRING )
            {
            // InternalAhnen.g:5529:2: ( RULE_STRING )
            // InternalAhnen.g:5530:3: RULE_STRING
            {
             before(grammarAccess.getTaetigkeitAccess().getBerufSTRINGTerminalRuleCall_3_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTaetigkeitAccess().getBerufSTRINGTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__BerufAssignment_3_0"


    // $ANTLR start "rule__Taetigkeit__ArbeitgeberAssignment_5_0"
    // InternalAhnen.g:5539:1: rule__Taetigkeit__ArbeitgeberAssignment_5_0 : ( RULE_STRING ) ;
    public final void rule__Taetigkeit__ArbeitgeberAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5543:1: ( ( RULE_STRING ) )
            // InternalAhnen.g:5544:2: ( RULE_STRING )
            {
            // InternalAhnen.g:5544:2: ( RULE_STRING )
            // InternalAhnen.g:5545:3: RULE_STRING
            {
             before(grammarAccess.getTaetigkeitAccess().getArbeitgeberSTRINGTerminalRuleCall_5_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTaetigkeitAccess().getArbeitgeberSTRINGTerminalRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__ArbeitgeberAssignment_5_0"


    // $ANTLR start "rule__Taetigkeit__OrtAssignment_7_0"
    // InternalAhnen.g:5554:1: rule__Taetigkeit__OrtAssignment_7_0 : ( RULE_STRING ) ;
    public final void rule__Taetigkeit__OrtAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5558:1: ( ( RULE_STRING ) )
            // InternalAhnen.g:5559:2: ( RULE_STRING )
            {
            // InternalAhnen.g:5559:2: ( RULE_STRING )
            // InternalAhnen.g:5560:3: RULE_STRING
            {
             before(grammarAccess.getTaetigkeitAccess().getOrtSTRINGTerminalRuleCall_7_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTaetigkeitAccess().getOrtSTRINGTerminalRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__OrtAssignment_7_0"


    // $ANTLR start "rule__Taetigkeit__VonAssignment_9_0"
    // InternalAhnen.g:5569:1: rule__Taetigkeit__VonAssignment_9_0 : ( ruleDATUM ) ;
    public final void rule__Taetigkeit__VonAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5573:1: ( ( ruleDATUM ) )
            // InternalAhnen.g:5574:2: ( ruleDATUM )
            {
            // InternalAhnen.g:5574:2: ( ruleDATUM )
            // InternalAhnen.g:5575:3: ruleDATUM
            {
             before(grammarAccess.getTaetigkeitAccess().getVonDATUMParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDATUM();

            state._fsp--;

             after(grammarAccess.getTaetigkeitAccess().getVonDATUMParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__VonAssignment_9_0"


    // $ANTLR start "rule__Taetigkeit__BisAssignment_11_0"
    // InternalAhnen.g:5584:1: rule__Taetigkeit__BisAssignment_11_0 : ( ruleDATUM ) ;
    public final void rule__Taetigkeit__BisAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5588:1: ( ( ruleDATUM ) )
            // InternalAhnen.g:5589:2: ( ruleDATUM )
            {
            // InternalAhnen.g:5589:2: ( ruleDATUM )
            // InternalAhnen.g:5590:3: ruleDATUM
            {
             before(grammarAccess.getTaetigkeitAccess().getBisDATUMParserRuleCall_11_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDATUM();

            state._fsp--;

             after(grammarAccess.getTaetigkeitAccess().getBisDATUMParserRuleCall_11_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Taetigkeit__BisAssignment_11_0"


    // $ANTLR start "rule__Kinder__KindAssignment_1_0"
    // InternalAhnen.g:5599:1: rule__Kinder__KindAssignment_1_0 : ( ( RULE_STRING ) ) ;
    public final void rule__Kinder__KindAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5603:1: ( ( ( RULE_STRING ) ) )
            // InternalAhnen.g:5604:2: ( ( RULE_STRING ) )
            {
            // InternalAhnen.g:5604:2: ( ( RULE_STRING ) )
            // InternalAhnen.g:5605:3: ( RULE_STRING )
            {
             before(grammarAccess.getKinderAccess().getKindPersonCrossReference_1_0_0()); 
            // InternalAhnen.g:5606:3: ( RULE_STRING )
            // InternalAhnen.g:5607:4: RULE_STRING
            {
             before(grammarAccess.getKinderAccess().getKindPersonSTRINGTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getKinderAccess().getKindPersonSTRINGTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getKinderAccess().getKindPersonCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinder__KindAssignment_1_0"


    // $ANTLR start "rule__Kinder__NextAssignment_2_1"
    // InternalAhnen.g:5618:1: rule__Kinder__NextAssignment_2_1 : ( ruleKinder ) ;
    public final void rule__Kinder__NextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5622:1: ( ( ruleKinder ) )
            // InternalAhnen.g:5623:2: ( ruleKinder )
            {
            // InternalAhnen.g:5623:2: ( ruleKinder )
            // InternalAhnen.g:5624:3: ruleKinder
            {
             before(grammarAccess.getKinderAccess().getNextKinderParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKinder();

            state._fsp--;

             after(grammarAccess.getKinderAccess().getNextKinderParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kinder__NextAssignment_2_1"


    // $ANTLR start "rule__Beziehung__BeziehungAssignment_3_0"
    // InternalAhnen.g:5633:1: rule__Beziehung__BeziehungAssignment_3_0 : ( ( RULE_STRING ) ) ;
    public final void rule__Beziehung__BeziehungAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5637:1: ( ( ( RULE_STRING ) ) )
            // InternalAhnen.g:5638:2: ( ( RULE_STRING ) )
            {
            // InternalAhnen.g:5638:2: ( ( RULE_STRING ) )
            // InternalAhnen.g:5639:3: ( RULE_STRING )
            {
             before(grammarAccess.getBeziehungAccess().getBeziehungPersonCrossReference_3_0_0()); 
            // InternalAhnen.g:5640:3: ( RULE_STRING )
            // InternalAhnen.g:5641:4: RULE_STRING
            {
             before(grammarAccess.getBeziehungAccess().getBeziehungPersonSTRINGTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBeziehungAccess().getBeziehungPersonSTRINGTerminalRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getBeziehungAccess().getBeziehungPersonCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__BeziehungAssignment_3_0"


    // $ANTLR start "rule__Beziehung__VonDatumAssignment_6_0"
    // InternalAhnen.g:5652:1: rule__Beziehung__VonDatumAssignment_6_0 : ( ruleDATUM ) ;
    public final void rule__Beziehung__VonDatumAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5656:1: ( ( ruleDATUM ) )
            // InternalAhnen.g:5657:2: ( ruleDATUM )
            {
            // InternalAhnen.g:5657:2: ( ruleDATUM )
            // InternalAhnen.g:5658:3: ruleDATUM
            {
             before(grammarAccess.getBeziehungAccess().getVonDatumDATUMParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDATUM();

            state._fsp--;

             after(grammarAccess.getBeziehungAccess().getVonDatumDATUMParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__VonDatumAssignment_6_0"


    // $ANTLR start "rule__Beziehung__BisDatumAssignment_8_0"
    // InternalAhnen.g:5667:1: rule__Beziehung__BisDatumAssignment_8_0 : ( ruleDATUM ) ;
    public final void rule__Beziehung__BisDatumAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5671:1: ( ( ruleDATUM ) )
            // InternalAhnen.g:5672:2: ( ruleDATUM )
            {
            // InternalAhnen.g:5672:2: ( ruleDATUM )
            // InternalAhnen.g:5673:3: ruleDATUM
            {
             before(grammarAccess.getBeziehungAccess().getBisDatumDATUMParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDATUM();

            state._fsp--;

             after(grammarAccess.getBeziehungAccess().getBisDatumDATUMParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__BisDatumAssignment_8_0"


    // $ANTLR start "rule__Beziehung__HochzeitstagAssignment_11_0"
    // InternalAhnen.g:5682:1: rule__Beziehung__HochzeitstagAssignment_11_0 : ( ruleDATUM ) ;
    public final void rule__Beziehung__HochzeitstagAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5686:1: ( ( ruleDATUM ) )
            // InternalAhnen.g:5687:2: ( ruleDATUM )
            {
            // InternalAhnen.g:5687:2: ( ruleDATUM )
            // InternalAhnen.g:5688:3: ruleDATUM
            {
             before(grammarAccess.getBeziehungAccess().getHochzeitstagDATUMParserRuleCall_11_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDATUM();

            state._fsp--;

             after(grammarAccess.getBeziehungAccess().getHochzeitstagDATUMParserRuleCall_11_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__HochzeitstagAssignment_11_0"


    // $ANTLR start "rule__Beziehung__ScheidungstagAssignment_14_0"
    // InternalAhnen.g:5697:1: rule__Beziehung__ScheidungstagAssignment_14_0 : ( ruleDATUM ) ;
    public final void rule__Beziehung__ScheidungstagAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5701:1: ( ( ruleDATUM ) )
            // InternalAhnen.g:5702:2: ( ruleDATUM )
            {
            // InternalAhnen.g:5702:2: ( ruleDATUM )
            // InternalAhnen.g:5703:3: ruleDATUM
            {
             before(grammarAccess.getBeziehungAccess().getScheidungstagDATUMParserRuleCall_14_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDATUM();

            state._fsp--;

             after(grammarAccess.getBeziehungAccess().getScheidungstagDATUMParserRuleCall_14_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__ScheidungstagAssignment_14_0"


    // $ANTLR start "rule__Familienbuch__NameAssignment_1"
    // InternalAhnen.g:5712:1: rule__Familienbuch__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Familienbuch__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5716:1: ( ( RULE_ID ) )
            // InternalAhnen.g:5717:2: ( RULE_ID )
            {
            // InternalAhnen.g:5717:2: ( RULE_ID )
            // InternalAhnen.g:5718:3: RULE_ID
            {
             before(grammarAccess.getFamilienbuchAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__NameAssignment_1"


    // $ANTLR start "rule__Familienbuch__FamilieAssignment_4"
    // InternalAhnen.g:5727:1: rule__Familienbuch__FamilieAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Familienbuch__FamilieAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5731:1: ( ( RULE_STRING ) )
            // InternalAhnen.g:5732:2: ( RULE_STRING )
            {
            // InternalAhnen.g:5732:2: ( RULE_STRING )
            // InternalAhnen.g:5733:3: RULE_STRING
            {
             before(grammarAccess.getFamilienbuchAccess().getFamilieSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getFamilieSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__FamilieAssignment_4"


    // $ANTLR start "rule__Familienbuch__PersonAssignment_7"
    // InternalAhnen.g:5742:1: rule__Familienbuch__PersonAssignment_7 : ( ( RULE_STRING ) ) ;
    public final void rule__Familienbuch__PersonAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5746:1: ( ( ( RULE_STRING ) ) )
            // InternalAhnen.g:5747:2: ( ( RULE_STRING ) )
            {
            // InternalAhnen.g:5747:2: ( ( RULE_STRING ) )
            // InternalAhnen.g:5748:3: ( RULE_STRING )
            {
             before(grammarAccess.getFamilienbuchAccess().getPersonPersonCrossReference_7_0()); 
            // InternalAhnen.g:5749:3: ( RULE_STRING )
            // InternalAhnen.g:5750:4: RULE_STRING
            {
             before(grammarAccess.getFamilienbuchAccess().getPersonPersonSTRINGTerminalRuleCall_7_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getPersonPersonSTRINGTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getFamilienbuchAccess().getPersonPersonCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__PersonAssignment_7"


    // $ANTLR start "rule__Familienbuch__VersionAssignment_10"
    // InternalAhnen.g:5761:1: rule__Familienbuch__VersionAssignment_10 : ( ruleVERSION ) ;
    public final void rule__Familienbuch__VersionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5765:1: ( ( ruleVERSION ) )
            // InternalAhnen.g:5766:2: ( ruleVERSION )
            {
            // InternalAhnen.g:5766:2: ( ruleVERSION )
            // InternalAhnen.g:5767:3: ruleVERSION
            {
             before(grammarAccess.getFamilienbuchAccess().getVersionVERSIONParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleVERSION();

            state._fsp--;

             after(grammarAccess.getFamilienbuchAccess().getVersionVERSIONParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__VersionAssignment_10"


    // $ANTLR start "rule__Familienbuch__TitelAssignment_13"
    // InternalAhnen.g:5776:1: rule__Familienbuch__TitelAssignment_13 : ( RULE_STRING ) ;
    public final void rule__Familienbuch__TitelAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5780:1: ( ( RULE_STRING ) )
            // InternalAhnen.g:5781:2: ( RULE_STRING )
            {
            // InternalAhnen.g:5781:2: ( RULE_STRING )
            // InternalAhnen.g:5782:3: RULE_STRING
            {
             before(grammarAccess.getFamilienbuchAccess().getTitelSTRINGTerminalRuleCall_13_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getTitelSTRINGTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__TitelAssignment_13"


    // $ANTLR start "rule__Familienbuch__VorwortAssignment_17"
    // InternalAhnen.g:5791:1: rule__Familienbuch__VorwortAssignment_17 : ( RULE_STRING ) ;
    public final void rule__Familienbuch__VorwortAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5795:1: ( ( RULE_STRING ) )
            // InternalAhnen.g:5796:2: ( RULE_STRING )
            {
            // InternalAhnen.g:5796:2: ( RULE_STRING )
            // InternalAhnen.g:5797:3: RULE_STRING
            {
             before(grammarAccess.getFamilienbuchAccess().getVorwortSTRINGTerminalRuleCall_17_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFamilienbuchAccess().getVorwortSTRINGTerminalRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__VorwortAssignment_17"


    // $ANTLR start "rule__Familienbuch__AutorAssignment_21"
    // InternalAhnen.g:5806:1: rule__Familienbuch__AutorAssignment_21 : ( ruleAutor ) ;
    public final void rule__Familienbuch__AutorAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5810:1: ( ( ruleAutor ) )
            // InternalAhnen.g:5811:2: ( ruleAutor )
            {
            // InternalAhnen.g:5811:2: ( ruleAutor )
            // InternalAhnen.g:5812:3: ruleAutor
            {
             before(grammarAccess.getFamilienbuchAccess().getAutorAutorParserRuleCall_21_0()); 
            pushFollow(FOLLOW_2);
            ruleAutor();

            state._fsp--;

             after(grammarAccess.getFamilienbuchAccess().getAutorAutorParserRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__AutorAssignment_21"


    // $ANTLR start "rule__Familienbuch__FamilienAssignment_25"
    // InternalAhnen.g:5821:1: rule__Familienbuch__FamilienAssignment_25 : ( ruleFamilienImport ) ;
    public final void rule__Familienbuch__FamilienAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5825:1: ( ( ruleFamilienImport ) )
            // InternalAhnen.g:5826:2: ( ruleFamilienImport )
            {
            // InternalAhnen.g:5826:2: ( ruleFamilienImport )
            // InternalAhnen.g:5827:3: ruleFamilienImport
            {
             before(grammarAccess.getFamilienbuchAccess().getFamilienFamilienImportParserRuleCall_25_0()); 
            pushFollow(FOLLOW_2);
            ruleFamilienImport();

            state._fsp--;

             after(grammarAccess.getFamilienbuchAccess().getFamilienFamilienImportParserRuleCall_25_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Familienbuch__FamilienAssignment_25"


    // $ANTLR start "rule__FamilienImport__FamilieAssignment_2"
    // InternalAhnen.g:5836:1: rule__FamilienImport__FamilieAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__FamilienImport__FamilieAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5840:1: ( ( ( RULE_ID ) ) )
            // InternalAhnen.g:5841:2: ( ( RULE_ID ) )
            {
            // InternalAhnen.g:5841:2: ( ( RULE_ID ) )
            // InternalAhnen.g:5842:3: ( RULE_ID )
            {
             before(grammarAccess.getFamilienImportAccess().getFamilieFamilieCrossReference_2_0()); 
            // InternalAhnen.g:5843:3: ( RULE_ID )
            // InternalAhnen.g:5844:4: RULE_ID
            {
             before(grammarAccess.getFamilienImportAccess().getFamilieFamilieIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFamilienImportAccess().getFamilieFamilieIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFamilienImportAccess().getFamilieFamilieCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FamilienImport__FamilieAssignment_2"


    // $ANTLR start "rule__Autor__VornameAssignment_1"
    // InternalAhnen.g:5855:1: rule__Autor__VornameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Autor__VornameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5859:1: ( ( RULE_STRING ) )
            // InternalAhnen.g:5860:2: ( RULE_STRING )
            {
            // InternalAhnen.g:5860:2: ( RULE_STRING )
            // InternalAhnen.g:5861:3: RULE_STRING
            {
             before(grammarAccess.getAutorAccess().getVornameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAutorAccess().getVornameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__VornameAssignment_1"


    // $ANTLR start "rule__Autor__NachnameAssignment_4"
    // InternalAhnen.g:5870:1: rule__Autor__NachnameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Autor__NachnameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5874:1: ( ( RULE_STRING ) )
            // InternalAhnen.g:5875:2: ( RULE_STRING )
            {
            // InternalAhnen.g:5875:2: ( RULE_STRING )
            // InternalAhnen.g:5876:3: RULE_STRING
            {
             before(grammarAccess.getAutorAccess().getNachnameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAutorAccess().getNachnameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__NachnameAssignment_4"


    // $ANTLR start "rule__Autor__OrganisationsNameAssignment_7"
    // InternalAhnen.g:5885:1: rule__Autor__OrganisationsNameAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Autor__OrganisationsNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAhnen.g:5889:1: ( ( RULE_STRING ) )
            // InternalAhnen.g:5890:2: ( RULE_STRING )
            {
            // InternalAhnen.g:5890:2: ( RULE_STRING )
            // InternalAhnen.g:5891:3: RULE_STRING
            {
             before(grammarAccess.getAutorAccess().getOrganisationsNameSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAutorAccess().getOrganisationsNameSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autor__OrganisationsNameAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0011000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000003080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000081801000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000000D010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000011080L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000031080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0011000000020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000000000C0080L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000101010L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000603010L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000080000080L});

}