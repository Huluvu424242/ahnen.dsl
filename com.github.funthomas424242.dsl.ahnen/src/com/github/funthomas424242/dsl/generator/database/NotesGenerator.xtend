package com.github.funthomas424242.dsl.generator.database

import com.github.funthomas424242.dsl.ahnen.Familienbuch

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class NotesGenerator{
	
	def static createContent(Familienbuch buch) '''
  <notes>
    <note handle="_ac380498bac48eedee8" change="1185438865" id="N0001" type="Name Note">
      <text>Names can notes, too. This is a note for the alternate name of Louse Garner for Lewis Anderson Garner.</text>
      <style name="link" value="gramps://Person/handle/GNUJQCL9MD64AM56OH">
        <range start="80" end="101"/>
      </style>
    </note>
    <note handle="_ac380498bc46102e1e8" change="1185438865" id="N0002" type="Source Reference Note">
      <text>Strange, isn't it.</text>
    </note>
    <note handle="_ac380498c020c7bcdc7" change="1185438865" id="N0003" type="Person Note">
      <text>We have committed to synergistically disseminate resource-leveling methods of empowerment to set us apart from the competition. We envision to globally integrate inexpensive paradigms and professionally engineer timely technology while promoting personal employee growth. Our mission is to assertively build world-class methods of empowerment so that we may professionally promote parallel services to set us apart from the competition. It's our responsibility to dramatically maintain value-added services as well as to professionally simplify principle-centered technology for 100% customer satisfaction.

Thanks to the Mission Statement Generator from http://www.dilbert.com.</text>
    </note>
    <note handle="_ac3804a1d66258b8e13" change="1185438865" id="N0004" type="Attribute Note">
      <text>Courtesy of pyschoanalyze-pinhead from Emacs.

I am the psychotherapist.  Please, describe your problems.  Each time
you are finished talking, type RET twice.

SHHHH!!  I hear SIX TATTOOED TRUCK-DRIVERS tossing ENGINE BLOCKS
 into empty OIL DRUMS..

Why do you say that?

I have accepted Provolone into my life!

What makes you believe you have accepted provolone into your life?

It's 74 degrees, 12 minutes NORTH, and 41 degrees, 3 minutes EAST!!
 Soon, it will be TUESDAY!!

Maybe your plans have something to do with this.

GOOD-NIGHT, everybody..  Now I have to go administer FIRST-AID
 to my pet LEISURE SUIT!!

I don't understand.

I'm QUIETLY reading the latest issue of ``BOWLING WORLD''
 while my wife and two children stand QUIETLY BY..

Tell me something about your family.

How do I get HOME?

Is it because do you get home that you came to me?

Kids, the seven basic food groups are GUM, PUFF PASTRY, PIZZA,
 PESTICIDES, ANTIBIOTICS, NUTRA-SWEET and MILK DUDS!!</text>
    </note>
    <note handle="_ac3804a1d747a39822c" change="1185438865" id="N0005" type="Family Note">
      <text>GRAMPS aid to look for its tree to him of family.  It allows that you store data of genealogische to draw for above and investigating.  GRAMPS tries to make all the general capacities available of other programs of genealogischer more importantly but, to put an additional capacity of integration at your service not generally for these programs.  This one is the capacity to directly incorporate all the possible pieces of the information in Gramps and the cases of the data cambiar/manipulateany/all in the whole data base (in any order or order) around the user to support, if it makes the investigation, analysis and interrelation with the potential of the distances of the relation that fill.

This is a paragraph from the gramps-project.org page that was translated by Google's Language Tools to German, back to English, then to Spanish, and once again back to English.</text>
    </note>
    <note handle="_ac3804a8405171ef666" change="1185438865" id="N0006" type="Source Note">
      <text>His name is my name, too.</text>
    </note>
    <note handle="_ac3804a842b21358c97" change="1185438865" id="N0007" type="Source Note">
      <text>The repository reference from the source is important</text>
    </note>
    <note handle="_ac3804aac6b762b75a5" change="1185438865" id="N0008" type="Repository Note">
      <text>Some note on the repo</text>
    </note>
    <note handle="_ae13613d581506d040892f88a21" change="1196239118" id="N0000" type="Source text">
      <text>On every third blue moon, Lewis Anderson Garner would dress in a purple dress and claim that his name was Louis Garner.</text>
    </note>
    <note handle="_b39fe2e143d1e599450" change="1288511124" id="N0009" type="Repository Note">
      <text>Ask librarian for key to the microfilm closet of Great Falls church, it is closed normally</text>
      <style name="link" value="gramps://Place/handle/ONUJQCG42LU6VBX8IT">
        <range start="49" end="60"/>
      </style>
      <tagref hlink="_bb80c2b235b0a1b3f49"/>
    </note>
    <note handle="_b39feb55e1173f4a699" change="1234371685" id="N0010" type="Source text" format="1">
      <text>1855-06-25

    line 1    fac secunda Junij Baptiza- 
    line 2    tus est Lewis Anderson
    line 3    filius legitimus Guillielmus 
    line 4    Garner et Elisabetha  
    line 5    Becks. Susceptores fuerent 
    line 6    petrus Arts et Catharina 
    line 7    van de Voorde</text>
      <style name="bold">
        <range start="0" end="10"/>
      </style>
      <style name="underline">
        <range start="0" end="10"/>
      </style>
    </note>
    <note handle="_b39fedb8a051544689c" change="1234371684" id="N0011" type="Transcript">
      <text>1855-06-25:
I baptized on June the second Lewis Anderson legitimate son of Guillielmus Garner and Elisabetha Becke. Godparents were petrus Arts and Catharina Van de Voorde</text>
    </note>
    <note handle="_b39feeac1a202b44e76" change="1234371783" id="N0012" type="Event Note">
      <text>How did he die? We need to find out!

Perhaps we find info in the new york library</text>
      <style name="fontcolor" value="#ff0909">
        <range start="16" end="36"/>
      </style>
      <style name="bold">
        <range start="62" end="74"/>
      </style>
      <style name="underline">
        <range start="0" end="3"/>
      </style>
      <style name="highlight" value="#fbd50a">
        <range start="62" end="74"/>
      </style>
      <style name="fontsize" value="14">
        <range start="16" end="36"/>
      </style>
    </note>
    <note handle="_b39ff01f75c1f76859a" change="1234371936" id="N0013" type="Person Note">
      <text>This is a note showing a lot of different markup that mixes with each other making it a good stress test for markup notes.
This is a note showing a lot of different markup that mixes with each other making it a good stress test for markup notes.

This is a note showing a lot of different markup that mixes with each other making it a good stress test for markup notes.</text>
      <style name="highlight" value="#f29103">
        <range start="254" end="269"/>
      </style>
      <style name="fontsize" value="18">
        <range start="15" end="40"/>
      </style>
      <style name="fontcolor" value="#e611bf">
        <range start="222" end="259"/>
      </style>
      <style name="italic">
        <range start="288" end="306"/>
      </style>
      <style name="bold">
        <range start="7" end="109"/>
        <range start="301" end="311"/>
      </style>
      <style name="underline">
        <range start="96" end="112"/>
        <range start="317" end="323"/>
      </style>
      <style name="fontface" value="Bitstream Vera Sans Mono">
        <range start="15" end="40"/>
      </style>
      <tagref hlink="_bb80c2b235b0a1b3f49"/>
    </note>
    <note handle="_b39ff11d8912173cded" change="1234372078" id="N0014" type="Person Note" format="1">
      <text>This is a preformatted note showing a lot of different markup that mixes with each other making it a good stress test for markup notes.
                  This is a note showing a lot of different markup that mixes with each other making it a good stress test for markup notes.

This is 
        a note showing 
                             a lot of different markup 
                                      that mixes with each 
other making it a good stress test for markup notes.

   test  |    val1  |     val2
  ------------------------------
    me   |   blue   |    red</text>
      <style name="fontsize" value="13">
        <range start="10" end="22"/>
        <range start="52" end="79"/>
      </style>
      <style name="bold">
        <range start="8" end="41"/>
      </style>
      <style name="highlight" value="#73980c">
        <range start="169" end="185"/>
      </style>
      <style name="fontface" value="Bitstream Vera Sans Mono">
        <range start="52" end="79"/>
        <range start="481" end="573"/>
      </style>
      <style name="fontcolor" value="#f61a1a">
        <range start="168" end="184"/>
      </style>
    </note>
    <note handle="_c140d4c29520c92055c" change="1328026197" id="N0015" type="General" format="1">
      <text>This source has all possible references pointing to it. The references are as follows:

This note appears as a note to the source and also as a note for the person.

page 01  Person
page 02    Name
page 03    Address
page 04    Attribute
page 05    PersonRef
page 06    MediaRef
page 07      Attribute
page 08    LdsOrd
page 09    EventRef:Attribute 
page 10  Family
page 11    Attribute
page 12    ChildRef
page 13    MediaRef
page 14      Attribute
page 15    LdsOrd
page 16    EventRef:Attribute
page 17  Event
page 18    Attribute
page 19    MediaRef
page 20      Attribute
page 21  MediaObject
page 22    Attribute
page 23  Place
page 24    MediaRef
page 25      Attribute
page 26  Repository:Address</text>
      <style name="fontsize" value="12">
        <range start="0" end="705"/>
      </style>
      <style name="fontface" value="Courier">
        <range start="0" end="705"/>
      </style>
    </note>
    <note handle="_d0436bba4ec328d3b631259a4ee" change="1431184305" id="_header1" type="General">
      <text>Title for the example pages</text>
      <style name="fontcolor" value="#ef2929">
        <range start="0" end="27"/>
      </style>
      <style name="underline">
        <range start="0" end="27"/>
      </style>
      <style name="fontface" value="Serif">
        <range start="0" end="27"/>
      </style>
      <style name="bold">
        <range start="0" end="27"/>
      </style>
      <style name="fontsize" value="8">
        <range start="0" end="27"/>
      </style>
    </note>
    <note handle="_d0436bcc69d6bba278bff5bc7db" change="1431184300" id="_footer1" type="General">
      <text>Footer: exported by  __GRAMPS_HOMEPAGE__ on __EXPORT_DATE__</text>
    </note>
    <note handle="_d0436be64ac277b615b79b34e72" change="1431211661" id="_custom1" type="General">
      <text>Export date: __EXPORT_DATE__
GRAMPS homepage: __GRAMPS_HOMEPAGE__
GRAMPS version: __GRAMPS_VERSION__

Number of families: __NB_FAMILIES__
Number of persons: __NB_INDIVIDUALS__
Number of media objects: __NB_MEDIA__
Number of sources: __NB_SOURCES__
Number of repositories: __NB_REPOSITORIES__
Number of places: __NB_PLACES__

Search form:
__SEARCH_FORM__

Test link person: Garner von Zieliński, Lewis Anderson Sr
Test link family: Family of Warner, Allen Carl and Garner, Rita Marie
Test link source: World of the Wierd
Test link media: 1897_expeditionsmannschaft_rio_a
Test link place: Warren-Farmington Hills-Troy, MI

Test internet link: blog.codinghorror.com
Test relative path link: relative file path to &quot;archive.zip&quot;
Test relative path link: relative file path to &quot;archive.tgz&quot;

Thumbnail for &quot;1897_expeditionsmannschaft_rio_a&quot;:
__THUMB_O0010__
Image &quot;AntoineClaudet&quot;:
__MEDIA_O0011__
Thumbnail for &quot;1897_expeditionsmannschaft_rio_a&quot; with link:
__THUMB_O0010__
Image &quot;AntoineClaudet&quot; with link:
__MEDIA_O0011__

Wrong media ID:
__MEDIA_wrong id__</text>
      <style name="link" value="relative://relative.archive.zip">
        <range start="663" end="686"/>
      </style>
      <style name="link" value="gramps://Media/handle/238CGQ939HG18SS5MG">
        <range start="952" end="967"/>
      </style>
      <style name="link" value="gramps://Media/handle/238CGQ939HG18SS5MG">
        <range start="520" end="535"/>
      </style>
      <style name="link" value="gramps://Family/handle/48TJQCGNNIR5SJRCAK">
        <range start="413" end="429"/>
      </style>
      <style name="link" value="gramps://Person/handle/GNUJQCL9MD64AM56OH">
        <range start="355" end="371"/>
      </style>
      <style name="link" value="http://blog.codinghorror.com/">
        <range start="621" end="639"/>
      </style>
      <style name="link" value="gramps://Source/handle/VUBKMQTA2XZG1V6QP8">
        <range start="483" end="499"/>
      </style>
      <style name="link" value="gramps://Place/handle/3WTJQCB9F2MX9W98VP">
        <range start="570" end="585"/>
      </style>
      <style name="link" value="gramps://Media/handle/Y3ARGQWE088EQRTTDH">
        <range start="1002" end="1017"/>
      </style>
      <style name="link" value="relative://relative.archive.tgz">
        <range start="724" end="747"/>
      </style>
    </note>
  </notes>
	'''
	}
