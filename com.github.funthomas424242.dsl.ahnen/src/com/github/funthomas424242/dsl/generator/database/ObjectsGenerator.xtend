package com.github.funthomas424242.dsl.generator.database

import com.github.funthomas424242.dsl.ahnen.Familienbuch

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ObjectsGenerator{
	
	def static createContent(Familienbuch buch) '''
    <objects></objects>
	'''
	}

//
//<objects>
//    <object handle="_238CGQ939HG18SS5MG" change="1328027353" id="O0010">
//      <file src="1897_expeditionsmannschaft_rio_a.jpg" mime="image/jpeg" checksum="352c7ae13b8b642471ecae6fa78ce206" description="1897_expeditionsmannschaft_rio_a"/>
//      <dateval val="1897"/>
//      <tagref hlink="_bb80c2b235b0a1b3f49"/>
//    </object>
//    <object handle="_78V2GQX2FKNSYQ3OHE" change="1185438865" id="O0009">
//      <file src="Gunnlaugur_Larusson_-_Yawn.jpg" mime="image/jpeg" checksum="6bae0888ffdbad79b2735a5ac17450aa" description="Yawn"/>
//    </object>
//    <object handle="_B1AUFQV7H8R9NR4SZM" change="1328027158" id="O0008">
//      <file src="654px-Aksel_Andersson.jpg" mime="image/jpeg" checksum="542c7ed6f97c6af16907339439abffdf" description="654px-Aksel_Andersson"/>
//      <attribute type="Description" value="This seems to be a photo of a relative">
//        <citationref hlink="_c140dde678c5c4f4537"/>
//      </attribute>
//      <citationref hlink="_c140dd5edc11679f39b"/>
//    </object>
//    <object handle="_F0QIGQFT275JFJ75E8" change="1328026759" id="O0006">
//      <file src="Alimehemet.jpg" mime="image/jpeg" checksum="a8df70b9c84208806e8e2cb4fb0fe0dd" description="Alimehemet"/>
//    </object>
//    <object handle="_F8JYGQFL2PKLSYH79X" change="1185438865" id="O0007">
//      <file src="E_W_Dahlgren.jpg" mime="image/jpeg" checksum="918fd7fabe4878a687bf25a7c44749c5" description="E_W_Dahlgren"/>
//    </object>
//    <object handle="_Y3ARGQWE088EQRTTDH" change="1185438865" id="O0011">
//      <file src="AntoineClaudet.png" mime="image/png" checksum="7a0eced23b6e370c113b3ca628f45388" description="AntoineClaudet"/>
//    </object>
//    <object handle="_b39fe1cfc1305ac4a21" change="1328027069" id="O0000">
//      <file src="scanned_microfilm.png" mime="image/png" checksum="812d016b1404073af69d11891ec2f8a1" description="1855-06-25 scanned birth record"/>
//    </object>
//  </objects>