package com.github.funthomas424242.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.github.funthomas424242.dsl.services.AhnenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAhnenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DATE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Familie'", "';'", "'Person'", "'{'", "'Letzte'", "'\\u00C4nderung:'", "'.'", "'Vorname:'", "'unbekannt'", "'Mittelname:'", "'-'", "'Nachname:'", "'Geburtsname:'", "'Rufname:'", "'Geschlecht:'", "'Geburtsdatum:'", "'Todesdatum:'", "'lebend'", "'vermisst'", "'Vater:'", "'unerfasst'", "'Mutter:'", "'Kinder:'", "'keine'", "'Stiefkinder:'", "'Beziehungen:'", "'}'", "'Ereignisse:'", "'bekannt'", "'Schulausbildung:'", "'von'", "'bis'", "'Abschluss:'", "'ohne'", "'abgebrochen'", "'T\\u00E4tigkeit:'", "'als'", "'bei'", "'in'", "','", "'Beziehung:'", "'mit'", "'von:'", "'bis:'", "'andauernd'", "'Hochzeit:'", "'Scheidung:'", "'unabsehbar'", "'demn\\u00E4chst'", "'Familienbuch'", "'Familie:'", "'Person:'", "'Version:'", "'Titel:'", "'Vorwort:'", "'Autor:'", "'Familien:'", "'import'", "'familie'", "'Name:'", "'Organisation'", "'m\\u00E4nnlich'", "'weiblich'"
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
    public static final int RULE_ID=4;
    public static final int RULE_DATE=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=5;
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

        public InternalAhnenParser(TokenStream input, AhnenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected AhnenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalAhnen.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAhnen.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalAhnen.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAhnen.g:72:1: ruleModel returns [EObject current=null] : ( (lv_datei_0_0= ruleDateiart ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_datei_0_0 = null;



        	enterRule();

        try {
            // InternalAhnen.g:78:2: ( ( (lv_datei_0_0= ruleDateiart ) ) )
            // InternalAhnen.g:79:2: ( (lv_datei_0_0= ruleDateiart ) )
            {
            // InternalAhnen.g:79:2: ( (lv_datei_0_0= ruleDateiart ) )
            // InternalAhnen.g:80:3: (lv_datei_0_0= ruleDateiart )
            {
            // InternalAhnen.g:80:3: (lv_datei_0_0= ruleDateiart )
            // InternalAhnen.g:81:4: lv_datei_0_0= ruleDateiart
            {

            				newCompositeNode(grammarAccess.getModelAccess().getDateiDateiartParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_datei_0_0=ruleDateiart();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"datei",
            					lv_datei_0_0,
            					"com.github.funthomas424242.dsl.Ahnen.Dateiart");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDateiart"
    // InternalAhnen.g:101:1: entryRuleDateiart returns [EObject current=null] : iv_ruleDateiart= ruleDateiart EOF ;
    public final EObject entryRuleDateiart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateiart = null;


        try {
            // InternalAhnen.g:101:49: (iv_ruleDateiart= ruleDateiart EOF )
            // InternalAhnen.g:102:2: iv_ruleDateiart= ruleDateiart EOF
            {
             newCompositeNode(grammarAccess.getDateiartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateiart=ruleDateiart();

            state._fsp--;

             current =iv_ruleDateiart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateiart"


    // $ANTLR start "ruleDateiart"
    // InternalAhnen.g:108:1: ruleDateiart returns [EObject current=null] : ( ( (lv_buch_0_0= ruleFamilienbuch ) ) | ( (lv_familie_1_0= ruleFamilie ) ) ) ;
    public final EObject ruleDateiart() throws RecognitionException {
        EObject current = null;

        EObject lv_buch_0_0 = null;

        EObject lv_familie_1_0 = null;



        	enterRule();

        try {
            // InternalAhnen.g:114:2: ( ( ( (lv_buch_0_0= ruleFamilienbuch ) ) | ( (lv_familie_1_0= ruleFamilie ) ) ) )
            // InternalAhnen.g:115:2: ( ( (lv_buch_0_0= ruleFamilienbuch ) ) | ( (lv_familie_1_0= ruleFamilie ) ) )
            {
            // InternalAhnen.g:115:2: ( ( (lv_buch_0_0= ruleFamilienbuch ) ) | ( (lv_familie_1_0= ruleFamilie ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==61) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAhnen.g:116:3: ( (lv_buch_0_0= ruleFamilienbuch ) )
                    {
                    // InternalAhnen.g:116:3: ( (lv_buch_0_0= ruleFamilienbuch ) )
                    // InternalAhnen.g:117:4: (lv_buch_0_0= ruleFamilienbuch )
                    {
                    // InternalAhnen.g:117:4: (lv_buch_0_0= ruleFamilienbuch )
                    // InternalAhnen.g:118:5: lv_buch_0_0= ruleFamilienbuch
                    {

                    					newCompositeNode(grammarAccess.getDateiartAccess().getBuchFamilienbuchParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_buch_0_0=ruleFamilienbuch();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDateiartRule());
                    					}
                    					set(
                    						current,
                    						"buch",
                    						lv_buch_0_0,
                    						"com.github.funthomas424242.dsl.Ahnen.Familienbuch");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:136:3: ( (lv_familie_1_0= ruleFamilie ) )
                    {
                    // InternalAhnen.g:136:3: ( (lv_familie_1_0= ruleFamilie ) )
                    // InternalAhnen.g:137:4: (lv_familie_1_0= ruleFamilie )
                    {
                    // InternalAhnen.g:137:4: (lv_familie_1_0= ruleFamilie )
                    // InternalAhnen.g:138:5: lv_familie_1_0= ruleFamilie
                    {

                    					newCompositeNode(grammarAccess.getDateiartAccess().getFamilieFamilieParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_familie_1_0=ruleFamilie();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDateiartRule());
                    					}
                    					set(
                    						current,
                    						"familie",
                    						lv_familie_1_0,
                    						"com.github.funthomas424242.dsl.Ahnen.Familie");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateiart"


    // $ANTLR start "entryRuleFamilie"
    // InternalAhnen.g:159:1: entryRuleFamilie returns [EObject current=null] : iv_ruleFamilie= ruleFamilie EOF ;
    public final EObject entryRuleFamilie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFamilie = null;


        try {
            // InternalAhnen.g:159:48: (iv_ruleFamilie= ruleFamilie EOF )
            // InternalAhnen.g:160:2: iv_ruleFamilie= ruleFamilie EOF
            {
             newCompositeNode(grammarAccess.getFamilieRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFamilie=ruleFamilie();

            state._fsp--;

             current =iv_ruleFamilie; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFamilie"


    // $ANTLR start "ruleFamilie"
    // InternalAhnen.g:166:1: ruleFamilie returns [EObject current=null] : ( () otherlv_1= 'Familie' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ( (lv_personen_4_0= rulePerson ) )+ ) ;
    public final EObject ruleFamilie() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_personen_4_0 = null;



        	enterRule();

        try {
            // InternalAhnen.g:172:2: ( ( () otherlv_1= 'Familie' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ( (lv_personen_4_0= rulePerson ) )+ ) )
            // InternalAhnen.g:173:2: ( () otherlv_1= 'Familie' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ( (lv_personen_4_0= rulePerson ) )+ )
            {
            // InternalAhnen.g:173:2: ( () otherlv_1= 'Familie' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ( (lv_personen_4_0= rulePerson ) )+ )
            // InternalAhnen.g:174:3: () otherlv_1= 'Familie' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ( (lv_personen_4_0= rulePerson ) )+
            {
            // InternalAhnen.g:174:3: ()
            // InternalAhnen.g:175:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFamilieAccess().getFamilieAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFamilieAccess().getFamilieKeyword_1());
            		
            // InternalAhnen.g:185:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAhnen.g:186:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAhnen.g:186:4: (lv_name_2_0= RULE_ID )
            // InternalAhnen.g:187:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFamilieAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFamilieRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFamilieAccess().getSemicolonKeyword_3());
            		
            // InternalAhnen.g:207:3: ( (lv_personen_4_0= rulePerson ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAhnen.g:208:4: (lv_personen_4_0= rulePerson )
            	    {
            	    // InternalAhnen.g:208:4: (lv_personen_4_0= rulePerson )
            	    // InternalAhnen.g:209:5: lv_personen_4_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getFamilieAccess().getPersonenPersonParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_personen_4_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFamilieRule());
            	    					}
            	    					add(
            	    						current,
            	    						"personen",
            	    						lv_personen_4_0,
            	    						"com.github.funthomas424242.dsl.Ahnen.Person");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFamilie"


    // $ANTLR start "entryRulePerson"
    // InternalAhnen.g:230:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalAhnen.g:230:47: (iv_rulePerson= rulePerson EOF )
            // InternalAhnen.g:231:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalAhnen.g:237:1: rulePerson returns [EObject current=null] : ( () otherlv_1= 'Person' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Letzte' otherlv_5= '\\u00C4nderung:' ( (lv_letzteAenderung_6_0= ruleDATUM ) ) otherlv_7= '.' otherlv_8= 'Vorname:' ( ( (lv_vorname_9_0= RULE_STRING ) )? | otherlv_10= 'unbekannt' ) otherlv_11= '.' otherlv_12= 'Mittelname:' ( ( (lv_mittelname_13_0= RULE_STRING ) )? | otherlv_14= 'unbekannt' | otherlv_15= '-' ) otherlv_16= '.' otherlv_17= 'Nachname:' ( ( (lv_nachname_18_0= RULE_STRING ) )? | otherlv_19= 'unbekannt' ) otherlv_20= '.' otherlv_21= 'Geburtsname:' ( ( (lv_geburtsname_22_0= RULE_STRING ) )? | otherlv_23= 'unbekannt' ) otherlv_24= '.' otherlv_25= 'Rufname:' ( ( (lv_rufname_26_0= RULE_STRING ) )? | otherlv_27= 'unbekannt' ) otherlv_28= '.' otherlv_29= 'Geschlecht:' ( (lv_geschlecht_30_0= ruleGeschlecht ) )? otherlv_31= '.' otherlv_32= 'Geburtsdatum:' ( ( (lv_geburtsDatum_33_0= ruleDATUM ) )? | otherlv_34= 'unbekannt' ) otherlv_35= '.' otherlv_36= 'Todesdatum:' ( ( (lv_todesDatum_37_0= ruleDATUM ) )? | otherlv_38= 'unbekannt' | otherlv_39= 'lebend' | otherlv_40= 'vermisst' ) otherlv_41= '.' otherlv_42= 'Vater:' ( ( (otherlv_43= RULE_STRING ) )? | otherlv_44= 'unbekannt' | otherlv_45= 'unerfasst' ) otherlv_46= '.' otherlv_47= 'Mutter:' ( ( (otherlv_48= RULE_STRING ) )? | otherlv_49= 'unbekannt' | otherlv_50= 'unerfasst' ) otherlv_51= '.' otherlv_52= 'Kinder:' ( ( (lv_kinder_53_0= ruleKinder ) )? | otherlv_54= 'keine' ) otherlv_55= '.' otherlv_56= 'Stiefkinder:' ( ( (lv_stiefkinder_57_0= ruleKinder ) )? | otherlv_58= 'keine' ) otherlv_59= '.' otherlv_60= 'Beziehungen:' otherlv_61= '{' ( ( (lv_beziehungen_62_0= ruleBeziehung ) )+ | otherlv_63= 'keine' ) otherlv_64= '}' otherlv_65= 'Ereignisse:' otherlv_66= '{' ( ( (lv_ereignisse_67_0= ruleEreignis ) )+ | (otherlv_68= 'keine' otherlv_69= 'bekannt' ) ) otherlv_70= '}' otherlv_71= '}' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_vorname_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_mittelname_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_nachname_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_geburtsname_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_rufname_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token otherlv_66=null;
        Token otherlv_68=null;
        Token otherlv_69=null;
        Token otherlv_70=null;
        Token otherlv_71=null;
        AntlrDatatypeRuleToken lv_letzteAenderung_6_0 = null;

        Enumerator lv_geschlecht_30_0 = null;

        AntlrDatatypeRuleToken lv_geburtsDatum_33_0 = null;

        AntlrDatatypeRuleToken lv_todesDatum_37_0 = null;

        EObject lv_kinder_53_0 = null;

        EObject lv_stiefkinder_57_0 = null;

        EObject lv_beziehungen_62_0 = null;

        EObject lv_ereignisse_67_0 = null;



        	enterRule();

        try {
            // InternalAhnen.g:243:2: ( ( () otherlv_1= 'Person' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Letzte' otherlv_5= '\\u00C4nderung:' ( (lv_letzteAenderung_6_0= ruleDATUM ) ) otherlv_7= '.' otherlv_8= 'Vorname:' ( ( (lv_vorname_9_0= RULE_STRING ) )? | otherlv_10= 'unbekannt' ) otherlv_11= '.' otherlv_12= 'Mittelname:' ( ( (lv_mittelname_13_0= RULE_STRING ) )? | otherlv_14= 'unbekannt' | otherlv_15= '-' ) otherlv_16= '.' otherlv_17= 'Nachname:' ( ( (lv_nachname_18_0= RULE_STRING ) )? | otherlv_19= 'unbekannt' ) otherlv_20= '.' otherlv_21= 'Geburtsname:' ( ( (lv_geburtsname_22_0= RULE_STRING ) )? | otherlv_23= 'unbekannt' ) otherlv_24= '.' otherlv_25= 'Rufname:' ( ( (lv_rufname_26_0= RULE_STRING ) )? | otherlv_27= 'unbekannt' ) otherlv_28= '.' otherlv_29= 'Geschlecht:' ( (lv_geschlecht_30_0= ruleGeschlecht ) )? otherlv_31= '.' otherlv_32= 'Geburtsdatum:' ( ( (lv_geburtsDatum_33_0= ruleDATUM ) )? | otherlv_34= 'unbekannt' ) otherlv_35= '.' otherlv_36= 'Todesdatum:' ( ( (lv_todesDatum_37_0= ruleDATUM ) )? | otherlv_38= 'unbekannt' | otherlv_39= 'lebend' | otherlv_40= 'vermisst' ) otherlv_41= '.' otherlv_42= 'Vater:' ( ( (otherlv_43= RULE_STRING ) )? | otherlv_44= 'unbekannt' | otherlv_45= 'unerfasst' ) otherlv_46= '.' otherlv_47= 'Mutter:' ( ( (otherlv_48= RULE_STRING ) )? | otherlv_49= 'unbekannt' | otherlv_50= 'unerfasst' ) otherlv_51= '.' otherlv_52= 'Kinder:' ( ( (lv_kinder_53_0= ruleKinder ) )? | otherlv_54= 'keine' ) otherlv_55= '.' otherlv_56= 'Stiefkinder:' ( ( (lv_stiefkinder_57_0= ruleKinder ) )? | otherlv_58= 'keine' ) otherlv_59= '.' otherlv_60= 'Beziehungen:' otherlv_61= '{' ( ( (lv_beziehungen_62_0= ruleBeziehung ) )+ | otherlv_63= 'keine' ) otherlv_64= '}' otherlv_65= 'Ereignisse:' otherlv_66= '{' ( ( (lv_ereignisse_67_0= ruleEreignis ) )+ | (otherlv_68= 'keine' otherlv_69= 'bekannt' ) ) otherlv_70= '}' otherlv_71= '}' ) )
            // InternalAhnen.g:244:2: ( () otherlv_1= 'Person' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Letzte' otherlv_5= '\\u00C4nderung:' ( (lv_letzteAenderung_6_0= ruleDATUM ) ) otherlv_7= '.' otherlv_8= 'Vorname:' ( ( (lv_vorname_9_0= RULE_STRING ) )? | otherlv_10= 'unbekannt' ) otherlv_11= '.' otherlv_12= 'Mittelname:' ( ( (lv_mittelname_13_0= RULE_STRING ) )? | otherlv_14= 'unbekannt' | otherlv_15= '-' ) otherlv_16= '.' otherlv_17= 'Nachname:' ( ( (lv_nachname_18_0= RULE_STRING ) )? | otherlv_19= 'unbekannt' ) otherlv_20= '.' otherlv_21= 'Geburtsname:' ( ( (lv_geburtsname_22_0= RULE_STRING ) )? | otherlv_23= 'unbekannt' ) otherlv_24= '.' otherlv_25= 'Rufname:' ( ( (lv_rufname_26_0= RULE_STRING ) )? | otherlv_27= 'unbekannt' ) otherlv_28= '.' otherlv_29= 'Geschlecht:' ( (lv_geschlecht_30_0= ruleGeschlecht ) )? otherlv_31= '.' otherlv_32= 'Geburtsdatum:' ( ( (lv_geburtsDatum_33_0= ruleDATUM ) )? | otherlv_34= 'unbekannt' ) otherlv_35= '.' otherlv_36= 'Todesdatum:' ( ( (lv_todesDatum_37_0= ruleDATUM ) )? | otherlv_38= 'unbekannt' | otherlv_39= 'lebend' | otherlv_40= 'vermisst' ) otherlv_41= '.' otherlv_42= 'Vater:' ( ( (otherlv_43= RULE_STRING ) )? | otherlv_44= 'unbekannt' | otherlv_45= 'unerfasst' ) otherlv_46= '.' otherlv_47= 'Mutter:' ( ( (otherlv_48= RULE_STRING ) )? | otherlv_49= 'unbekannt' | otherlv_50= 'unerfasst' ) otherlv_51= '.' otherlv_52= 'Kinder:' ( ( (lv_kinder_53_0= ruleKinder ) )? | otherlv_54= 'keine' ) otherlv_55= '.' otherlv_56= 'Stiefkinder:' ( ( (lv_stiefkinder_57_0= ruleKinder ) )? | otherlv_58= 'keine' ) otherlv_59= '.' otherlv_60= 'Beziehungen:' otherlv_61= '{' ( ( (lv_beziehungen_62_0= ruleBeziehung ) )+ | otherlv_63= 'keine' ) otherlv_64= '}' otherlv_65= 'Ereignisse:' otherlv_66= '{' ( ( (lv_ereignisse_67_0= ruleEreignis ) )+ | (otherlv_68= 'keine' otherlv_69= 'bekannt' ) ) otherlv_70= '}' otherlv_71= '}' )
            {
            // InternalAhnen.g:244:2: ( () otherlv_1= 'Person' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Letzte' otherlv_5= '\\u00C4nderung:' ( (lv_letzteAenderung_6_0= ruleDATUM ) ) otherlv_7= '.' otherlv_8= 'Vorname:' ( ( (lv_vorname_9_0= RULE_STRING ) )? | otherlv_10= 'unbekannt' ) otherlv_11= '.' otherlv_12= 'Mittelname:' ( ( (lv_mittelname_13_0= RULE_STRING ) )? | otherlv_14= 'unbekannt' | otherlv_15= '-' ) otherlv_16= '.' otherlv_17= 'Nachname:' ( ( (lv_nachname_18_0= RULE_STRING ) )? | otherlv_19= 'unbekannt' ) otherlv_20= '.' otherlv_21= 'Geburtsname:' ( ( (lv_geburtsname_22_0= RULE_STRING ) )? | otherlv_23= 'unbekannt' ) otherlv_24= '.' otherlv_25= 'Rufname:' ( ( (lv_rufname_26_0= RULE_STRING ) )? | otherlv_27= 'unbekannt' ) otherlv_28= '.' otherlv_29= 'Geschlecht:' ( (lv_geschlecht_30_0= ruleGeschlecht ) )? otherlv_31= '.' otherlv_32= 'Geburtsdatum:' ( ( (lv_geburtsDatum_33_0= ruleDATUM ) )? | otherlv_34= 'unbekannt' ) otherlv_35= '.' otherlv_36= 'Todesdatum:' ( ( (lv_todesDatum_37_0= ruleDATUM ) )? | otherlv_38= 'unbekannt' | otherlv_39= 'lebend' | otherlv_40= 'vermisst' ) otherlv_41= '.' otherlv_42= 'Vater:' ( ( (otherlv_43= RULE_STRING ) )? | otherlv_44= 'unbekannt' | otherlv_45= 'unerfasst' ) otherlv_46= '.' otherlv_47= 'Mutter:' ( ( (otherlv_48= RULE_STRING ) )? | otherlv_49= 'unbekannt' | otherlv_50= 'unerfasst' ) otherlv_51= '.' otherlv_52= 'Kinder:' ( ( (lv_kinder_53_0= ruleKinder ) )? | otherlv_54= 'keine' ) otherlv_55= '.' otherlv_56= 'Stiefkinder:' ( ( (lv_stiefkinder_57_0= ruleKinder ) )? | otherlv_58= 'keine' ) otherlv_59= '.' otherlv_60= 'Beziehungen:' otherlv_61= '{' ( ( (lv_beziehungen_62_0= ruleBeziehung ) )+ | otherlv_63= 'keine' ) otherlv_64= '}' otherlv_65= 'Ereignisse:' otherlv_66= '{' ( ( (lv_ereignisse_67_0= ruleEreignis ) )+ | (otherlv_68= 'keine' otherlv_69= 'bekannt' ) ) otherlv_70= '}' otherlv_71= '}' )
            // InternalAhnen.g:245:3: () otherlv_1= 'Person' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Letzte' otherlv_5= '\\u00C4nderung:' ( (lv_letzteAenderung_6_0= ruleDATUM ) ) otherlv_7= '.' otherlv_8= 'Vorname:' ( ( (lv_vorname_9_0= RULE_STRING ) )? | otherlv_10= 'unbekannt' ) otherlv_11= '.' otherlv_12= 'Mittelname:' ( ( (lv_mittelname_13_0= RULE_STRING ) )? | otherlv_14= 'unbekannt' | otherlv_15= '-' ) otherlv_16= '.' otherlv_17= 'Nachname:' ( ( (lv_nachname_18_0= RULE_STRING ) )? | otherlv_19= 'unbekannt' ) otherlv_20= '.' otherlv_21= 'Geburtsname:' ( ( (lv_geburtsname_22_0= RULE_STRING ) )? | otherlv_23= 'unbekannt' ) otherlv_24= '.' otherlv_25= 'Rufname:' ( ( (lv_rufname_26_0= RULE_STRING ) )? | otherlv_27= 'unbekannt' ) otherlv_28= '.' otherlv_29= 'Geschlecht:' ( (lv_geschlecht_30_0= ruleGeschlecht ) )? otherlv_31= '.' otherlv_32= 'Geburtsdatum:' ( ( (lv_geburtsDatum_33_0= ruleDATUM ) )? | otherlv_34= 'unbekannt' ) otherlv_35= '.' otherlv_36= 'Todesdatum:' ( ( (lv_todesDatum_37_0= ruleDATUM ) )? | otherlv_38= 'unbekannt' | otherlv_39= 'lebend' | otherlv_40= 'vermisst' ) otherlv_41= '.' otherlv_42= 'Vater:' ( ( (otherlv_43= RULE_STRING ) )? | otherlv_44= 'unbekannt' | otherlv_45= 'unerfasst' ) otherlv_46= '.' otherlv_47= 'Mutter:' ( ( (otherlv_48= RULE_STRING ) )? | otherlv_49= 'unbekannt' | otherlv_50= 'unerfasst' ) otherlv_51= '.' otherlv_52= 'Kinder:' ( ( (lv_kinder_53_0= ruleKinder ) )? | otherlv_54= 'keine' ) otherlv_55= '.' otherlv_56= 'Stiefkinder:' ( ( (lv_stiefkinder_57_0= ruleKinder ) )? | otherlv_58= 'keine' ) otherlv_59= '.' otherlv_60= 'Beziehungen:' otherlv_61= '{' ( ( (lv_beziehungen_62_0= ruleBeziehung ) )+ | otherlv_63= 'keine' ) otherlv_64= '}' otherlv_65= 'Ereignisse:' otherlv_66= '{' ( ( (lv_ereignisse_67_0= ruleEreignis ) )+ | (otherlv_68= 'keine' otherlv_69= 'bekannt' ) ) otherlv_70= '}' otherlv_71= '}'
            {
            // InternalAhnen.g:245:3: ()
            // InternalAhnen.g:246:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonAccess().getPersonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getPersonKeyword_1());
            		
            // InternalAhnen.g:256:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAhnen.g:257:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalAhnen.g:257:4: (lv_name_2_0= RULE_STRING )
            // InternalAhnen.g:258:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPersonAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getLetzteKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getPersonAccess().getÄnderungKeyword_5());
            		
            // InternalAhnen.g:286:3: ( (lv_letzteAenderung_6_0= ruleDATUM ) )
            // InternalAhnen.g:287:4: (lv_letzteAenderung_6_0= ruleDATUM )
            {
            // InternalAhnen.g:287:4: (lv_letzteAenderung_6_0= ruleDATUM )
            // InternalAhnen.g:288:5: lv_letzteAenderung_6_0= ruleDATUM
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getLetzteAenderungDATUMParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_letzteAenderung_6_0=ruleDATUM();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"letzteAenderung",
            						lv_letzteAenderung_6_0,
            						"com.github.funthomas424242.dsl.Ahnen.DATUM");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getPersonAccess().getFullStopKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getPersonAccess().getVornameKeyword_8());
            		
            // InternalAhnen.g:313:3: ( ( (lv_vorname_9_0= RULE_STRING ) )? | otherlv_10= 'unbekannt' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING||LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAhnen.g:314:4: ( (lv_vorname_9_0= RULE_STRING ) )?
                    {
                    // InternalAhnen.g:314:4: ( (lv_vorname_9_0= RULE_STRING ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_STRING) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalAhnen.g:315:5: (lv_vorname_9_0= RULE_STRING )
                            {
                            // InternalAhnen.g:315:5: (lv_vorname_9_0= RULE_STRING )
                            // InternalAhnen.g:316:6: lv_vorname_9_0= RULE_STRING
                            {
                            lv_vorname_9_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                            						newLeafNode(lv_vorname_9_0, grammarAccess.getPersonAccess().getVornameSTRINGTerminalRuleCall_9_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPersonRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"vorname",
                            							lv_vorname_9_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:333:4: otherlv_10= 'unbekannt'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getPersonAccess().getUnbekanntKeyword_9_1());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_11, grammarAccess.getPersonAccess().getFullStopKeyword_10());
            		
            otherlv_12=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_12, grammarAccess.getPersonAccess().getMittelnameKeyword_11());
            		
            // InternalAhnen.g:346:3: ( ( (lv_mittelname_13_0= RULE_STRING ) )? | otherlv_14= 'unbekannt' | otherlv_15= '-' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 18:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAhnen.g:347:4: ( (lv_mittelname_13_0= RULE_STRING ) )?
                    {
                    // InternalAhnen.g:347:4: ( (lv_mittelname_13_0= RULE_STRING ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_STRING) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalAhnen.g:348:5: (lv_mittelname_13_0= RULE_STRING )
                            {
                            // InternalAhnen.g:348:5: (lv_mittelname_13_0= RULE_STRING )
                            // InternalAhnen.g:349:6: lv_mittelname_13_0= RULE_STRING
                            {
                            lv_mittelname_13_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                            						newLeafNode(lv_mittelname_13_0, grammarAccess.getPersonAccess().getMittelnameSTRINGTerminalRuleCall_12_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPersonRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"mittelname",
                            							lv_mittelname_13_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:366:4: otherlv_14= 'unbekannt'
                    {
                    otherlv_14=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getPersonAccess().getUnbekanntKeyword_12_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalAhnen.g:371:4: otherlv_15= '-'
                    {
                    otherlv_15=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getPersonAccess().getHyphenMinusKeyword_12_2());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_16, grammarAccess.getPersonAccess().getFullStopKeyword_13());
            		
            otherlv_17=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_17, grammarAccess.getPersonAccess().getNachnameKeyword_14());
            		
            // InternalAhnen.g:384:3: ( ( (lv_nachname_18_0= RULE_STRING ) )? | otherlv_19= 'unbekannt' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING||LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAhnen.g:385:4: ( (lv_nachname_18_0= RULE_STRING ) )?
                    {
                    // InternalAhnen.g:385:4: ( (lv_nachname_18_0= RULE_STRING ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_STRING) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalAhnen.g:386:5: (lv_nachname_18_0= RULE_STRING )
                            {
                            // InternalAhnen.g:386:5: (lv_nachname_18_0= RULE_STRING )
                            // InternalAhnen.g:387:6: lv_nachname_18_0= RULE_STRING
                            {
                            lv_nachname_18_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                            						newLeafNode(lv_nachname_18_0, grammarAccess.getPersonAccess().getNachnameSTRINGTerminalRuleCall_15_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPersonRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"nachname",
                            							lv_nachname_18_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:404:4: otherlv_19= 'unbekannt'
                    {
                    otherlv_19=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_19, grammarAccess.getPersonAccess().getUnbekanntKeyword_15_1());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_20, grammarAccess.getPersonAccess().getFullStopKeyword_16());
            		
            otherlv_21=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_21, grammarAccess.getPersonAccess().getGeburtsnameKeyword_17());
            		
            // InternalAhnen.g:417:3: ( ( (lv_geburtsname_22_0= RULE_STRING ) )? | otherlv_23= 'unbekannt' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING||LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAhnen.g:418:4: ( (lv_geburtsname_22_0= RULE_STRING ) )?
                    {
                    // InternalAhnen.g:418:4: ( (lv_geburtsname_22_0= RULE_STRING ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_STRING) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAhnen.g:419:5: (lv_geburtsname_22_0= RULE_STRING )
                            {
                            // InternalAhnen.g:419:5: (lv_geburtsname_22_0= RULE_STRING )
                            // InternalAhnen.g:420:6: lv_geburtsname_22_0= RULE_STRING
                            {
                            lv_geburtsname_22_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                            						newLeafNode(lv_geburtsname_22_0, grammarAccess.getPersonAccess().getGeburtsnameSTRINGTerminalRuleCall_18_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPersonRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"geburtsname",
                            							lv_geburtsname_22_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:437:4: otherlv_23= 'unbekannt'
                    {
                    otherlv_23=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_23, grammarAccess.getPersonAccess().getUnbekanntKeyword_18_1());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_24, grammarAccess.getPersonAccess().getFullStopKeyword_19());
            		
            otherlv_25=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_25, grammarAccess.getPersonAccess().getRufnameKeyword_20());
            		
            // InternalAhnen.g:450:3: ( ( (lv_rufname_26_0= RULE_STRING ) )? | otherlv_27= 'unbekannt' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING||LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==20) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalAhnen.g:451:4: ( (lv_rufname_26_0= RULE_STRING ) )?
                    {
                    // InternalAhnen.g:451:4: ( (lv_rufname_26_0= RULE_STRING ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_STRING) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalAhnen.g:452:5: (lv_rufname_26_0= RULE_STRING )
                            {
                            // InternalAhnen.g:452:5: (lv_rufname_26_0= RULE_STRING )
                            // InternalAhnen.g:453:6: lv_rufname_26_0= RULE_STRING
                            {
                            lv_rufname_26_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                            						newLeafNode(lv_rufname_26_0, grammarAccess.getPersonAccess().getRufnameSTRINGTerminalRuleCall_21_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPersonRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"rufname",
                            							lv_rufname_26_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:470:4: otherlv_27= 'unbekannt'
                    {
                    otherlv_27=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_27, grammarAccess.getPersonAccess().getUnbekanntKeyword_21_1());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_28, grammarAccess.getPersonAccess().getFullStopKeyword_22());
            		
            otherlv_29=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_29, grammarAccess.getPersonAccess().getGeschlechtKeyword_23());
            		
            // InternalAhnen.g:483:3: ( (lv_geschlecht_30_0= ruleGeschlecht ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20||(LA13_0>=73 && LA13_0<=74)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAhnen.g:484:4: (lv_geschlecht_30_0= ruleGeschlecht )
                    {
                    // InternalAhnen.g:484:4: (lv_geschlecht_30_0= ruleGeschlecht )
                    // InternalAhnen.g:485:5: lv_geschlecht_30_0= ruleGeschlecht
                    {

                    					newCompositeNode(grammarAccess.getPersonAccess().getGeschlechtGeschlechtEnumRuleCall_24_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_geschlecht_30_0=ruleGeschlecht();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPersonRule());
                    					}
                    					set(
                    						current,
                    						"geschlecht",
                    						lv_geschlecht_30_0,
                    						"com.github.funthomas424242.dsl.Ahnen.Geschlecht");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_31=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_31, grammarAccess.getPersonAccess().getFullStopKeyword_25());
            		
            otherlv_32=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_32, grammarAccess.getPersonAccess().getGeburtsdatumKeyword_26());
            		
            // InternalAhnen.g:510:3: ( ( (lv_geburtsDatum_33_0= ruleDATUM ) )? | otherlv_34= 'unbekannt' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DATE||LA15_0==18) ) {
                alt15=1;
            }
            else if ( (LA15_0==20) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAhnen.g:511:4: ( (lv_geburtsDatum_33_0= ruleDATUM ) )?
                    {
                    // InternalAhnen.g:511:4: ( (lv_geburtsDatum_33_0= ruleDATUM ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_DATE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalAhnen.g:512:5: (lv_geburtsDatum_33_0= ruleDATUM )
                            {
                            // InternalAhnen.g:512:5: (lv_geburtsDatum_33_0= ruleDATUM )
                            // InternalAhnen.g:513:6: lv_geburtsDatum_33_0= ruleDATUM
                            {

                            						newCompositeNode(grammarAccess.getPersonAccess().getGeburtsDatumDATUMParserRuleCall_27_0_0());
                            					
                            pushFollow(FOLLOW_12);
                            lv_geburtsDatum_33_0=ruleDATUM();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPersonRule());
                            						}
                            						set(
                            							current,
                            							"geburtsDatum",
                            							lv_geburtsDatum_33_0,
                            							"com.github.funthomas424242.dsl.Ahnen.DATUM");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:531:4: otherlv_34= 'unbekannt'
                    {
                    otherlv_34=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_34, grammarAccess.getPersonAccess().getUnbekanntKeyword_27_1());
                    			

                    }
                    break;

            }

            otherlv_35=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_35, grammarAccess.getPersonAccess().getFullStopKeyword_28());
            		
            otherlv_36=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_36, grammarAccess.getPersonAccess().getTodesdatumKeyword_29());
            		
            // InternalAhnen.g:544:3: ( ( (lv_todesDatum_37_0= ruleDATUM ) )? | otherlv_38= 'unbekannt' | otherlv_39= 'lebend' | otherlv_40= 'vermisst' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case RULE_DATE:
            case 18:
                {
                alt17=1;
                }
                break;
            case 20:
                {
                alt17=2;
                }
                break;
            case 29:
                {
                alt17=3;
                }
                break;
            case 30:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalAhnen.g:545:4: ( (lv_todesDatum_37_0= ruleDATUM ) )?
                    {
                    // InternalAhnen.g:545:4: ( (lv_todesDatum_37_0= ruleDATUM ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_DATE) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalAhnen.g:546:5: (lv_todesDatum_37_0= ruleDATUM )
                            {
                            // InternalAhnen.g:546:5: (lv_todesDatum_37_0= ruleDATUM )
                            // InternalAhnen.g:547:6: lv_todesDatum_37_0= ruleDATUM
                            {

                            						newCompositeNode(grammarAccess.getPersonAccess().getTodesDatumDATUMParserRuleCall_30_0_0());
                            					
                            pushFollow(FOLLOW_12);
                            lv_todesDatum_37_0=ruleDATUM();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPersonRule());
                            						}
                            						set(
                            							current,
                            							"todesDatum",
                            							lv_todesDatum_37_0,
                            							"com.github.funthomas424242.dsl.Ahnen.DATUM");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:565:4: otherlv_38= 'unbekannt'
                    {
                    otherlv_38=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_38, grammarAccess.getPersonAccess().getUnbekanntKeyword_30_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalAhnen.g:570:4: otherlv_39= 'lebend'
                    {
                    otherlv_39=(Token)match(input,29,FOLLOW_12); 

                    				newLeafNode(otherlv_39, grammarAccess.getPersonAccess().getLebendKeyword_30_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalAhnen.g:575:4: otherlv_40= 'vermisst'
                    {
                    otherlv_40=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_40, grammarAccess.getPersonAccess().getVermisstKeyword_30_3());
                    			

                    }
                    break;

            }

            otherlv_41=(Token)match(input,18,FOLLOW_26); 

            			newLeafNode(otherlv_41, grammarAccess.getPersonAccess().getFullStopKeyword_31());
            		
            otherlv_42=(Token)match(input,31,FOLLOW_27); 

            			newLeafNode(otherlv_42, grammarAccess.getPersonAccess().getVaterKeyword_32());
            		
            // InternalAhnen.g:588:3: ( ( (otherlv_43= RULE_STRING ) )? | otherlv_44= 'unbekannt' | otherlv_45= 'unerfasst' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 18:
                {
                alt19=1;
                }
                break;
            case 20:
                {
                alt19=2;
                }
                break;
            case 32:
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
                    // InternalAhnen.g:589:4: ( (otherlv_43= RULE_STRING ) )?
                    {
                    // InternalAhnen.g:589:4: ( (otherlv_43= RULE_STRING ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_STRING) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalAhnen.g:590:5: (otherlv_43= RULE_STRING )
                            {
                            // InternalAhnen.g:590:5: (otherlv_43= RULE_STRING )
                            // InternalAhnen.g:591:6: otherlv_43= RULE_STRING
                            {

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPersonRule());
                            						}
                            					
                            otherlv_43=(Token)match(input,RULE_STRING,FOLLOW_12); 

                            						newLeafNode(otherlv_43, grammarAccess.getPersonAccess().getVaterPersonCrossReference_33_0_0());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:603:4: otherlv_44= 'unbekannt'
                    {
                    otherlv_44=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_44, grammarAccess.getPersonAccess().getUnbekanntKeyword_33_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalAhnen.g:608:4: otherlv_45= 'unerfasst'
                    {
                    otherlv_45=(Token)match(input,32,FOLLOW_12); 

                    				newLeafNode(otherlv_45, grammarAccess.getPersonAccess().getUnerfasstKeyword_33_2());
                    			

                    }
                    break;

            }

            otherlv_46=(Token)match(input,18,FOLLOW_28); 

            			newLeafNode(otherlv_46, grammarAccess.getPersonAccess().getFullStopKeyword_34());
            		
            otherlv_47=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_47, grammarAccess.getPersonAccess().getMutterKeyword_35());
            		
            // InternalAhnen.g:621:3: ( ( (otherlv_48= RULE_STRING ) )? | otherlv_49= 'unbekannt' | otherlv_50= 'unerfasst' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 18:
                {
                alt21=1;
                }
                break;
            case 20:
                {
                alt21=2;
                }
                break;
            case 32:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalAhnen.g:622:4: ( (otherlv_48= RULE_STRING ) )?
                    {
                    // InternalAhnen.g:622:4: ( (otherlv_48= RULE_STRING ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_STRING) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalAhnen.g:623:5: (otherlv_48= RULE_STRING )
                            {
                            // InternalAhnen.g:623:5: (otherlv_48= RULE_STRING )
                            // InternalAhnen.g:624:6: otherlv_48= RULE_STRING
                            {

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPersonRule());
                            						}
                            					
                            otherlv_48=(Token)match(input,RULE_STRING,FOLLOW_12); 

                            						newLeafNode(otherlv_48, grammarAccess.getPersonAccess().getMutterPersonCrossReference_36_0_0());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:636:4: otherlv_49= 'unbekannt'
                    {
                    otherlv_49=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_49, grammarAccess.getPersonAccess().getUnbekanntKeyword_36_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalAhnen.g:641:4: otherlv_50= 'unerfasst'
                    {
                    otherlv_50=(Token)match(input,32,FOLLOW_12); 

                    				newLeafNode(otherlv_50, grammarAccess.getPersonAccess().getUnerfasstKeyword_36_2());
                    			

                    }
                    break;

            }

            otherlv_51=(Token)match(input,18,FOLLOW_29); 

            			newLeafNode(otherlv_51, grammarAccess.getPersonAccess().getFullStopKeyword_37());
            		
            otherlv_52=(Token)match(input,34,FOLLOW_30); 

            			newLeafNode(otherlv_52, grammarAccess.getPersonAccess().getKinderKeyword_38());
            		
            // InternalAhnen.g:654:3: ( ( (lv_kinder_53_0= ruleKinder ) )? | otherlv_54= 'keine' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING||LA23_0==18||LA23_0==20||LA23_0==32) ) {
                alt23=1;
            }
            else if ( (LA23_0==35) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalAhnen.g:655:4: ( (lv_kinder_53_0= ruleKinder ) )?
                    {
                    // InternalAhnen.g:655:4: ( (lv_kinder_53_0= ruleKinder ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_STRING||LA22_0==20||LA22_0==32) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalAhnen.g:656:5: (lv_kinder_53_0= ruleKinder )
                            {
                            // InternalAhnen.g:656:5: (lv_kinder_53_0= ruleKinder )
                            // InternalAhnen.g:657:6: lv_kinder_53_0= ruleKinder
                            {

                            						newCompositeNode(grammarAccess.getPersonAccess().getKinderKinderParserRuleCall_39_0_0());
                            					
                            pushFollow(FOLLOW_12);
                            lv_kinder_53_0=ruleKinder();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPersonRule());
                            						}
                            						set(
                            							current,
                            							"kinder",
                            							lv_kinder_53_0,
                            							"com.github.funthomas424242.dsl.Ahnen.Kinder");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:675:4: otherlv_54= 'keine'
                    {
                    otherlv_54=(Token)match(input,35,FOLLOW_12); 

                    				newLeafNode(otherlv_54, grammarAccess.getPersonAccess().getKeineKeyword_39_1());
                    			

                    }
                    break;

            }

            otherlv_55=(Token)match(input,18,FOLLOW_31); 

            			newLeafNode(otherlv_55, grammarAccess.getPersonAccess().getFullStopKeyword_40());
            		
            otherlv_56=(Token)match(input,36,FOLLOW_30); 

            			newLeafNode(otherlv_56, grammarAccess.getPersonAccess().getStiefkinderKeyword_41());
            		
            // InternalAhnen.g:688:3: ( ( (lv_stiefkinder_57_0= ruleKinder ) )? | otherlv_58= 'keine' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING||LA25_0==18||LA25_0==20||LA25_0==32) ) {
                alt25=1;
            }
            else if ( (LA25_0==35) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalAhnen.g:689:4: ( (lv_stiefkinder_57_0= ruleKinder ) )?
                    {
                    // InternalAhnen.g:689:4: ( (lv_stiefkinder_57_0= ruleKinder ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_STRING||LA24_0==20||LA24_0==32) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalAhnen.g:690:5: (lv_stiefkinder_57_0= ruleKinder )
                            {
                            // InternalAhnen.g:690:5: (lv_stiefkinder_57_0= ruleKinder )
                            // InternalAhnen.g:691:6: lv_stiefkinder_57_0= ruleKinder
                            {

                            						newCompositeNode(grammarAccess.getPersonAccess().getStiefkinderKinderParserRuleCall_42_0_0());
                            					
                            pushFollow(FOLLOW_12);
                            lv_stiefkinder_57_0=ruleKinder();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPersonRule());
                            						}
                            						set(
                            							current,
                            							"stiefkinder",
                            							lv_stiefkinder_57_0,
                            							"com.github.funthomas424242.dsl.Ahnen.Kinder");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:709:4: otherlv_58= 'keine'
                    {
                    otherlv_58=(Token)match(input,35,FOLLOW_12); 

                    				newLeafNode(otherlv_58, grammarAccess.getPersonAccess().getKeineKeyword_42_1());
                    			

                    }
                    break;

            }

            otherlv_59=(Token)match(input,18,FOLLOW_32); 

            			newLeafNode(otherlv_59, grammarAccess.getPersonAccess().getFullStopKeyword_43());
            		
            otherlv_60=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_60, grammarAccess.getPersonAccess().getBeziehungenKeyword_44());
            		
            otherlv_61=(Token)match(input,15,FOLLOW_33); 

            			newLeafNode(otherlv_61, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_45());
            		
            // InternalAhnen.g:726:3: ( ( (lv_beziehungen_62_0= ruleBeziehung ) )+ | otherlv_63= 'keine' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==52) ) {
                alt27=1;
            }
            else if ( (LA27_0==35) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalAhnen.g:727:4: ( (lv_beziehungen_62_0= ruleBeziehung ) )+
                    {
                    // InternalAhnen.g:727:4: ( (lv_beziehungen_62_0= ruleBeziehung ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==52) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalAhnen.g:728:5: (lv_beziehungen_62_0= ruleBeziehung )
                    	    {
                    	    // InternalAhnen.g:728:5: (lv_beziehungen_62_0= ruleBeziehung )
                    	    // InternalAhnen.g:729:6: lv_beziehungen_62_0= ruleBeziehung
                    	    {

                    	    						newCompositeNode(grammarAccess.getPersonAccess().getBeziehungenBeziehungParserRuleCall_46_0_0());
                    	    					
                    	    pushFollow(FOLLOW_34);
                    	    lv_beziehungen_62_0=ruleBeziehung();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"beziehungen",
                    	    							lv_beziehungen_62_0,
                    	    							"com.github.funthomas424242.dsl.Ahnen.Beziehung");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:747:4: otherlv_63= 'keine'
                    {
                    otherlv_63=(Token)match(input,35,FOLLOW_35); 

                    				newLeafNode(otherlv_63, grammarAccess.getPersonAccess().getKeineKeyword_46_1());
                    			

                    }
                    break;

            }

            otherlv_64=(Token)match(input,38,FOLLOW_36); 

            			newLeafNode(otherlv_64, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_47());
            		
            otherlv_65=(Token)match(input,39,FOLLOW_8); 

            			newLeafNode(otherlv_65, grammarAccess.getPersonAccess().getEreignisseKeyword_48());
            		
            otherlv_66=(Token)match(input,15,FOLLOW_37); 

            			newLeafNode(otherlv_66, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_49());
            		
            // InternalAhnen.g:764:3: ( ( (lv_ereignisse_67_0= ruleEreignis ) )+ | (otherlv_68= 'keine' otherlv_69= 'bekannt' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41||LA29_0==47) ) {
                alt29=1;
            }
            else if ( (LA29_0==35) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalAhnen.g:765:4: ( (lv_ereignisse_67_0= ruleEreignis ) )+
                    {
                    // InternalAhnen.g:765:4: ( (lv_ereignisse_67_0= ruleEreignis ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==41||LA28_0==47) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalAhnen.g:766:5: (lv_ereignisse_67_0= ruleEreignis )
                    	    {
                    	    // InternalAhnen.g:766:5: (lv_ereignisse_67_0= ruleEreignis )
                    	    // InternalAhnen.g:767:6: lv_ereignisse_67_0= ruleEreignis
                    	    {

                    	    						newCompositeNode(grammarAccess.getPersonAccess().getEreignisseEreignisParserRuleCall_50_0_0());
                    	    					
                    	    pushFollow(FOLLOW_38);
                    	    lv_ereignisse_67_0=ruleEreignis();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ereignisse",
                    	    							lv_ereignisse_67_0,
                    	    							"com.github.funthomas424242.dsl.Ahnen.Ereignis");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:785:4: (otherlv_68= 'keine' otherlv_69= 'bekannt' )
                    {
                    // InternalAhnen.g:785:4: (otherlv_68= 'keine' otherlv_69= 'bekannt' )
                    // InternalAhnen.g:786:5: otherlv_68= 'keine' otherlv_69= 'bekannt'
                    {
                    otherlv_68=(Token)match(input,35,FOLLOW_39); 

                    					newLeafNode(otherlv_68, grammarAccess.getPersonAccess().getKeineKeyword_50_1_0());
                    				
                    otherlv_69=(Token)match(input,40,FOLLOW_35); 

                    					newLeafNode(otherlv_69, grammarAccess.getPersonAccess().getBekanntKeyword_50_1_1());
                    				

                    }


                    }
                    break;

            }

            otherlv_70=(Token)match(input,38,FOLLOW_35); 

            			newLeafNode(otherlv_70, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_51());
            		
            otherlv_71=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_71, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_52());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleEreignis"
    // InternalAhnen.g:808:1: entryRuleEreignis returns [EObject current=null] : iv_ruleEreignis= ruleEreignis EOF ;
    public final EObject entryRuleEreignis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEreignis = null;


        try {
            // InternalAhnen.g:808:49: (iv_ruleEreignis= ruleEreignis EOF )
            // InternalAhnen.g:809:2: iv_ruleEreignis= ruleEreignis EOF
            {
             newCompositeNode(grammarAccess.getEreignisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEreignis=ruleEreignis();

            state._fsp--;

             current =iv_ruleEreignis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEreignis"


    // $ANTLR start "ruleEreignis"
    // InternalAhnen.g:815:1: ruleEreignis returns [EObject current=null] : (this_Schulausbildung_0= ruleSchulausbildung | this_Taetigkeit_1= ruleTaetigkeit ) ;
    public final EObject ruleEreignis() throws RecognitionException {
        EObject current = null;

        EObject this_Schulausbildung_0 = null;

        EObject this_Taetigkeit_1 = null;



        	enterRule();

        try {
            // InternalAhnen.g:821:2: ( (this_Schulausbildung_0= ruleSchulausbildung | this_Taetigkeit_1= ruleTaetigkeit ) )
            // InternalAhnen.g:822:2: (this_Schulausbildung_0= ruleSchulausbildung | this_Taetigkeit_1= ruleTaetigkeit )
            {
            // InternalAhnen.g:822:2: (this_Schulausbildung_0= ruleSchulausbildung | this_Taetigkeit_1= ruleTaetigkeit )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            else if ( (LA30_0==47) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalAhnen.g:823:3: this_Schulausbildung_0= ruleSchulausbildung
                    {

                    			newCompositeNode(grammarAccess.getEreignisAccess().getSchulausbildungParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Schulausbildung_0=ruleSchulausbildung();

                    state._fsp--;


                    			current = this_Schulausbildung_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAhnen.g:832:3: this_Taetigkeit_1= ruleTaetigkeit
                    {

                    			newCompositeNode(grammarAccess.getEreignisAccess().getTaetigkeitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Taetigkeit_1=ruleTaetigkeit();

                    state._fsp--;


                    			current = this_Taetigkeit_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEreignis"


    // $ANTLR start "entryRuleSchulausbildung"
    // InternalAhnen.g:844:1: entryRuleSchulausbildung returns [EObject current=null] : iv_ruleSchulausbildung= ruleSchulausbildung EOF ;
    public final EObject entryRuleSchulausbildung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchulausbildung = null;


        try {
            // InternalAhnen.g:844:56: (iv_ruleSchulausbildung= ruleSchulausbildung EOF )
            // InternalAhnen.g:845:2: iv_ruleSchulausbildung= ruleSchulausbildung EOF
            {
             newCompositeNode(grammarAccess.getSchulausbildungRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchulausbildung=ruleSchulausbildung();

            state._fsp--;

             current =iv_ruleSchulausbildung; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchulausbildung"


    // $ANTLR start "ruleSchulausbildung"
    // InternalAhnen.g:851:1: ruleSchulausbildung returns [EObject current=null] : ( () otherlv_1= 'Schulausbildung:' otherlv_2= 'von' ( ( (lv_von_3_0= ruleDATUM ) )? | otherlv_4= 'unbekannt' ) otherlv_5= 'bis' ( ( (lv_bis_6_0= ruleDATUM ) )? | otherlv_7= 'unbekannt' ) otherlv_8= 'Abschluss:' ( ( (lv_abschluss_9_0= RULE_STRING ) )? | otherlv_10= 'ohne' | otherlv_11= 'abgebrochen' ) otherlv_12= '.' ) ;
    public final EObject ruleSchulausbildung() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_abschluss_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_von_3_0 = null;

        AntlrDatatypeRuleToken lv_bis_6_0 = null;



        	enterRule();

        try {
            // InternalAhnen.g:857:2: ( ( () otherlv_1= 'Schulausbildung:' otherlv_2= 'von' ( ( (lv_von_3_0= ruleDATUM ) )? | otherlv_4= 'unbekannt' ) otherlv_5= 'bis' ( ( (lv_bis_6_0= ruleDATUM ) )? | otherlv_7= 'unbekannt' ) otherlv_8= 'Abschluss:' ( ( (lv_abschluss_9_0= RULE_STRING ) )? | otherlv_10= 'ohne' | otherlv_11= 'abgebrochen' ) otherlv_12= '.' ) )
            // InternalAhnen.g:858:2: ( () otherlv_1= 'Schulausbildung:' otherlv_2= 'von' ( ( (lv_von_3_0= ruleDATUM ) )? | otherlv_4= 'unbekannt' ) otherlv_5= 'bis' ( ( (lv_bis_6_0= ruleDATUM ) )? | otherlv_7= 'unbekannt' ) otherlv_8= 'Abschluss:' ( ( (lv_abschluss_9_0= RULE_STRING ) )? | otherlv_10= 'ohne' | otherlv_11= 'abgebrochen' ) otherlv_12= '.' )
            {
            // InternalAhnen.g:858:2: ( () otherlv_1= 'Schulausbildung:' otherlv_2= 'von' ( ( (lv_von_3_0= ruleDATUM ) )? | otherlv_4= 'unbekannt' ) otherlv_5= 'bis' ( ( (lv_bis_6_0= ruleDATUM ) )? | otherlv_7= 'unbekannt' ) otherlv_8= 'Abschluss:' ( ( (lv_abschluss_9_0= RULE_STRING ) )? | otherlv_10= 'ohne' | otherlv_11= 'abgebrochen' ) otherlv_12= '.' )
            // InternalAhnen.g:859:3: () otherlv_1= 'Schulausbildung:' otherlv_2= 'von' ( ( (lv_von_3_0= ruleDATUM ) )? | otherlv_4= 'unbekannt' ) otherlv_5= 'bis' ( ( (lv_bis_6_0= ruleDATUM ) )? | otherlv_7= 'unbekannt' ) otherlv_8= 'Abschluss:' ( ( (lv_abschluss_9_0= RULE_STRING ) )? | otherlv_10= 'ohne' | otherlv_11= 'abgebrochen' ) otherlv_12= '.'
            {
            // InternalAhnen.g:859:3: ()
            // InternalAhnen.g:860:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSchulausbildungAccess().getSchulausbildungAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getSchulausbildungAccess().getSchulausbildungKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getSchulausbildungAccess().getVonKeyword_2());
            		
            // InternalAhnen.g:874:3: ( ( (lv_von_3_0= ruleDATUM ) )? | otherlv_4= 'unbekannt' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_DATE||LA32_0==43) ) {
                alt32=1;
            }
            else if ( (LA32_0==20) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalAhnen.g:875:4: ( (lv_von_3_0= ruleDATUM ) )?
                    {
                    // InternalAhnen.g:875:4: ( (lv_von_3_0= ruleDATUM ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_DATE) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalAhnen.g:876:5: (lv_von_3_0= ruleDATUM )
                            {
                            // InternalAhnen.g:876:5: (lv_von_3_0= ruleDATUM )
                            // InternalAhnen.g:877:6: lv_von_3_0= ruleDATUM
                            {

                            						newCompositeNode(grammarAccess.getSchulausbildungAccess().getVonDATUMParserRuleCall_3_0_0());
                            					
                            pushFollow(FOLLOW_42);
                            lv_von_3_0=ruleDATUM();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSchulausbildungRule());
                            						}
                            						set(
                            							current,
                            							"von",
                            							lv_von_3_0,
                            							"com.github.funthomas424242.dsl.Ahnen.DATUM");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:895:4: otherlv_4= 'unbekannt'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_42); 

                    				newLeafNode(otherlv_4, grammarAccess.getSchulausbildungAccess().getUnbekanntKeyword_3_1());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,43,FOLLOW_43); 

            			newLeafNode(otherlv_5, grammarAccess.getSchulausbildungAccess().getBisKeyword_4());
            		
            // InternalAhnen.g:904:3: ( ( (lv_bis_6_0= ruleDATUM ) )? | otherlv_7= 'unbekannt' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_DATE||LA34_0==44) ) {
                alt34=1;
            }
            else if ( (LA34_0==20) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalAhnen.g:905:4: ( (lv_bis_6_0= ruleDATUM ) )?
                    {
                    // InternalAhnen.g:905:4: ( (lv_bis_6_0= ruleDATUM ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_DATE) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalAhnen.g:906:5: (lv_bis_6_0= ruleDATUM )
                            {
                            // InternalAhnen.g:906:5: (lv_bis_6_0= ruleDATUM )
                            // InternalAhnen.g:907:6: lv_bis_6_0= ruleDATUM
                            {

                            						newCompositeNode(grammarAccess.getSchulausbildungAccess().getBisDATUMParserRuleCall_5_0_0());
                            					
                            pushFollow(FOLLOW_44);
                            lv_bis_6_0=ruleDATUM();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSchulausbildungRule());
                            						}
                            						set(
                            							current,
                            							"bis",
                            							lv_bis_6_0,
                            							"com.github.funthomas424242.dsl.Ahnen.DATUM");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:925:4: otherlv_7= 'unbekannt'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_44); 

                    				newLeafNode(otherlv_7, grammarAccess.getSchulausbildungAccess().getUnbekanntKeyword_5_1());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,44,FOLLOW_45); 

            			newLeafNode(otherlv_8, grammarAccess.getSchulausbildungAccess().getAbschlussKeyword_6());
            		
            // InternalAhnen.g:934:3: ( ( (lv_abschluss_9_0= RULE_STRING ) )? | otherlv_10= 'ohne' | otherlv_11= 'abgebrochen' )
            int alt36=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 18:
                {
                alt36=1;
                }
                break;
            case 45:
                {
                alt36=2;
                }
                break;
            case 46:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalAhnen.g:935:4: ( (lv_abschluss_9_0= RULE_STRING ) )?
                    {
                    // InternalAhnen.g:935:4: ( (lv_abschluss_9_0= RULE_STRING ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_STRING) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalAhnen.g:936:5: (lv_abschluss_9_0= RULE_STRING )
                            {
                            // InternalAhnen.g:936:5: (lv_abschluss_9_0= RULE_STRING )
                            // InternalAhnen.g:937:6: lv_abschluss_9_0= RULE_STRING
                            {
                            lv_abschluss_9_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                            						newLeafNode(lv_abschluss_9_0, grammarAccess.getSchulausbildungAccess().getAbschlussSTRINGTerminalRuleCall_7_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSchulausbildungRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"abschluss",
                            							lv_abschluss_9_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:954:4: otherlv_10= 'ohne'
                    {
                    otherlv_10=(Token)match(input,45,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getSchulausbildungAccess().getOhneKeyword_7_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalAhnen.g:959:4: otherlv_11= 'abgebrochen'
                    {
                    otherlv_11=(Token)match(input,46,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getSchulausbildungAccess().getAbgebrochenKeyword_7_2());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getSchulausbildungAccess().getFullStopKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchulausbildung"


    // $ANTLR start "entryRuleTaetigkeit"
    // InternalAhnen.g:972:1: entryRuleTaetigkeit returns [EObject current=null] : iv_ruleTaetigkeit= ruleTaetigkeit EOF ;
    public final EObject entryRuleTaetigkeit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaetigkeit = null;


        try {
            // InternalAhnen.g:972:51: (iv_ruleTaetigkeit= ruleTaetigkeit EOF )
            // InternalAhnen.g:973:2: iv_ruleTaetigkeit= ruleTaetigkeit EOF
            {
             newCompositeNode(grammarAccess.getTaetigkeitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaetigkeit=ruleTaetigkeit();

            state._fsp--;

             current =iv_ruleTaetigkeit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaetigkeit"


    // $ANTLR start "ruleTaetigkeit"
    // InternalAhnen.g:979:1: ruleTaetigkeit returns [EObject current=null] : ( () otherlv_1= 'T\\u00E4tigkeit:' otherlv_2= 'als' ( ( (lv_beruf_3_0= RULE_STRING ) )? | otherlv_4= 'unbekannt' ) otherlv_5= 'bei' ( ( (lv_arbeitgeber_6_0= RULE_STRING ) )? | otherlv_7= 'unbekannt' ) otherlv_8= 'in' ( ( (lv_ort_9_0= RULE_STRING ) )? | otherlv_10= 'unbekannt' ) otherlv_11= 'von' ( ( (lv_von_12_0= ruleDATUM ) )? | otherlv_13= 'unbekannt' ) otherlv_14= 'bis' ( ( (lv_bis_15_0= ruleDATUM ) )? | otherlv_16= 'unbekannt' ) otherlv_17= '.' ) ;
    public final EObject ruleTaetigkeit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_beruf_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_arbeitgeber_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_ort_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_von_12_0 = null;

        AntlrDatatypeRuleToken lv_bis_15_0 = null;



        	enterRule();

        try {
            // InternalAhnen.g:985:2: ( ( () otherlv_1= 'T\\u00E4tigkeit:' otherlv_2= 'als' ( ( (lv_beruf_3_0= RULE_STRING ) )? | otherlv_4= 'unbekannt' ) otherlv_5= 'bei' ( ( (lv_arbeitgeber_6_0= RULE_STRING ) )? | otherlv_7= 'unbekannt' ) otherlv_8= 'in' ( ( (lv_ort_9_0= RULE_STRING ) )? | otherlv_10= 'unbekannt' ) otherlv_11= 'von' ( ( (lv_von_12_0= ruleDATUM ) )? | otherlv_13= 'unbekannt' ) otherlv_14= 'bis' ( ( (lv_bis_15_0= ruleDATUM ) )? | otherlv_16= 'unbekannt' ) otherlv_17= '.' ) )
            // InternalAhnen.g:986:2: ( () otherlv_1= 'T\\u00E4tigkeit:' otherlv_2= 'als' ( ( (lv_beruf_3_0= RULE_STRING ) )? | otherlv_4= 'unbekannt' ) otherlv_5= 'bei' ( ( (lv_arbeitgeber_6_0= RULE_STRING ) )? | otherlv_7= 'unbekannt' ) otherlv_8= 'in' ( ( (lv_ort_9_0= RULE_STRING ) )? | otherlv_10= 'unbekannt' ) otherlv_11= 'von' ( ( (lv_von_12_0= ruleDATUM ) )? | otherlv_13= 'unbekannt' ) otherlv_14= 'bis' ( ( (lv_bis_15_0= ruleDATUM ) )? | otherlv_16= 'unbekannt' ) otherlv_17= '.' )
            {
            // InternalAhnen.g:986:2: ( () otherlv_1= 'T\\u00E4tigkeit:' otherlv_2= 'als' ( ( (lv_beruf_3_0= RULE_STRING ) )? | otherlv_4= 'unbekannt' ) otherlv_5= 'bei' ( ( (lv_arbeitgeber_6_0= RULE_STRING ) )? | otherlv_7= 'unbekannt' ) otherlv_8= 'in' ( ( (lv_ort_9_0= RULE_STRING ) )? | otherlv_10= 'unbekannt' ) otherlv_11= 'von' ( ( (lv_von_12_0= ruleDATUM ) )? | otherlv_13= 'unbekannt' ) otherlv_14= 'bis' ( ( (lv_bis_15_0= ruleDATUM ) )? | otherlv_16= 'unbekannt' ) otherlv_17= '.' )
            // InternalAhnen.g:987:3: () otherlv_1= 'T\\u00E4tigkeit:' otherlv_2= 'als' ( ( (lv_beruf_3_0= RULE_STRING ) )? | otherlv_4= 'unbekannt' ) otherlv_5= 'bei' ( ( (lv_arbeitgeber_6_0= RULE_STRING ) )? | otherlv_7= 'unbekannt' ) otherlv_8= 'in' ( ( (lv_ort_9_0= RULE_STRING ) )? | otherlv_10= 'unbekannt' ) otherlv_11= 'von' ( ( (lv_von_12_0= ruleDATUM ) )? | otherlv_13= 'unbekannt' ) otherlv_14= 'bis' ( ( (lv_bis_15_0= ruleDATUM ) )? | otherlv_16= 'unbekannt' ) otherlv_17= '.'
            {
            // InternalAhnen.g:987:3: ()
            // InternalAhnen.g:988:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaetigkeitAccess().getTaetigkeitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getTaetigkeitAccess().getTätigkeitKeyword_1());
            		
            otherlv_2=(Token)match(input,48,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getTaetigkeitAccess().getAlsKeyword_2());
            		
            // InternalAhnen.g:1002:3: ( ( (lv_beruf_3_0= RULE_STRING ) )? | otherlv_4= 'unbekannt' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING||LA38_0==49) ) {
                alt38=1;
            }
            else if ( (LA38_0==20) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalAhnen.g:1003:4: ( (lv_beruf_3_0= RULE_STRING ) )?
                    {
                    // InternalAhnen.g:1003:4: ( (lv_beruf_3_0= RULE_STRING ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_STRING) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalAhnen.g:1004:5: (lv_beruf_3_0= RULE_STRING )
                            {
                            // InternalAhnen.g:1004:5: (lv_beruf_3_0= RULE_STRING )
                            // InternalAhnen.g:1005:6: lv_beruf_3_0= RULE_STRING
                            {
                            lv_beruf_3_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

                            						newLeafNode(lv_beruf_3_0, grammarAccess.getTaetigkeitAccess().getBerufSTRINGTerminalRuleCall_3_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTaetigkeitRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"beruf",
                            							lv_beruf_3_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:1022:4: otherlv_4= 'unbekannt'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_48); 

                    				newLeafNode(otherlv_4, grammarAccess.getTaetigkeitAccess().getUnbekanntKeyword_3_1());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,49,FOLLOW_49); 

            			newLeafNode(otherlv_5, grammarAccess.getTaetigkeitAccess().getBeiKeyword_4());
            		
            // InternalAhnen.g:1031:3: ( ( (lv_arbeitgeber_6_0= RULE_STRING ) )? | otherlv_7= 'unbekannt' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING||LA40_0==50) ) {
                alt40=1;
            }
            else if ( (LA40_0==20) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalAhnen.g:1032:4: ( (lv_arbeitgeber_6_0= RULE_STRING ) )?
                    {
                    // InternalAhnen.g:1032:4: ( (lv_arbeitgeber_6_0= RULE_STRING ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_STRING) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalAhnen.g:1033:5: (lv_arbeitgeber_6_0= RULE_STRING )
                            {
                            // InternalAhnen.g:1033:5: (lv_arbeitgeber_6_0= RULE_STRING )
                            // InternalAhnen.g:1034:6: lv_arbeitgeber_6_0= RULE_STRING
                            {
                            lv_arbeitgeber_6_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                            						newLeafNode(lv_arbeitgeber_6_0, grammarAccess.getTaetigkeitAccess().getArbeitgeberSTRINGTerminalRuleCall_5_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTaetigkeitRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"arbeitgeber",
                            							lv_arbeitgeber_6_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:1051:4: otherlv_7= 'unbekannt'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_50); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaetigkeitAccess().getUnbekanntKeyword_5_1());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,50,FOLLOW_51); 

            			newLeafNode(otherlv_8, grammarAccess.getTaetigkeitAccess().getInKeyword_6());
            		
            // InternalAhnen.g:1060:3: ( ( (lv_ort_9_0= RULE_STRING ) )? | otherlv_10= 'unbekannt' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING||LA42_0==42) ) {
                alt42=1;
            }
            else if ( (LA42_0==20) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalAhnen.g:1061:4: ( (lv_ort_9_0= RULE_STRING ) )?
                    {
                    // InternalAhnen.g:1061:4: ( (lv_ort_9_0= RULE_STRING ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_STRING) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalAhnen.g:1062:5: (lv_ort_9_0= RULE_STRING )
                            {
                            // InternalAhnen.g:1062:5: (lv_ort_9_0= RULE_STRING )
                            // InternalAhnen.g:1063:6: lv_ort_9_0= RULE_STRING
                            {
                            lv_ort_9_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                            						newLeafNode(lv_ort_9_0, grammarAccess.getTaetigkeitAccess().getOrtSTRINGTerminalRuleCall_7_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTaetigkeitRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"ort",
                            							lv_ort_9_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:1080:4: otherlv_10= 'unbekannt'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_40); 

                    				newLeafNode(otherlv_10, grammarAccess.getTaetigkeitAccess().getUnbekanntKeyword_7_1());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,42,FOLLOW_41); 

            			newLeafNode(otherlv_11, grammarAccess.getTaetigkeitAccess().getVonKeyword_8());
            		
            // InternalAhnen.g:1089:3: ( ( (lv_von_12_0= ruleDATUM ) )? | otherlv_13= 'unbekannt' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_DATE||LA44_0==43) ) {
                alt44=1;
            }
            else if ( (LA44_0==20) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalAhnen.g:1090:4: ( (lv_von_12_0= ruleDATUM ) )?
                    {
                    // InternalAhnen.g:1090:4: ( (lv_von_12_0= ruleDATUM ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_DATE) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalAhnen.g:1091:5: (lv_von_12_0= ruleDATUM )
                            {
                            // InternalAhnen.g:1091:5: (lv_von_12_0= ruleDATUM )
                            // InternalAhnen.g:1092:6: lv_von_12_0= ruleDATUM
                            {

                            						newCompositeNode(grammarAccess.getTaetigkeitAccess().getVonDATUMParserRuleCall_9_0_0());
                            					
                            pushFollow(FOLLOW_42);
                            lv_von_12_0=ruleDATUM();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getTaetigkeitRule());
                            						}
                            						set(
                            							current,
                            							"von",
                            							lv_von_12_0,
                            							"com.github.funthomas424242.dsl.Ahnen.DATUM");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:1110:4: otherlv_13= 'unbekannt'
                    {
                    otherlv_13=(Token)match(input,20,FOLLOW_42); 

                    				newLeafNode(otherlv_13, grammarAccess.getTaetigkeitAccess().getUnbekanntKeyword_9_1());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,43,FOLLOW_23); 

            			newLeafNode(otherlv_14, grammarAccess.getTaetigkeitAccess().getBisKeyword_10());
            		
            // InternalAhnen.g:1119:3: ( ( (lv_bis_15_0= ruleDATUM ) )? | otherlv_16= 'unbekannt' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_DATE||LA46_0==18) ) {
                alt46=1;
            }
            else if ( (LA46_0==20) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalAhnen.g:1120:4: ( (lv_bis_15_0= ruleDATUM ) )?
                    {
                    // InternalAhnen.g:1120:4: ( (lv_bis_15_0= ruleDATUM ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_DATE) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalAhnen.g:1121:5: (lv_bis_15_0= ruleDATUM )
                            {
                            // InternalAhnen.g:1121:5: (lv_bis_15_0= ruleDATUM )
                            // InternalAhnen.g:1122:6: lv_bis_15_0= ruleDATUM
                            {

                            						newCompositeNode(grammarAccess.getTaetigkeitAccess().getBisDATUMParserRuleCall_11_0_0());
                            					
                            pushFollow(FOLLOW_12);
                            lv_bis_15_0=ruleDATUM();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getTaetigkeitRule());
                            						}
                            						set(
                            							current,
                            							"bis",
                            							lv_bis_15_0,
                            							"com.github.funthomas424242.dsl.Ahnen.DATUM");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:1140:4: otherlv_16= 'unbekannt'
                    {
                    otherlv_16=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getTaetigkeitAccess().getUnbekanntKeyword_11_1());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getTaetigkeitAccess().getFullStopKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaetigkeit"


    // $ANTLR start "entryRuleKinder"
    // InternalAhnen.g:1153:1: entryRuleKinder returns [EObject current=null] : iv_ruleKinder= ruleKinder EOF ;
    public final EObject entryRuleKinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKinder = null;


        try {
            // InternalAhnen.g:1153:47: (iv_ruleKinder= ruleKinder EOF )
            // InternalAhnen.g:1154:2: iv_ruleKinder= ruleKinder EOF
            {
             newCompositeNode(grammarAccess.getKinderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKinder=ruleKinder();

            state._fsp--;

             current =iv_ruleKinder; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKinder"


    // $ANTLR start "ruleKinder"
    // InternalAhnen.g:1160:1: ruleKinder returns [EObject current=null] : ( () ( ( (otherlv_1= RULE_STRING ) ) | otherlv_2= 'unbekannt' | otherlv_3= 'unerfasst' ) (otherlv_4= ',' ( (lv_next_5_0= ruleKinder ) ) )? ) ;
    public final EObject ruleKinder() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_next_5_0 = null;



        	enterRule();

        try {
            // InternalAhnen.g:1166:2: ( ( () ( ( (otherlv_1= RULE_STRING ) ) | otherlv_2= 'unbekannt' | otherlv_3= 'unerfasst' ) (otherlv_4= ',' ( (lv_next_5_0= ruleKinder ) ) )? ) )
            // InternalAhnen.g:1167:2: ( () ( ( (otherlv_1= RULE_STRING ) ) | otherlv_2= 'unbekannt' | otherlv_3= 'unerfasst' ) (otherlv_4= ',' ( (lv_next_5_0= ruleKinder ) ) )? )
            {
            // InternalAhnen.g:1167:2: ( () ( ( (otherlv_1= RULE_STRING ) ) | otherlv_2= 'unbekannt' | otherlv_3= 'unerfasst' ) (otherlv_4= ',' ( (lv_next_5_0= ruleKinder ) ) )? )
            // InternalAhnen.g:1168:3: () ( ( (otherlv_1= RULE_STRING ) ) | otherlv_2= 'unbekannt' | otherlv_3= 'unerfasst' ) (otherlv_4= ',' ( (lv_next_5_0= ruleKinder ) ) )?
            {
            // InternalAhnen.g:1168:3: ()
            // InternalAhnen.g:1169:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKinderAccess().getKinderAction_0(),
            					current);
            			

            }

            // InternalAhnen.g:1175:3: ( ( (otherlv_1= RULE_STRING ) ) | otherlv_2= 'unbekannt' | otherlv_3= 'unerfasst' )
            int alt47=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt47=1;
                }
                break;
            case 20:
                {
                alt47=2;
                }
                break;
            case 32:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalAhnen.g:1176:4: ( (otherlv_1= RULE_STRING ) )
                    {
                    // InternalAhnen.g:1176:4: ( (otherlv_1= RULE_STRING ) )
                    // InternalAhnen.g:1177:5: (otherlv_1= RULE_STRING )
                    {
                    // InternalAhnen.g:1177:5: (otherlv_1= RULE_STRING )
                    // InternalAhnen.g:1178:6: otherlv_1= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKinderRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_52); 

                    						newLeafNode(otherlv_1, grammarAccess.getKinderAccess().getKindPersonCrossReference_1_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:1190:4: otherlv_2= 'unbekannt'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_52); 

                    				newLeafNode(otherlv_2, grammarAccess.getKinderAccess().getUnbekanntKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalAhnen.g:1195:4: otherlv_3= 'unerfasst'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_52); 

                    				newLeafNode(otherlv_3, grammarAccess.getKinderAccess().getUnerfasstKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalAhnen.g:1200:3: (otherlv_4= ',' ( (lv_next_5_0= ruleKinder ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==51) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAhnen.g:1201:4: otherlv_4= ',' ( (lv_next_5_0= ruleKinder ) )
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_53); 

                    				newLeafNode(otherlv_4, grammarAccess.getKinderAccess().getCommaKeyword_2_0());
                    			
                    // InternalAhnen.g:1205:4: ( (lv_next_5_0= ruleKinder ) )
                    // InternalAhnen.g:1206:5: (lv_next_5_0= ruleKinder )
                    {
                    // InternalAhnen.g:1206:5: (lv_next_5_0= ruleKinder )
                    // InternalAhnen.g:1207:6: lv_next_5_0= ruleKinder
                    {

                    						newCompositeNode(grammarAccess.getKinderAccess().getNextKinderParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_next_5_0=ruleKinder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKinderRule());
                    						}
                    						set(
                    							current,
                    							"next",
                    							lv_next_5_0,
                    							"com.github.funthomas424242.dsl.Ahnen.Kinder");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKinder"


    // $ANTLR start "entryRuleBeziehung"
    // InternalAhnen.g:1229:1: entryRuleBeziehung returns [EObject current=null] : iv_ruleBeziehung= ruleBeziehung EOF ;
    public final EObject entryRuleBeziehung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeziehung = null;


        try {
            // InternalAhnen.g:1229:50: (iv_ruleBeziehung= ruleBeziehung EOF )
            // InternalAhnen.g:1230:2: iv_ruleBeziehung= ruleBeziehung EOF
            {
             newCompositeNode(grammarAccess.getBeziehungRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBeziehung=ruleBeziehung();

            state._fsp--;

             current =iv_ruleBeziehung; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBeziehung"


    // $ANTLR start "ruleBeziehung"
    // InternalAhnen.g:1236:1: ruleBeziehung returns [EObject current=null] : ( () otherlv_1= 'Beziehung:' otherlv_2= 'mit' ( ( (otherlv_3= RULE_STRING ) ) | otherlv_4= 'unbekannt' | otherlv_5= 'unerfasst' ) otherlv_6= '.' otherlv_7= 'von:' ( ( (lv_vonDatum_8_0= ruleDATUM ) )? | otherlv_9= 'unbekannt' ) otherlv_10= 'bis:' ( ( (lv_bisDatum_11_0= ruleDATUM ) )? | otherlv_12= 'unbekannt' | otherlv_13= 'andauernd' ) otherlv_14= '.' otherlv_15= 'Hochzeit:' ( ( (lv_hochzeitstag_16_0= ruleDATUM ) )? | otherlv_17= 'unbekannt' | otherlv_18= '-' ) otherlv_19= '.' otherlv_20= 'Scheidung:' ( ( (lv_scheidungstag_21_0= ruleDATUM ) )? | otherlv_22= 'unbekannt' | otherlv_23= 'unabsehbar' | otherlv_24= 'demn\\u00E4chst' | otherlv_25= '-' ) otherlv_26= '.' ) ;
    public final EObject ruleBeziehung() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_vonDatum_8_0 = null;

        AntlrDatatypeRuleToken lv_bisDatum_11_0 = null;

        AntlrDatatypeRuleToken lv_hochzeitstag_16_0 = null;

        AntlrDatatypeRuleToken lv_scheidungstag_21_0 = null;



        	enterRule();

        try {
            // InternalAhnen.g:1242:2: ( ( () otherlv_1= 'Beziehung:' otherlv_2= 'mit' ( ( (otherlv_3= RULE_STRING ) ) | otherlv_4= 'unbekannt' | otherlv_5= 'unerfasst' ) otherlv_6= '.' otherlv_7= 'von:' ( ( (lv_vonDatum_8_0= ruleDATUM ) )? | otherlv_9= 'unbekannt' ) otherlv_10= 'bis:' ( ( (lv_bisDatum_11_0= ruleDATUM ) )? | otherlv_12= 'unbekannt' | otherlv_13= 'andauernd' ) otherlv_14= '.' otherlv_15= 'Hochzeit:' ( ( (lv_hochzeitstag_16_0= ruleDATUM ) )? | otherlv_17= 'unbekannt' | otherlv_18= '-' ) otherlv_19= '.' otherlv_20= 'Scheidung:' ( ( (lv_scheidungstag_21_0= ruleDATUM ) )? | otherlv_22= 'unbekannt' | otherlv_23= 'unabsehbar' | otherlv_24= 'demn\\u00E4chst' | otherlv_25= '-' ) otherlv_26= '.' ) )
            // InternalAhnen.g:1243:2: ( () otherlv_1= 'Beziehung:' otherlv_2= 'mit' ( ( (otherlv_3= RULE_STRING ) ) | otherlv_4= 'unbekannt' | otherlv_5= 'unerfasst' ) otherlv_6= '.' otherlv_7= 'von:' ( ( (lv_vonDatum_8_0= ruleDATUM ) )? | otherlv_9= 'unbekannt' ) otherlv_10= 'bis:' ( ( (lv_bisDatum_11_0= ruleDATUM ) )? | otherlv_12= 'unbekannt' | otherlv_13= 'andauernd' ) otherlv_14= '.' otherlv_15= 'Hochzeit:' ( ( (lv_hochzeitstag_16_0= ruleDATUM ) )? | otherlv_17= 'unbekannt' | otherlv_18= '-' ) otherlv_19= '.' otherlv_20= 'Scheidung:' ( ( (lv_scheidungstag_21_0= ruleDATUM ) )? | otherlv_22= 'unbekannt' | otherlv_23= 'unabsehbar' | otherlv_24= 'demn\\u00E4chst' | otherlv_25= '-' ) otherlv_26= '.' )
            {
            // InternalAhnen.g:1243:2: ( () otherlv_1= 'Beziehung:' otherlv_2= 'mit' ( ( (otherlv_3= RULE_STRING ) ) | otherlv_4= 'unbekannt' | otherlv_5= 'unerfasst' ) otherlv_6= '.' otherlv_7= 'von:' ( ( (lv_vonDatum_8_0= ruleDATUM ) )? | otherlv_9= 'unbekannt' ) otherlv_10= 'bis:' ( ( (lv_bisDatum_11_0= ruleDATUM ) )? | otherlv_12= 'unbekannt' | otherlv_13= 'andauernd' ) otherlv_14= '.' otherlv_15= 'Hochzeit:' ( ( (lv_hochzeitstag_16_0= ruleDATUM ) )? | otherlv_17= 'unbekannt' | otherlv_18= '-' ) otherlv_19= '.' otherlv_20= 'Scheidung:' ( ( (lv_scheidungstag_21_0= ruleDATUM ) )? | otherlv_22= 'unbekannt' | otherlv_23= 'unabsehbar' | otherlv_24= 'demn\\u00E4chst' | otherlv_25= '-' ) otherlv_26= '.' )
            // InternalAhnen.g:1244:3: () otherlv_1= 'Beziehung:' otherlv_2= 'mit' ( ( (otherlv_3= RULE_STRING ) ) | otherlv_4= 'unbekannt' | otherlv_5= 'unerfasst' ) otherlv_6= '.' otherlv_7= 'von:' ( ( (lv_vonDatum_8_0= ruleDATUM ) )? | otherlv_9= 'unbekannt' ) otherlv_10= 'bis:' ( ( (lv_bisDatum_11_0= ruleDATUM ) )? | otherlv_12= 'unbekannt' | otherlv_13= 'andauernd' ) otherlv_14= '.' otherlv_15= 'Hochzeit:' ( ( (lv_hochzeitstag_16_0= ruleDATUM ) )? | otherlv_17= 'unbekannt' | otherlv_18= '-' ) otherlv_19= '.' otherlv_20= 'Scheidung:' ( ( (lv_scheidungstag_21_0= ruleDATUM ) )? | otherlv_22= 'unbekannt' | otherlv_23= 'unabsehbar' | otherlv_24= 'demn\\u00E4chst' | otherlv_25= '-' ) otherlv_26= '.'
            {
            // InternalAhnen.g:1244:3: ()
            // InternalAhnen.g:1245:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBeziehungAccess().getBeziehungAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getBeziehungAccess().getBeziehungKeyword_1());
            		
            otherlv_2=(Token)match(input,53,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getBeziehungAccess().getMitKeyword_2());
            		
            // InternalAhnen.g:1259:3: ( ( (otherlv_3= RULE_STRING ) ) | otherlv_4= 'unbekannt' | otherlv_5= 'unerfasst' )
            int alt49=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt49=1;
                }
                break;
            case 20:
                {
                alt49=2;
                }
                break;
            case 32:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalAhnen.g:1260:4: ( (otherlv_3= RULE_STRING ) )
                    {
                    // InternalAhnen.g:1260:4: ( (otherlv_3= RULE_STRING ) )
                    // InternalAhnen.g:1261:5: (otherlv_3= RULE_STRING )
                    {
                    // InternalAhnen.g:1261:5: (otherlv_3= RULE_STRING )
                    // InternalAhnen.g:1262:6: otherlv_3= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBeziehungRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(otherlv_3, grammarAccess.getBeziehungAccess().getBeziehungPersonCrossReference_3_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:1274:4: otherlv_4= 'unbekannt'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getBeziehungAccess().getUnbekanntKeyword_3_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalAhnen.g:1279:4: otherlv_5= 'unerfasst'
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getBeziehungAccess().getUnerfasstKeyword_3_2());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_55); 

            			newLeafNode(otherlv_6, grammarAccess.getBeziehungAccess().getFullStopKeyword_4());
            		
            otherlv_7=(Token)match(input,54,FOLLOW_56); 

            			newLeafNode(otherlv_7, grammarAccess.getBeziehungAccess().getVonKeyword_5());
            		
            // InternalAhnen.g:1292:3: ( ( (lv_vonDatum_8_0= ruleDATUM ) )? | otherlv_9= 'unbekannt' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_DATE||LA51_0==55) ) {
                alt51=1;
            }
            else if ( (LA51_0==20) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalAhnen.g:1293:4: ( (lv_vonDatum_8_0= ruleDATUM ) )?
                    {
                    // InternalAhnen.g:1293:4: ( (lv_vonDatum_8_0= ruleDATUM ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_DATE) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalAhnen.g:1294:5: (lv_vonDatum_8_0= ruleDATUM )
                            {
                            // InternalAhnen.g:1294:5: (lv_vonDatum_8_0= ruleDATUM )
                            // InternalAhnen.g:1295:6: lv_vonDatum_8_0= ruleDATUM
                            {

                            						newCompositeNode(grammarAccess.getBeziehungAccess().getVonDatumDATUMParserRuleCall_6_0_0());
                            					
                            pushFollow(FOLLOW_57);
                            lv_vonDatum_8_0=ruleDATUM();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getBeziehungRule());
                            						}
                            						set(
                            							current,
                            							"vonDatum",
                            							lv_vonDatum_8_0,
                            							"com.github.funthomas424242.dsl.Ahnen.DATUM");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:1313:4: otherlv_9= 'unbekannt'
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_57); 

                    				newLeafNode(otherlv_9, grammarAccess.getBeziehungAccess().getUnbekanntKeyword_6_1());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,55,FOLLOW_58); 

            			newLeafNode(otherlv_10, grammarAccess.getBeziehungAccess().getBisKeyword_7());
            		
            // InternalAhnen.g:1322:3: ( ( (lv_bisDatum_11_0= ruleDATUM ) )? | otherlv_12= 'unbekannt' | otherlv_13= 'andauernd' )
            int alt53=3;
            switch ( input.LA(1) ) {
            case RULE_DATE:
            case 18:
                {
                alt53=1;
                }
                break;
            case 20:
                {
                alt53=2;
                }
                break;
            case 56:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalAhnen.g:1323:4: ( (lv_bisDatum_11_0= ruleDATUM ) )?
                    {
                    // InternalAhnen.g:1323:4: ( (lv_bisDatum_11_0= ruleDATUM ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_DATE) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalAhnen.g:1324:5: (lv_bisDatum_11_0= ruleDATUM )
                            {
                            // InternalAhnen.g:1324:5: (lv_bisDatum_11_0= ruleDATUM )
                            // InternalAhnen.g:1325:6: lv_bisDatum_11_0= ruleDATUM
                            {

                            						newCompositeNode(grammarAccess.getBeziehungAccess().getBisDatumDATUMParserRuleCall_8_0_0());
                            					
                            pushFollow(FOLLOW_12);
                            lv_bisDatum_11_0=ruleDATUM();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getBeziehungRule());
                            						}
                            						set(
                            							current,
                            							"bisDatum",
                            							lv_bisDatum_11_0,
                            							"com.github.funthomas424242.dsl.Ahnen.DATUM");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:1343:4: otherlv_12= 'unbekannt'
                    {
                    otherlv_12=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getBeziehungAccess().getUnbekanntKeyword_8_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalAhnen.g:1348:4: otherlv_13= 'andauernd'
                    {
                    otherlv_13=(Token)match(input,56,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getBeziehungAccess().getAndauerndKeyword_8_2());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FOLLOW_59); 

            			newLeafNode(otherlv_14, grammarAccess.getBeziehungAccess().getFullStopKeyword_9());
            		
            otherlv_15=(Token)match(input,57,FOLLOW_60); 

            			newLeafNode(otherlv_15, grammarAccess.getBeziehungAccess().getHochzeitKeyword_10());
            		
            // InternalAhnen.g:1361:3: ( ( (lv_hochzeitstag_16_0= ruleDATUM ) )? | otherlv_17= 'unbekannt' | otherlv_18= '-' )
            int alt55=3;
            switch ( input.LA(1) ) {
            case RULE_DATE:
            case 18:
                {
                alt55=1;
                }
                break;
            case 20:
                {
                alt55=2;
                }
                break;
            case 22:
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
                    // InternalAhnen.g:1362:4: ( (lv_hochzeitstag_16_0= ruleDATUM ) )?
                    {
                    // InternalAhnen.g:1362:4: ( (lv_hochzeitstag_16_0= ruleDATUM ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_DATE) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalAhnen.g:1363:5: (lv_hochzeitstag_16_0= ruleDATUM )
                            {
                            // InternalAhnen.g:1363:5: (lv_hochzeitstag_16_0= ruleDATUM )
                            // InternalAhnen.g:1364:6: lv_hochzeitstag_16_0= ruleDATUM
                            {

                            						newCompositeNode(grammarAccess.getBeziehungAccess().getHochzeitstagDATUMParserRuleCall_11_0_0());
                            					
                            pushFollow(FOLLOW_12);
                            lv_hochzeitstag_16_0=ruleDATUM();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getBeziehungRule());
                            						}
                            						set(
                            							current,
                            							"hochzeitstag",
                            							lv_hochzeitstag_16_0,
                            							"com.github.funthomas424242.dsl.Ahnen.DATUM");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:1382:4: otherlv_17= 'unbekannt'
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getBeziehungAccess().getUnbekanntKeyword_11_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalAhnen.g:1387:4: otherlv_18= '-'
                    {
                    otherlv_18=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_18, grammarAccess.getBeziehungAccess().getHyphenMinusKeyword_11_2());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,18,FOLLOW_61); 

            			newLeafNode(otherlv_19, grammarAccess.getBeziehungAccess().getFullStopKeyword_12());
            		
            otherlv_20=(Token)match(input,58,FOLLOW_62); 

            			newLeafNode(otherlv_20, grammarAccess.getBeziehungAccess().getScheidungKeyword_13());
            		
            // InternalAhnen.g:1400:3: ( ( (lv_scheidungstag_21_0= ruleDATUM ) )? | otherlv_22= 'unbekannt' | otherlv_23= 'unabsehbar' | otherlv_24= 'demn\\u00E4chst' | otherlv_25= '-' )
            int alt57=5;
            switch ( input.LA(1) ) {
            case RULE_DATE:
            case 18:
                {
                alt57=1;
                }
                break;
            case 20:
                {
                alt57=2;
                }
                break;
            case 59:
                {
                alt57=3;
                }
                break;
            case 60:
                {
                alt57=4;
                }
                break;
            case 22:
                {
                alt57=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalAhnen.g:1401:4: ( (lv_scheidungstag_21_0= ruleDATUM ) )?
                    {
                    // InternalAhnen.g:1401:4: ( (lv_scheidungstag_21_0= ruleDATUM ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_DATE) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalAhnen.g:1402:5: (lv_scheidungstag_21_0= ruleDATUM )
                            {
                            // InternalAhnen.g:1402:5: (lv_scheidungstag_21_0= ruleDATUM )
                            // InternalAhnen.g:1403:6: lv_scheidungstag_21_0= ruleDATUM
                            {

                            						newCompositeNode(grammarAccess.getBeziehungAccess().getScheidungstagDATUMParserRuleCall_14_0_0());
                            					
                            pushFollow(FOLLOW_12);
                            lv_scheidungstag_21_0=ruleDATUM();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getBeziehungRule());
                            						}
                            						set(
                            							current,
                            							"scheidungstag",
                            							lv_scheidungstag_21_0,
                            							"com.github.funthomas424242.dsl.Ahnen.DATUM");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:1421:4: otherlv_22= 'unbekannt'
                    {
                    otherlv_22=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_22, grammarAccess.getBeziehungAccess().getUnbekanntKeyword_14_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalAhnen.g:1426:4: otherlv_23= 'unabsehbar'
                    {
                    otherlv_23=(Token)match(input,59,FOLLOW_12); 

                    				newLeafNode(otherlv_23, grammarAccess.getBeziehungAccess().getUnabsehbarKeyword_14_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalAhnen.g:1431:4: otherlv_24= 'demn\\u00E4chst'
                    {
                    otherlv_24=(Token)match(input,60,FOLLOW_12); 

                    				newLeafNode(otherlv_24, grammarAccess.getBeziehungAccess().getDemnächstKeyword_14_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalAhnen.g:1436:4: otherlv_25= '-'
                    {
                    otherlv_25=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_25, grammarAccess.getBeziehungAccess().getHyphenMinusKeyword_14_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getBeziehungAccess().getFullStopKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBeziehung"


    // $ANTLR start "entryRuleFamilienbuch"
    // InternalAhnen.g:1449:1: entryRuleFamilienbuch returns [EObject current=null] : iv_ruleFamilienbuch= ruleFamilienbuch EOF ;
    public final EObject entryRuleFamilienbuch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFamilienbuch = null;


        try {
            // InternalAhnen.g:1449:53: (iv_ruleFamilienbuch= ruleFamilienbuch EOF )
            // InternalAhnen.g:1450:2: iv_ruleFamilienbuch= ruleFamilienbuch EOF
            {
             newCompositeNode(grammarAccess.getFamilienbuchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFamilienbuch=ruleFamilienbuch();

            state._fsp--;

             current =iv_ruleFamilienbuch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFamilienbuch"


    // $ANTLR start "ruleFamilienbuch"
    // InternalAhnen.g:1456:1: ruleFamilienbuch returns [EObject current=null] : (otherlv_0= 'Familienbuch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'Familie:' ( (lv_familie_4_0= RULE_STRING ) ) otherlv_5= '.' otherlv_6= 'Person:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '.' otherlv_9= 'Version:' ( (lv_version_10_0= ruleVERSION ) ) otherlv_11= '.' otherlv_12= 'Titel:' ( (lv_titel_13_0= RULE_STRING ) ) otherlv_14= '.' otherlv_15= 'Vorwort:' otherlv_16= '{' ( (lv_vorwort_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'Autor:' otherlv_20= '{' ( (lv_autor_21_0= ruleAutor ) ) otherlv_22= '}' otherlv_23= 'Familien:' otherlv_24= '{' ( (lv_familien_25_0= ruleFamilienImport ) )+ otherlv_26= '}' ) ;
    public final EObject ruleFamilienbuch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_familie_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_titel_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_vorwort_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_autor_21_0 = null;

        EObject lv_familien_25_0 = null;



        	enterRule();

        try {
            // InternalAhnen.g:1462:2: ( (otherlv_0= 'Familienbuch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'Familie:' ( (lv_familie_4_0= RULE_STRING ) ) otherlv_5= '.' otherlv_6= 'Person:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '.' otherlv_9= 'Version:' ( (lv_version_10_0= ruleVERSION ) ) otherlv_11= '.' otherlv_12= 'Titel:' ( (lv_titel_13_0= RULE_STRING ) ) otherlv_14= '.' otherlv_15= 'Vorwort:' otherlv_16= '{' ( (lv_vorwort_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'Autor:' otherlv_20= '{' ( (lv_autor_21_0= ruleAutor ) ) otherlv_22= '}' otherlv_23= 'Familien:' otherlv_24= '{' ( (lv_familien_25_0= ruleFamilienImport ) )+ otherlv_26= '}' ) )
            // InternalAhnen.g:1463:2: (otherlv_0= 'Familienbuch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'Familie:' ( (lv_familie_4_0= RULE_STRING ) ) otherlv_5= '.' otherlv_6= 'Person:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '.' otherlv_9= 'Version:' ( (lv_version_10_0= ruleVERSION ) ) otherlv_11= '.' otherlv_12= 'Titel:' ( (lv_titel_13_0= RULE_STRING ) ) otherlv_14= '.' otherlv_15= 'Vorwort:' otherlv_16= '{' ( (lv_vorwort_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'Autor:' otherlv_20= '{' ( (lv_autor_21_0= ruleAutor ) ) otherlv_22= '}' otherlv_23= 'Familien:' otherlv_24= '{' ( (lv_familien_25_0= ruleFamilienImport ) )+ otherlv_26= '}' )
            {
            // InternalAhnen.g:1463:2: (otherlv_0= 'Familienbuch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'Familie:' ( (lv_familie_4_0= RULE_STRING ) ) otherlv_5= '.' otherlv_6= 'Person:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '.' otherlv_9= 'Version:' ( (lv_version_10_0= ruleVERSION ) ) otherlv_11= '.' otherlv_12= 'Titel:' ( (lv_titel_13_0= RULE_STRING ) ) otherlv_14= '.' otherlv_15= 'Vorwort:' otherlv_16= '{' ( (lv_vorwort_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'Autor:' otherlv_20= '{' ( (lv_autor_21_0= ruleAutor ) ) otherlv_22= '}' otherlv_23= 'Familien:' otherlv_24= '{' ( (lv_familien_25_0= ruleFamilienImport ) )+ otherlv_26= '}' )
            // InternalAhnen.g:1464:3: otherlv_0= 'Familienbuch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' otherlv_3= 'Familie:' ( (lv_familie_4_0= RULE_STRING ) ) otherlv_5= '.' otherlv_6= 'Person:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '.' otherlv_9= 'Version:' ( (lv_version_10_0= ruleVERSION ) ) otherlv_11= '.' otherlv_12= 'Titel:' ( (lv_titel_13_0= RULE_STRING ) ) otherlv_14= '.' otherlv_15= 'Vorwort:' otherlv_16= '{' ( (lv_vorwort_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'Autor:' otherlv_20= '{' ( (lv_autor_21_0= ruleAutor ) ) otherlv_22= '}' otherlv_23= 'Familien:' otherlv_24= '{' ( (lv_familien_25_0= ruleFamilienImport ) )+ otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFamilienbuchAccess().getFamilienbuchKeyword_0());
            		
            // InternalAhnen.g:1468:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAhnen.g:1469:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAhnen.g:1469:4: (lv_name_1_0= RULE_ID )
            // InternalAhnen.g:1470:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFamilienbuchAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFamilienbuchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_63); 

            			newLeafNode(otherlv_2, grammarAccess.getFamilienbuchAccess().getSemicolonKeyword_2());
            		
            otherlv_3=(Token)match(input,62,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getFamilienbuchAccess().getFamilieKeyword_3());
            		
            // InternalAhnen.g:1494:3: ( (lv_familie_4_0= RULE_STRING ) )
            // InternalAhnen.g:1495:4: (lv_familie_4_0= RULE_STRING )
            {
            // InternalAhnen.g:1495:4: (lv_familie_4_0= RULE_STRING )
            // InternalAhnen.g:1496:5: lv_familie_4_0= RULE_STRING
            {
            lv_familie_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_familie_4_0, grammarAccess.getFamilienbuchAccess().getFamilieSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFamilienbuchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"familie",
            						lv_familie_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_64); 

            			newLeafNode(otherlv_5, grammarAccess.getFamilienbuchAccess().getFullStopKeyword_5());
            		
            otherlv_6=(Token)match(input,63,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getFamilienbuchAccess().getPersonKeyword_6());
            		
            // InternalAhnen.g:1520:3: ( (otherlv_7= RULE_STRING ) )
            // InternalAhnen.g:1521:4: (otherlv_7= RULE_STRING )
            {
            // InternalAhnen.g:1521:4: (otherlv_7= RULE_STRING )
            // InternalAhnen.g:1522:5: otherlv_7= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFamilienbuchRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(otherlv_7, grammarAccess.getFamilienbuchAccess().getPersonPersonCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_65); 

            			newLeafNode(otherlv_8, grammarAccess.getFamilienbuchAccess().getFullStopKeyword_8());
            		
            otherlv_9=(Token)match(input,64,FOLLOW_66); 

            			newLeafNode(otherlv_9, grammarAccess.getFamilienbuchAccess().getVersionKeyword_9());
            		
            // InternalAhnen.g:1541:3: ( (lv_version_10_0= ruleVERSION ) )
            // InternalAhnen.g:1542:4: (lv_version_10_0= ruleVERSION )
            {
            // InternalAhnen.g:1542:4: (lv_version_10_0= ruleVERSION )
            // InternalAhnen.g:1543:5: lv_version_10_0= ruleVERSION
            {

            					newCompositeNode(grammarAccess.getFamilienbuchAccess().getVersionVERSIONParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_12);
            lv_version_10_0=ruleVERSION();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFamilienbuchRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_10_0,
            						"com.github.funthomas424242.dsl.Ahnen.VERSION");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_67); 

            			newLeafNode(otherlv_11, grammarAccess.getFamilienbuchAccess().getFullStopKeyword_11());
            		
            otherlv_12=(Token)match(input,65,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getFamilienbuchAccess().getTitelKeyword_12());
            		
            // InternalAhnen.g:1568:3: ( (lv_titel_13_0= RULE_STRING ) )
            // InternalAhnen.g:1569:4: (lv_titel_13_0= RULE_STRING )
            {
            // InternalAhnen.g:1569:4: (lv_titel_13_0= RULE_STRING )
            // InternalAhnen.g:1570:5: lv_titel_13_0= RULE_STRING
            {
            lv_titel_13_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_titel_13_0, grammarAccess.getFamilienbuchAccess().getTitelSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFamilienbuchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"titel",
            						lv_titel_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,18,FOLLOW_68); 

            			newLeafNode(otherlv_14, grammarAccess.getFamilienbuchAccess().getFullStopKeyword_14());
            		
            otherlv_15=(Token)match(input,66,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getFamilienbuchAccess().getVorwortKeyword_15());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_16, grammarAccess.getFamilienbuchAccess().getLeftCurlyBracketKeyword_16());
            		
            // InternalAhnen.g:1598:3: ( (lv_vorwort_17_0= RULE_STRING ) )
            // InternalAhnen.g:1599:4: (lv_vorwort_17_0= RULE_STRING )
            {
            // InternalAhnen.g:1599:4: (lv_vorwort_17_0= RULE_STRING )
            // InternalAhnen.g:1600:5: lv_vorwort_17_0= RULE_STRING
            {
            lv_vorwort_17_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_vorwort_17_0, grammarAccess.getFamilienbuchAccess().getVorwortSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFamilienbuchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"vorwort",
            						lv_vorwort_17_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_18=(Token)match(input,38,FOLLOW_69); 

            			newLeafNode(otherlv_18, grammarAccess.getFamilienbuchAccess().getRightCurlyBracketKeyword_18());
            		
            otherlv_19=(Token)match(input,67,FOLLOW_8); 

            			newLeafNode(otherlv_19, grammarAccess.getFamilienbuchAccess().getAutorKeyword_19());
            		
            otherlv_20=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_20, grammarAccess.getFamilienbuchAccess().getLeftCurlyBracketKeyword_20());
            		
            // InternalAhnen.g:1628:3: ( (lv_autor_21_0= ruleAutor ) )
            // InternalAhnen.g:1629:4: (lv_autor_21_0= ruleAutor )
            {
            // InternalAhnen.g:1629:4: (lv_autor_21_0= ruleAutor )
            // InternalAhnen.g:1630:5: lv_autor_21_0= ruleAutor
            {

            					newCompositeNode(grammarAccess.getFamilienbuchAccess().getAutorAutorParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_35);
            lv_autor_21_0=ruleAutor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFamilienbuchRule());
            					}
            					set(
            						current,
            						"autor",
            						lv_autor_21_0,
            						"com.github.funthomas424242.dsl.Ahnen.Autor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_22=(Token)match(input,38,FOLLOW_70); 

            			newLeafNode(otherlv_22, grammarAccess.getFamilienbuchAccess().getRightCurlyBracketKeyword_22());
            		
            otherlv_23=(Token)match(input,68,FOLLOW_8); 

            			newLeafNode(otherlv_23, grammarAccess.getFamilienbuchAccess().getFamilienKeyword_23());
            		
            otherlv_24=(Token)match(input,15,FOLLOW_71); 

            			newLeafNode(otherlv_24, grammarAccess.getFamilienbuchAccess().getLeftCurlyBracketKeyword_24());
            		
            // InternalAhnen.g:1659:3: ( (lv_familien_25_0= ruleFamilienImport ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==69) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalAhnen.g:1660:4: (lv_familien_25_0= ruleFamilienImport )
            	    {
            	    // InternalAhnen.g:1660:4: (lv_familien_25_0= ruleFamilienImport )
            	    // InternalAhnen.g:1661:5: lv_familien_25_0= ruleFamilienImport
            	    {

            	    					newCompositeNode(grammarAccess.getFamilienbuchAccess().getFamilienFamilienImportParserRuleCall_25_0());
            	    				
            	    pushFollow(FOLLOW_72);
            	    lv_familien_25_0=ruleFamilienImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFamilienbuchRule());
            	    					}
            	    					add(
            	    						current,
            	    						"familien",
            	    						lv_familien_25_0,
            	    						"com.github.funthomas424242.dsl.Ahnen.FamilienImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            otherlv_26=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getFamilienbuchAccess().getRightCurlyBracketKeyword_26());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFamilienbuch"


    // $ANTLR start "entryRuleFamilienImport"
    // InternalAhnen.g:1686:1: entryRuleFamilienImport returns [EObject current=null] : iv_ruleFamilienImport= ruleFamilienImport EOF ;
    public final EObject entryRuleFamilienImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFamilienImport = null;


        try {
            // InternalAhnen.g:1686:55: (iv_ruleFamilienImport= ruleFamilienImport EOF )
            // InternalAhnen.g:1687:2: iv_ruleFamilienImport= ruleFamilienImport EOF
            {
             newCompositeNode(grammarAccess.getFamilienImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFamilienImport=ruleFamilienImport();

            state._fsp--;

             current =iv_ruleFamilienImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFamilienImport"


    // $ANTLR start "ruleFamilienImport"
    // InternalAhnen.g:1693:1: ruleFamilienImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= 'familie' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ) ;
    public final EObject ruleFamilienImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAhnen.g:1699:2: ( (otherlv_0= 'import' otherlv_1= 'familie' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ) )
            // InternalAhnen.g:1700:2: (otherlv_0= 'import' otherlv_1= 'familie' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' )
            {
            // InternalAhnen.g:1700:2: (otherlv_0= 'import' otherlv_1= 'familie' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' )
            // InternalAhnen.g:1701:3: otherlv_0= 'import' otherlv_1= 'familie' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_73); 

            			newLeafNode(otherlv_0, grammarAccess.getFamilienImportAccess().getImportKeyword_0());
            		
            otherlv_1=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFamilienImportAccess().getFamilieKeyword_1());
            		
            // InternalAhnen.g:1709:3: ( (otherlv_2= RULE_ID ) )
            // InternalAhnen.g:1710:4: (otherlv_2= RULE_ID )
            {
            // InternalAhnen.g:1710:4: (otherlv_2= RULE_ID )
            // InternalAhnen.g:1711:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFamilienImportRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_2, grammarAccess.getFamilienImportAccess().getFamilieFamilieCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFamilienImportAccess().getFullStopKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFamilienImport"


    // $ANTLR start "entryRuleAutor"
    // InternalAhnen.g:1730:1: entryRuleAutor returns [EObject current=null] : iv_ruleAutor= ruleAutor EOF ;
    public final EObject entryRuleAutor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutor = null;


        try {
            // InternalAhnen.g:1730:46: (iv_ruleAutor= ruleAutor EOF )
            // InternalAhnen.g:1731:2: iv_ruleAutor= ruleAutor EOF
            {
             newCompositeNode(grammarAccess.getAutorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutor=ruleAutor();

            state._fsp--;

             current =iv_ruleAutor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutor"


    // $ANTLR start "ruleAutor"
    // InternalAhnen.g:1737:1: ruleAutor returns [EObject current=null] : (otherlv_0= 'Vorname:' ( (lv_vorname_1_0= RULE_STRING ) ) otherlv_2= '.' otherlv_3= 'Name:' ( (lv_nachname_4_0= RULE_STRING ) ) otherlv_5= '.' otherlv_6= 'Organisation' ( (lv_organisationsName_7_0= RULE_STRING ) )? otherlv_8= '.' ) ;
    public final EObject ruleAutor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_vorname_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nachname_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_organisationsName_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalAhnen.g:1743:2: ( (otherlv_0= 'Vorname:' ( (lv_vorname_1_0= RULE_STRING ) ) otherlv_2= '.' otherlv_3= 'Name:' ( (lv_nachname_4_0= RULE_STRING ) ) otherlv_5= '.' otherlv_6= 'Organisation' ( (lv_organisationsName_7_0= RULE_STRING ) )? otherlv_8= '.' ) )
            // InternalAhnen.g:1744:2: (otherlv_0= 'Vorname:' ( (lv_vorname_1_0= RULE_STRING ) ) otherlv_2= '.' otherlv_3= 'Name:' ( (lv_nachname_4_0= RULE_STRING ) ) otherlv_5= '.' otherlv_6= 'Organisation' ( (lv_organisationsName_7_0= RULE_STRING ) )? otherlv_8= '.' )
            {
            // InternalAhnen.g:1744:2: (otherlv_0= 'Vorname:' ( (lv_vorname_1_0= RULE_STRING ) ) otherlv_2= '.' otherlv_3= 'Name:' ( (lv_nachname_4_0= RULE_STRING ) ) otherlv_5= '.' otherlv_6= 'Organisation' ( (lv_organisationsName_7_0= RULE_STRING ) )? otherlv_8= '.' )
            // InternalAhnen.g:1745:3: otherlv_0= 'Vorname:' ( (lv_vorname_1_0= RULE_STRING ) ) otherlv_2= '.' otherlv_3= 'Name:' ( (lv_nachname_4_0= RULE_STRING ) ) otherlv_5= '.' otherlv_6= 'Organisation' ( (lv_organisationsName_7_0= RULE_STRING ) )? otherlv_8= '.'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAutorAccess().getVornameKeyword_0());
            		
            // InternalAhnen.g:1749:3: ( (lv_vorname_1_0= RULE_STRING ) )
            // InternalAhnen.g:1750:4: (lv_vorname_1_0= RULE_STRING )
            {
            // InternalAhnen.g:1750:4: (lv_vorname_1_0= RULE_STRING )
            // InternalAhnen.g:1751:5: lv_vorname_1_0= RULE_STRING
            {
            lv_vorname_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_vorname_1_0, grammarAccess.getAutorAccess().getVornameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"vorname",
            						lv_vorname_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_74); 

            			newLeafNode(otherlv_2, grammarAccess.getAutorAccess().getFullStopKeyword_2());
            		
            otherlv_3=(Token)match(input,71,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getAutorAccess().getNameKeyword_3());
            		
            // InternalAhnen.g:1775:3: ( (lv_nachname_4_0= RULE_STRING ) )
            // InternalAhnen.g:1776:4: (lv_nachname_4_0= RULE_STRING )
            {
            // InternalAhnen.g:1776:4: (lv_nachname_4_0= RULE_STRING )
            // InternalAhnen.g:1777:5: lv_nachname_4_0= RULE_STRING
            {
            lv_nachname_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_nachname_4_0, grammarAccess.getAutorAccess().getNachnameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nachname",
            						lv_nachname_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_75); 

            			newLeafNode(otherlv_5, grammarAccess.getAutorAccess().getFullStopKeyword_5());
            		
            otherlv_6=(Token)match(input,72,FOLLOW_76); 

            			newLeafNode(otherlv_6, grammarAccess.getAutorAccess().getOrganisationKeyword_6());
            		
            // InternalAhnen.g:1801:3: ( (lv_organisationsName_7_0= RULE_STRING ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_STRING) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAhnen.g:1802:4: (lv_organisationsName_7_0= RULE_STRING )
                    {
                    // InternalAhnen.g:1802:4: (lv_organisationsName_7_0= RULE_STRING )
                    // InternalAhnen.g:1803:5: lv_organisationsName_7_0= RULE_STRING
                    {
                    lv_organisationsName_7_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    					newLeafNode(lv_organisationsName_7_0, grammarAccess.getAutorAccess().getOrganisationsNameSTRINGTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAutorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"organisationsName",
                    						lv_organisationsName_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAutorAccess().getFullStopKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutor"


    // $ANTLR start "entryRuleVERSION"
    // InternalAhnen.g:1827:1: entryRuleVERSION returns [String current=null] : iv_ruleVERSION= ruleVERSION EOF ;
    public final String entryRuleVERSION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVERSION = null;


        try {
            // InternalAhnen.g:1827:47: (iv_ruleVERSION= ruleVERSION EOF )
            // InternalAhnen.g:1828:2: iv_ruleVERSION= ruleVERSION EOF
            {
             newCompositeNode(grammarAccess.getVERSIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVERSION=ruleVERSION();

            state._fsp--;

             current =iv_ruleVERSION.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVERSION"


    // $ANTLR start "ruleVERSION"
    // InternalAhnen.g:1834:1: ruleVERSION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleVERSION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalAhnen.g:1840:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            // InternalAhnen.g:1841:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            {
            // InternalAhnen.g:1841:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            // InternalAhnen.g:1842:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getVERSIONAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,18,FOLLOW_66); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getVERSIONAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_12); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getVERSIONAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,18,FOLLOW_66); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getVERSIONAccess().getFullStopKeyword_3());
            		
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getVERSIONAccess().getINTTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVERSION"


    // $ANTLR start "entryRuleDATUM"
    // InternalAhnen.g:1877:1: entryRuleDATUM returns [String current=null] : iv_ruleDATUM= ruleDATUM EOF ;
    public final String entryRuleDATUM() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATUM = null;


        try {
            // InternalAhnen.g:1877:45: (iv_ruleDATUM= ruleDATUM EOF )
            // InternalAhnen.g:1878:2: iv_ruleDATUM= ruleDATUM EOF
            {
             newCompositeNode(grammarAccess.getDATUMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDATUM=ruleDATUM();

            state._fsp--;

             current =iv_ruleDATUM.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDATUM"


    // $ANTLR start "ruleDATUM"
    // InternalAhnen.g:1884:1: ruleDATUM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_0= RULE_DATE ;
    public final AntlrDatatypeRuleToken ruleDATUM() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_0=null;


        	enterRule();

        try {
            // InternalAhnen.g:1890:2: (this_DATE_0= RULE_DATE )
            // InternalAhnen.g:1891:2: this_DATE_0= RULE_DATE
            {
            this_DATE_0=(Token)match(input,RULE_DATE,FOLLOW_2); 

            		current.merge(this_DATE_0);
            	

            		newLeafNode(this_DATE_0, grammarAccess.getDATUMAccess().getDATETerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDATUM"


    // $ANTLR start "ruleGeschlecht"
    // InternalAhnen.g:1901:1: ruleGeschlecht returns [Enumerator current=null] : ( (enumLiteral_0= 'unbekannt' ) | (enumLiteral_1= 'm\\u00E4nnlich' ) | (enumLiteral_2= 'weiblich' ) ) ;
    public final Enumerator ruleGeschlecht() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAhnen.g:1907:2: ( ( (enumLiteral_0= 'unbekannt' ) | (enumLiteral_1= 'm\\u00E4nnlich' ) | (enumLiteral_2= 'weiblich' ) ) )
            // InternalAhnen.g:1908:2: ( (enumLiteral_0= 'unbekannt' ) | (enumLiteral_1= 'm\\u00E4nnlich' ) | (enumLiteral_2= 'weiblich' ) )
            {
            // InternalAhnen.g:1908:2: ( (enumLiteral_0= 'unbekannt' ) | (enumLiteral_1= 'm\\u00E4nnlich' ) | (enumLiteral_2= 'weiblich' ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt60=1;
                }
                break;
            case 73:
                {
                alt60=2;
                }
                break;
            case 74:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalAhnen.g:1909:3: (enumLiteral_0= 'unbekannt' )
                    {
                    // InternalAhnen.g:1909:3: (enumLiteral_0= 'unbekannt' )
                    // InternalAhnen.g:1910:4: enumLiteral_0= 'unbekannt'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getGeschlechtAccess().getUnbekanntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGeschlechtAccess().getUnbekanntEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAhnen.g:1917:3: (enumLiteral_1= 'm\\u00E4nnlich' )
                    {
                    // InternalAhnen.g:1917:3: (enumLiteral_1= 'm\\u00E4nnlich' )
                    // InternalAhnen.g:1918:4: enumLiteral_1= 'm\\u00E4nnlich'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getGeschlechtAccess().getMaennlichEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGeschlechtAccess().getMaennlichEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAhnen.g:1925:3: (enumLiteral_2= 'weiblich' )
                    {
                    // InternalAhnen.g:1925:3: (enumLiteral_2= 'weiblich' )
                    // InternalAhnen.g:1926:4: enumLiteral_2= 'weiblich'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getGeschlechtAccess().getWeiblichEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGeschlechtAccess().getWeiblichEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeschlecht"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000140020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000540020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000140000L,0x0000000000000600L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000140080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060140080L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100140020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000900140020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0010004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000820800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000824000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000100080L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000100080L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000600000040020L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002000000100020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000100020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000040000100020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000100100020L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0080000000100080L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100000000140080L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000540080L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x1800000000540080L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000040020L});

}