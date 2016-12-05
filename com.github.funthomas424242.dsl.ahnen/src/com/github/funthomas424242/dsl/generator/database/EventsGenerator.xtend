package com.github.funthomas424242.dsl.generator.database

import com.github.funthomas424242.dsl.ahnen.Familienbuch

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class EventsGenerator{
	
	def static createContent(Familienbuch buch) '''
  <events>
    <event handle="_a5af0eb667015e355db" change="1284030602" id="E0000">
      <type>Birth</type>
      <dateval val="1987-08-29"/>
      <place hlink="_08TJQCCFIX31BXPNXN"/>
      <description>Birth of Warner, Sarah Suzanne</description>
    </event>
    <event handle="_a5af0eb696917232725" change="1284030602" id="E0001">
      <type>LVG</type>
      <description>Custom FTW5 tag to specify LIVING not specified in GEDCOM 5.5</description>
    </event>
    <event handle="_a5af0eb698f29568502" change="1284030602" id="E0002">
      <type>Birth</type>
      <dateval val="1928-07-09"/>
      <place hlink="_1GTJQCCXZ3YO5QOFS"/>
      <description>Birth of Garner, Howard Lane</description>
    </event>
    <event handle="_a5af0eb69b82a6cdc5a" change="1284030612" id="E0003">
      <type>Birth</type>
      <place hlink="_Q8VJQCBTTFJ6B54QBI"/>
      <description>Birth of Schultz, John</description>
    </event>
    <event handle="_a5af0eb69c40c179441" change="1284030612" id="E0004">
      <type>Death</type>
      <dateval val="1860"/>
      <description>Death of Schultz, John</description>
    </event>
    <event handle="_a5af0eb69cf2d3fb615" change="1284030612" id="E0005">
      <type>Burial</type>
      <description>Burial of Schultz, John</description>
    </event>
    
    <event handle="_a5af0ebb81976dad1b2" change="1284030602" id="E0547">
      <type>Birth</type>
      <dateval val="1883-08-09"/>
      <description>Birth of Черкашин, Thomas</description>
    </event>
   
    <event handle="_a5af0ed67e5426ddf96" change="1284030621" id="E2870">
      <type>Marriage</type>
      <dateval val="1981-02-14"/>
      <place hlink="_QA3LQCB5B2WHEMTCW1"/>
      <description>Marriage of Warner, Arthur Maurice and Phillips, Anita Irene</description>
    </event>
    <event handle="_a5af0ed68171fcbdbed" change="1284030624" id="E2871">
      <type>Marriage</type>
      <dateval val="1677"/>
      <description>Marriage of Anderson, Samuel and Филиппов, Elizabeth</description>
    </event>
    <event handle="_a5af0ed683c30a71044" change="1284030625" id="E2872">
      <type>Marriage</type>
      <dateval val="1681"/>
      <place hlink="_Y0UJQCPAH423D4EICQ"/>
      <description>Marriage of Christiansen, John and Harmon, Martha</description>
    </event>
    <event handle="_a5af0ed68655861efbe" change="1284030621" id="E2873">
      <type>Marriage</type>
      <dateval val="1666-01-12"/>
      <place hlink="_CLWKQCK0VCJK70V3CH"/>
      <description>Marriage of Norris, John and Howell, Mary (Sarah)</description>
    </event>
    <event handle="_a5af0ed68a335dd5bc8" change="1284030621" id="E2874">
      <type>Marriage</type>
      <dateval val="1628"/>
      <place hlink="_FMALQCV1Q0QGJ3U6TU"/>
      <description>Marriage of Grenier, Joseph and Peters, Rose</description>
    </event>
    <event handle="_a5af0ed68d112952d12" change="1284030620" id="E2875">
      <type>Marriage</type>
      <place hlink="_JG3KQCMJF2VINK1TJ4"/>
      <description>Marriage of Lefebvre, Robert and Гончаров, Ellen</description>
    </event>
    <event handle="_a5af0ed68fa5dda551f" change="1284030627" id="E2876">
      <type>Marriage</type>
      <dateval val="1575-09-02"/>
      <place hlink="_LN3KQCKBCPGXEHDMC2"/>
      <description>Marriage of Wise, Thomas and Ramos, Mary</description>
    </event>
    <event handle="_a5af0ed6921453b6661" change="1284030621" id="E2877">
      <type>Marriage</type>
      <dateval val="1703-11-06"/>
      <place hlink="_JOALQCP680MFOOBN3D"/>
      <description>Marriage of Webster, Johanne(John) and Saunders, Ursula</description>
    </event>
    <event handle="_a5af0ed69630135f39e" change="1284030624" id="E2878">
      <type>Marriage</type>
      <dateval val="1701-03-05"/>
      <place hlink="_0L8KQCAXEBR2FC59FQ"/>
      <description>Marriage of 斎藤, Zariakius Cyriacus and Bishop, Anna Barbara</description>
    </event>
    <event handle="_a5af0ed698c6d79c5ca" change="1284030621" id="E2879">
      <type>Marriage</type>
      <description>Marriage of Carroll, Jacob A. and Николаев, Maria Catharina</description>
    </event>
    <event handle="_a5af0ed69af77f7dd9a" change="1284030624" id="E2880">
      <type>Marriage</type>
      <place hlink="_S22LQCLUZM135LVKRL"/>
      <description>Marriage of Page, John and Kaczmarek, Isabella</description>
    </event>
    <event handle="_a5af0ed813a59dea3b1" change="1284030628" id="E2881">
      <type>Marriage</type>
      <dateval val="1943-11-06"/>
      <place hlink="_0KUJQCMI3Z1IF14IF7"/>
      <description>Marriage of Warner, David Luther and Robbins, Merida Lorene</description>
    </event>
    <event handle="_a5af0ed81702baf04d0" change="1284030625" id="E2882">
      <type>Marriage</type>
      <place hlink="_8P8KQCL0WQYOA88KZB"/>
      <description>Marriage of Benson, Joseph Louis(Sr.) and Simard, Sarah</description>
    </event>
    <event handle="_a5af0ed81b224b3a8b2" change="1284030624" id="E2883">
      <type>Marriage</type>
      <description>Marriage of Thornton, Romaine and Soto, Harriet</description>
    </event>
    <event handle="_a5af0ed81eb0437c303" change="1284030621" id="E2884">
      <type>Marriage</type>
      <place hlink="_3UALQCF9HW74IUOP9O"/>
      <description>Marriage of Thornton, Phillip James and Белов, Katherine</description>
    </event>
    <event handle="_a5af0ed82147c09409f" change="1284030625" id="E2885">
      <type>Marriage</type>
      <place hlink="_77DKQC1ME25F8ZGYZA"/>
      <description>Marriage of Wheeler, Jacob Earl and Лопатин, Carmen Diana</description>
    </event>
    <event handle="_a5af0ed824b40843508" change="1284030621" id="E2886">
      <type>Marriage</type>
      <place hlink="_186LQCGOODL2IGV7PG"/>
      <description>Marriage of Fitzgerald, David Lee and Лопатин, Donna Elaine</description>
    </event>
    <event handle="_a5af0ed827338491545" change="1284030622" id="E2887">
      <type>Marriage</type>
      <dateval val="1978-11-18"/>
      <place hlink="_KUALQC7IDAN91IK2V6"/>
      <description>Marriage of Garrett, Terry Lee and Holloway, Gail</description>
    </event>
    <event handle="_a5af0ed829b4929715d" change="1284030622" id="E2888">
      <type>Marriage</type>
      <place hlink="_5HTJQCSB91P69HY731"/>
      <description>Marriage of Rodgers, John and Garrett, Doris Mae</description>
    </event>
    <event handle="_a5af0ed82c875c10176" change="1284030625" id="E2889">
      <type>Marriage</type>
      <dateval val="1988-10-01"/>
      <place hlink="_M8ZJQCCKTBLRRPKLOU"/>
      <description>Marriage of Герасимов, John and Garrett, Doris Mae</description>
    </event>
    <event handle="_a5af0ed82ff1e1af299" change="1284030626" id="E2890">
      <type>Marriage</type>
      <description>Marriage of Webb, Lewis I. and Зайцев, Ruth L.</description>
    </event>
    <event handle="_a5af0ed83276e4d48f7" change="1284030628" id="E2891">
      <type>Marriage</type>
      <place hlink="_249KQC707I5FTEDGET"/>
      <description>Marriage of Lane, Remo and Barnes, Ernestina</description>
    </event>
    <event handle="_a5af0ed834f4c82509c" change="1284030625" id="E2892">
      <type>Marriage</type>
      <dateval val="1936-02-19"/>
      <place hlink="_5HTJQCSB91P69HY731"/>
      <description>Marriage of Warner, Michael Warren and Черных, Mary Helen</description>
    </event>
    <event handle="_a5af0ed838071447454" change="1284030627" id="E2893">
      <type>Marriage</type>
      <description>Marriage of Козлов, Samuel C. and Pena, Julia</description>
    </event>
    <event handle="_a5af0ed83a51e3ceaf0" change="1284030623" id="E2894">
      <type>Marriage</type>
      <dateval val="1787-11-08"/>
      <description>Marriage of Jiménez, George, Sr. and Henry, Elizabeth</description>
    </event>
    <event handle="_a5af0ed83dd6920c177" change="1284030623" id="E2895">
      <type>Marriage</type>
      <description>Marriage of Cunningham, Peter Sr. and Dunn, Margaret Mary?</description>
    </event>
    <event handle="_a5af0ed83fe4c50b683" change="1284030626" id="E2896">
      <type>Marriage</type>
      <dateval val="1810"/>
      <place hlink="_PQVJQC7W3OFQB38JIK"/>
      <description>Marriage of Boucher, David and Morrison, Nancy</description>
    </event>
    <event handle="_a5af0ed843b0b4f25a5" change="1284030625" id="E2897">
      <type>Marriage</type>
      <place hlink="_PQVJQC7W3OFQB38JIK"/>
      <description>Marriage of Boucher, William and Fields, Bridget M.</description>
    </event>
    <event handle="_a5af0ed846803a86a86" change="1284030620" id="E2898">
      <type>Marriage</type>
      <place hlink="_QG7KQCWSCNY6E3EW85"/>
      <description>Marriage of Boucher, Thomas and Thompson, Bridget</description>
    </event>
    <event handle="_a5af0ed84a805afd360" change="1284030627" id="E2899">
      <type>Marriage</type>
      <place hlink="_QG7KQCWSCNY6E3EW85"/>
      <description>Marriage of Boucher, Sean and Gardner, Mary</description>
    </event>
    <event handle="_a5af0ed84d042da65ff" change="1284030626" id="E2900">
      <type>Marriage</type>
      <place hlink="_QG7KQCWSCNY6E3EW85"/>
      <description>Marriage of Boucher, Michael and Gil, Nora</description>
    </event>
    <event handle="_a5af0ed84f8224700e0" change="1284030625" id="E2901">
      <type>Marriage</type>
      <dateval val="1960"/>
      <place hlink="_42BLQCC9I44NSIL2KL"/>
      <description>Marriage of Boucher, John and Никитин, Monica</description>
    </event>
    <event handle="_a5af0ed853f1a598cb8" change="1284030626" id="E2902">
      <type>Marriage</type>
      <place hlink="_QG7KQCWSCNY6E3EW85"/>
      <description>Marriage of Boucher, William and Savard, Honora</description>
    </event>
    <event handle="_a5af0ed8575237821e0" change="1284030622" id="E2903">
      <type>Marriage</type>
      <dateval val="1948-07-18"/>
      <place hlink="_0L3LQCM5LWS83W8CCW"/>
      <description>Marriage of Warner, Robert Eugene and Barber, Mary Elizabeth</description>
    </event>
    <event handle="_a5af0ed85a826500044" change="1284030622" id="E2904">
      <type>Marriage</type>
      <dateval val="1952"/>
      <place hlink="_85BLQCTU77993WN9DO"/>
      <description>Marriage of Hansen, Thomas and Boucher, Rose Mary</description>
    </event>
    <event handle="_a5af0ed85de64667622" change="1284030620" id="E2905">
      <type>Marriage</type>
      <place hlink="_PQVJQC7W3OFQB38JIK"/>
      <description>Marriage of Hansen, Noel and Ramirez, Helen</description>
    </event>
    <event handle="_a5af0ed8608638cb634" change="1284030621" id="E2906">
      <type>Marriage</type>
      <place hlink="_T6BLQCTN51ZO3FX6G3"/>
      <description>Marriage of Gardner, Michael and Hansen, Nula</description>
    </event>
    <event handle="_a5af0ed86302a7b7b79" change="1284030624" id="E2907">
      <type>Marriage</type>
      <place hlink="_T6BLQCTN51ZO3FX6G3"/>
      <description>Marriage of Карпов, Damian and Hansen, Irene</description>
    </event>
    <event handle="_a5af0ed865929bd0f1f" change="1284030622" id="E2908">
      <type>Marriage</type>
      <place hlink="_LR2KQCB02SS7CZLE5"/>
      <description>Marriage of Alonso, Joseph and Hansen, Monica</description>
    </event>
    <event handle="_a5af0ed868420a3b552" change="1284030625" id="E2909">
      <type>Marriage</type>
      <description>Marriage of Green, Yelverton and Robertson, Elizabeth</description>
    </event>
    <event handle="_a5af0ed86a760827073" change="1284030624" id="E2910">
      <type>Marriage</type>
      <dateval val="1596"/>
      <place hlink="_QMBLQCJN36MKHQNPLR"/>
      <description>Marriage of Peters, George Sr. and Ramsey, Joan</description>
    </event>
    <event handle="_a5af0ed86d231a421f7" change="1284030625" id="E2911">
      <type>Marriage</type>
      <dateval val="1945-08-25"/>
      <place hlink="_ITUJQCNWD758DUL0L4"/>
      <description>Marriage of Welch, Irwin Arthur and Page, Eleanor Irene</description>
    </event>
    <event handle="_a5af0ed86ff49a7432f" change="1284030624" id="E2912">
      <type>Marriage</type>
      <dateval val="1984-10-13"/>
      <place hlink="_7QXJQCMCF9JVITVX3U"/>
      <description>Marriage of Padilla, Otis Earl and Page, Eleanor Irene</description>
    </event>
    <event handle="_a5af0ed8725302fc0d2" change="1284030625" id="E2913">
      <type>Marriage</type>
      <dateval val="1970-08-15"/>
      <place hlink="_HNBLQCSHV4NMAD2QEB"/>
      <description>Marriage of Welch, Russell Eugene and Norton, Dorothy</description>
    </event>
    <event handle="_a5af0ed8769004abded" change="1284030624" id="E2914">
      <type>Marriage</type>
      <dateval val="1949-06-05"/>
      <place hlink="_AJ3LQC5NPZXXJ3UUFX"/>
      <description>Marriage of Warner, Richard Kenneth and Мельников, Marylou</description>
    </event>
    <event handle="_a5af0ed879d7f0cd037" change="1284030626" id="E2915">
      <type>Marriage</type>
      <dateval val="1982-05-16"/>
      <place hlink="_XNBLQCDZUOZV31BQHP"/>
      <description>Marriage of Welch, Russell Eugene and Walsh, Penelope</description>
    </event>
    <event handle="_a5af0ed87c60efd7fd1" change="1284030625" id="E2916">
      <type>Marriage</type>
      <dateval val="1969-05-19"/>
      <place hlink="_TVYJQCF00VD2THNIVN"/>
      <description>Marriage of Brock, Stephen and Welch, Annabelle Elaine</description>
    </event>
    <event handle="_a5af0ed87f15bd0418a" change="1284030628" id="E2917">
      <type>Marriage</type>
      <dateval val="1977-07-31"/>
      <place hlink="_TVYJQCF00VD2THNIVN"/>
      <description>Marriage of Sánchez, David Andrew and Welch, Rosalie Jane</description>
    </event>
    <event handle="_a5af0ed8820118c559e" change="1284030626" id="E2918">
      <type>Marriage</type>
      <dateval val="1992-09-19"/>
      <place hlink="_77DKQC1ME25F8ZGYZA"/>
      <description>Marriage of Osborne, Paul Daniel and Hawkins, Jennifer Leigh</description>
    </event>
    <event handle="_a5af0ed884c4af9b643" change="1284030625" id="E2919">
      <type>Marriage</type>
      <dateval val="1908-09-01"/>
      <place hlink="_KPTJQCZHFU0ZUVS1R7"/>
      <description>Marriage of Page, Andrew Vincent and Zimmerman, Edith Irene</description>
    </event>
    <event handle="_a5af0ed887d5235344f" change="1284030628" id="E2920">
      <type>Marriage</type>
      <dateval val="1992-09-05"/>
      <place hlink="_BO6LQC5ZJLBEUAHG0Y"/>
      <description>Marriage of Matthews, Mark John and Warner, Andrea Susan</description>
    </event>
    <event handle="_a5af0ed88ab04bb817a" change="1284030627" id="E2921">
      <type>Marriage</type>
      <dateval val="1992-11-07"/>
      <place hlink="_6TBLQC0VXAA4QB3ENS"/>
      <description>Marriage of Garner, Barry Joseph and Vázquez, April Lynn</description>
    </event>
    <event handle="_a5af0ed88d65a9be707" change="1284030625" id="E2922">
      <type>Marriage</type>
      <dateval val="1924-03-04"/>
      <place hlink="_WTBLQCSZ5JWMPX61PI"/>
      <description>Marriage of Boucher, Stephen Francis and Gardner, Mary Jane</description>
    </event>
    <event handle="_a5af0ed8906048f10e3" change="1284030622" id="E2923">
      <type>Marriage</type>
      <dateval val="1880-02-10"/>
      <place hlink="_NUBLQCP4TPF5GSMYES"/>
      <description>Marriage of Boucher, William and Walters, Mary</description>
    </event>
    <event handle="_a5af0ed89597d415833" change="1284030623" id="E2924">
      <type>Marriage</type>
      <place hlink="_41BLQC8BPY79OVRZM5"/>
      <description>Marriage of Myers, James and Boucher, Catherine</description>
    </event>
    <event handle="_a5af0ed898561fad4e6" change="1284030626" id="E2925">
      <type>Marriage</type>
      <dateval val="1950-08-13"/>
      <place hlink="_R3XJQCI5H02TYDZHS8"/>
      <description>Marriage of Walker, Andrew Vincent and Pearson, Eileen Ruth</description>
    </event>
    <event handle="_a5af0ed89b55e820b98" change="1284030623" id="E2926">
      <type>Marriage</type>
      <description>Marriage of Lessard, ??? and Castro, ???</description>
    </event>
    <event handle="_a5af0ed89d77ac38934" change="1284030624" id="E2927">
      <type>Marriage</type>
      <dateval val="1835-05-13"/>
      <place hlink="_JYBLQCPMQ6OMXNUHR5"/>
      <description>Marriage of Domínguez, George and Максимов, Nancy</description>
    </event>
    <event handle="_a5af0ed8a1c288e3b1b" change="1284030622" id="E2928">
      <type>Marriage</type>
      <dateval val="1936-12-16"/>
      <place hlink="_20CLQCNUJKQ2K8ILTL"/>
      <description>Marriage of Page, Vernett Gail and Norman, Dorothy Louise</description>
    </event>
    <event handle="_a5af0ed8a5148602044" change="1284030626" id="E2929">
      <type>Marriage</type>
      <dateval val="1976-08-09"/>
      <place hlink="_M8ZJQCCKTBLRRPKLOU"/>
      <description>Marriage of Page, Dwayne Alan and Scott, Cheryl Lee</description>
    </event>
    <event handle="_a5af0ed8a815c311481" change="1284030627" id="E2930">
      <type>Marriage</type>
      <description>Marriage of Boucher, Roger Joseph and Page, Sylvia Louise</description>
    </event>
    <event handle="_a5af0ed8aa86592365b" change="1284030625" id="E2931">
      <type>Marriage</type>
      <place hlink="_K3CLQC5F9SA8N3L3ZF"/>
      <description>Marriage of Page, Marvin Ray and Morton, Gail Darlene</description>
    </event>
    <event handle="_a5af0ed8adc3b043892" change="1284030623" id="E2932">
      <type>Marriage</type>
      <description>Marriage of Cobb, Merrick and Boucher, Cynthia Louise</description>
    </event>
    <event handle="_a5af0ed8af928b04524" change="1284030620" id="E2933">
      <type>Marriage</type>
      <description>Marriage of Boucher, Steven Joseph and Nelson, Arlene</description>
    </event>
    <event handle="_a5af0ed8b191f6b805f" change="1284030623" id="E2934">
      <type>Marriage</type>
      <description>Marriage of Woźniak, Thomas and Page, Debra Dale</description>
    </event>
    <event handle="_a5af0ed8b38799a1793" change="1284030626" id="E2935">
      <type>Marriage</type>
      <description>Marriage of Evans, ?m.MaryJane and Rhodes, Mary Jane</description>
    </event>
    <event handle="_a5af0ed8b5a3134cffb" change="1284030627" id="E2936">
      <type>Marriage</type>
      <dateval val="1948-09-07"/>
      <place hlink="_HQZKQC4A1B4IB1OKKG"/>
      <description>Marriage of Данилов, Earl William and Lessard, Dorothy Louise</description>
    </event>
    <event handle="_a5af0ed8b903147cbef" change="1284030627" id="E2937">
      <type>Marriage</type>
      <description>Marriage of Collins, Loren and Rhodes, Mary Jane</description>
    </event>
    <event handle="_a5af0ed8bad0a6a21da" change="1284030626" id="E2938">
      <type>Marriage</type>
      <description>Marriage of Evans, James Patrick and Stevenson, Susan</description>
    </event>
    <event handle="_a5af0ed8bee45f98460" change="1284030624" id="E2939">
      <type>Marriage</type>
      <dateval val="1975-02-08"/>
      <place hlink="_5HTJQCSB91P69HY731"/>
      <description>Marriage of Сергеев, Dennis and Garner, Kathryn Mary</description>
    </event>
    <event handle="_a5af0ed8c21488d9451" change="1284030627" id="E2940">
      <type>Marriage</type>
      <description>Marriage of Blanco, Gerhard and Белоусов, Catharine</description>
    </event>
    <event handle="_a5af0ed8c4f3c859517" change="1284030622" id="E2941">
      <type>Marriage</type>
      <dateval val="1771-12-31"/>
      <place hlink="_29CLQCS8LD2Q52Z0NU"/>
      <description>Marriage of Blanco, Peter and Glover, Elizabeth</description>
    </event>
    <event handle="_a5af0ed8c92698a1371" change="1284030623" id="E2942">
      <type>Marriage</type>
      <dateval val="1799-07-04"/>
      <place hlink="_TW4KQC1I7Z129AZKZE"/>
      <description>Marriage of Blanco, John Sr. and Lucas, Christina</description>
    </event>
    <event handle="_a5af0ed8cd21b312e12" change="1284030626" id="E2943">
      <type>Marriage</type>
      <dateval val="1804-08"/>
      <place hlink="_PG4KQCOL28MRI43UQ5"/>
      <description>Marriage of Rodriquez, William M. and Douglas, Mary&quot;Polly&quot;</description>
    </event>
    <event handle="_a5af0ed8d1b64c863ed" change="1284030623" id="E2944">
      <type>Marriage</type>
      <place hlink="_2I7KQCJD4JT1SKXVGC"/>
      <description>Marriage of Blanco, Hans(Johannes) and Sullivan, Anna</description>
    </event>
    <event handle="_a5af0ed8d491f41b6a0" change="1284030624" id="E2945">
      <type>Marriage</type>
      <dateval val="1676-06-15"/>
      <place hlink="_2I7KQCJD4JT1SKXVGC"/>
      <description>Marriage of Blanco, Heinrich and Schmidt, Barbli</description>
    </event>
    <event handle="_a5af0ed8d724420393c" change="1284030622" id="E2946">
      <type>Marriage</type>
      <dateval val="1603"/>
      <description>Marriage of Blanco, Hans and Buchanan, Elsbeth</description>
    </event>
    <event handle="_a5af0ed8d957befc92a" change="1284030622" id="E2947">
      <type>Marriage</type>
      <dateval val="1959-09-13"/>
      <place hlink="_RIXJQCEANQB26N0ZWF"/>
      <description>Marriage of Osborne, Dwight Billington and Lessard, Mary Alice</description>
    </event>
    <event handle="_a5af0ed8dc03e42b7c5" change="1284030627" id="E2948">
      <type>Marriage</type>
      <dateval val="1580-11-03"/>
      <description>Marriage of Blanco, Bendicht and Fisher, Bendichtli</description>
    </event>
    <event handle="_a5af0ed8de35f05f893" change="1284030625" id="E2949">
      <type>Marriage</type>
      <dateval val="1630-06"/>
      <description>Marriage of Austin, Hans and Burke, Maria</description>
    </event>
    <event handle="_a5af0ed8e0874da79db" change="1284030622" id="E2950">
      <type>Marriage</type>
      <dateval val="1629-02-20"/>
      <description>Marriage of Jenkins, Peter and Marsh, Margaret</description>
    </event>
    <event handle="_a5af0ed8e2a26f85fa1" change="1284030623" id="E2951">
      <type>Marriage</type>
      <dateval val="1652-07-02"/>
      <description>Marriage of Austin, Johannas and Jenkins, Margaret</description>
    </event>
    <event handle="_a5af0ed8e4c23f0bc1c" change="1284030622" id="E2952">
      <type>Marriage</type>
      <description>Marriage of Reid, Hans and Семенов, Cathern</description>
    </event>
    <event handle="_a5af0ed8e78673c96c5" change="1284030622" id="E2953">
      <type>Marriage</type>
      <dateval val="1680-01-12"/>
      <description>Marriage of Белоусов, Jacob and Suárez, Marie</description>
    </event>
    <event handle="_a5af0ed8e9d1ebb8a9f" change="1284030623" id="E2954">
      <type>Marriage</type>
      <dateval val="1691-05-11"/>
      <description>Marriage of Fortin, Matthias and Baker, Margaret</description>
    </event>
    <event handle="_a5af0ed8ebe0aec805b" change="1284030625" id="E2955">
      <type>Marriage</type>
      <dateval val="1715-12-09"/>
      <description>Marriage of Белоусов, Johannas Jacob and Reid, Anna Catherina</description>
    </event>
    <event handle="_a5af0ed8ee03972bdd5" change="1284030627" id="E2956">
      <type>Marriage</type>
      <place hlink="_ENCLQCKQ8U0SMUNFOE"/>
      <description>Marriage of Marín, William and Francis, Elizabeth</description>
    </event>
    <event handle="_a5af0ed8f0d6f99ab6f" change="1284030623" id="E2957">
      <type>Marriage</type>
      <dateval val="0005"/>
      <place hlink="_LDCKQCE4DKN9V1L8FC"/>
      <description>Marriage of Schultz, Rev.Isaac and Turner, Mary</description>
    </event>
    <event handle="_a5af0ed8f377ba31bcd" change="1284030623" id="E2958">
      <type>Marriage</type>
      <dateval val="1950-04-16"/>
      <place hlink="_HQZKQC4A1B4IB1OKKG"/>
      <description>Marriage of Warner, George Edward and Lessard, Elinor Jane</description>
    </event>
    <event handle="_a5af0ed8f893f53f510" change="1284030627" id="E2959">
      <type>Marriage</type>
      <dateval val="1977-08-18"/>
      <description>Marriage of Warner, Richard Kenneth and Wade, Joy A.</description>
    </event>
    <event handle="_a5af0ed8fa73b082259" change="1284030622" id="E2960">
      <type>Marriage</type>
      <dateval val="1811-06-21"/>
      <place hlink="_NXUKQCAAQRP16CLV56"/>
      <description>Marriage of Schultz, John and Payne, Jane Coppage</description>
    </event>
    <event handle="_a5af0ed8fdb63789c06" change="1284030621" id="E2961">
      <type>Marriage</type>
      <dateval val="1725"/>
      <place hlink="_OA2KQCYIJJ66RYG1L3"/>
      <description>Marriage of Brooks, Major Marquis II and Rubio, Winifred</description>
    </event>
    <event handle="_a5af0ed9004108236c4" change="1284030623" id="E2962">
      <type>Marriage</type>
      <description>Marriage of Payne, Leonard and Hall, Elizabeth</description>
    </event>
    <event handle="_a5af0ed902833ad3b01" change="1284030623" id="E2963">
      <type>Marriage</type>
      <dateval val="0046"/>
      <place hlink="_WPCLQC5Q6DBJDBNLG7"/>
      <description>Marriage of Payne, Leonard? and Brooks, Elizabeth&quot;Betty&quot;</description>
    </event>
    <event handle="_a5af0ed905801485b35" change="1284030621" id="E2964">
      <type>Marriage</type>
      <dateval val="1759"/>
      <place hlink="_PXCKQC67X6CLKZDKQN"/>
      <description>Marriage of Дмитриев, Moses Aaron and Reynolds, Mary Jane</description>
    </event>
    <event handle="_a5af0ed909b46624278" change="1284030625" id="E2965">
      <type>Marriage</type>
      <dateval val="1783-12-15"/>
      <place hlink="_NXUKQCAAQRP16CLV56"/>
      <description>Marriage of Payne, George and Diaz, Frances</description>
    </event>
    <event handle="_a5af0ed90dc581573ca" change="1284030624" id="E2966">
      <type>Marriage</type>
      <description>Marriage of Шестаков, George and Daniels, Phoebe</description>
    </event>
    <event handle="_a5af0ed91123ca5f530" change="1284030624" id="E2967">
      <type>Marriage</type>
      <dateval val="1840-04-04"/>
      <description>Marriage of Martel, Henry and Hébert, Ruth Ann</description>
    </event>
    <event handle="_a5af0ed91395e4a21e5" change="1284030628" id="E2968">
      <type>Marriage</type>
      <dateval val="1993-11-27"/>
      <place hlink="_C1DLQC18G5VQH8WCRA"/>
      <description>Marriage of Жуков, Curtis Dale and Gordon, Heather Kathleen</description>
    </event>
    <event handle="_a5af0ed916473f04dd5" change="1284030624" id="E2969">
      <type>Marriage</type>
      <dateval val="1993"/>
      <place hlink="_DV6LQCVE0C3I6291BA"/>
      <description>Marriage of Willis, Corey and Poirier, Janelle Marie</description>
    </event>
    <event handle="_a5af0ed919472b0fc70" change="1284030626" id="E2970">
      <type>Marriage</type>
      <description>Marriage of Garner, Eugene Stanley, Jr. and Pelletier, Josephine</description>
    </event>
    <event handle="_a5af0ed91d95164adea" change="1284030626" id="E2971">
      <type>Marriage</type>
      <dateval val="1983-12-17"/>
      <description>Marriage of Warner, Robert Douglas and Norton, Christina</description>
    </event>
    <event handle="_a5af0ed922f4c6943ac" change="1284030622" id="E2972">
      <type>Marriage</type>
      <description>Marriage of Warner, Thomas Frederick and Carter, Debra J.</description>
    </event>
    <event handle="_a5af0ed925777338d34" change="1284030628" id="E2973">
      <type>Marriage</type>
      <dateval val="1977-06-04"/>
      <place hlink="_NBWJQCIYV2JLHBOOXI"/>
      <description>Marriage of Warner, Stephen Paul and Худоногов, Patricia</description>
    </event>
    <event handle="_a5af0ed927a481753fc" change="1284030623" id="E2974">
      <type>Marriage</type>
      <description>Marriage of Diaz, William and Baldwin, Anne</description>
    </event>
    <event handle="_a5af0ed92a9675469e3" change="1284030622" id="E2975">
      <type>Marriage</type>
      <description>Marriage of Дмитриев, Charles Sr. and Lapointe, Lucy aka Sarah</description>
    </event>
    <event handle="_a5af0ed92e309136132" change="1284030625" id="E2976">
      <type>Marriage</type>
      <place hlink="_QG7KQCWSCNY6E3EW85"/>
      <description>Marriage of Howell, John and Yates, Sarah</description>
    </event>
    <event handle="_a5af0ed930a4a4e2e60" change="1284030626" id="E2977">
      <type>Marriage</type>
      <place hlink="_QG7KQCWSCNY6E3EW85"/>
      <description>Marriage of Webb, Andrew and Webb, Margaret Margarite?</description>
    </event>
    <event handle="_a5af0ed935409fa92a3" change="1284030627" id="E2978">
      <type>Marriage</type>
      <description>Marriage of Delgado and Tyler, Mary A.</description>
    </event>
    <event handle="_a5af0ed937b7712aeca" change="1284030620" id="E2979">
      <type>Marriage</type>
      <dateval val="1845-01-23"/>
      <place hlink="_3DDLQCSY6Z8TX19GOK"/>
      <description>Marriage of Webb, Alexander and Delgado, Mary Ann</description>
    </event>
    <event handle="_a5af0ed93b64392e085" change="1284030626" id="E2980">
      <type>Marriage</type>
      <description>Marriage of Douglas, Frederick and Stanley, Barbara</description>
    </event>
    <event handle="_a5af0ed93da0ffefd98" change="1284030623" id="E2981">
      <type>Marriage</type>
      <dateval val="1973-09-15"/>
      <place hlink="_5HTJQCSB91P69HY731"/>
      <description>Marriage of Hale, Lawrence Paul and Garner, Anne Therese</description>
    </event>
    <event handle="_a5af0ed940f2c97046f" change="1284030622" id="E2982">
      <type>Marriage</type>
      <description>Marriage of Sanders, Henry and Rose, Ann</description>
    </event>
    <event handle="_a5af0ed942f1ad9c659" change="1284030622" id="E2983">
      <type>Marriage</type>
      <dateval val="1615"/>
      <place hlink="_FAGKQCBVRX0ST97E99"/>
      <description>Marriage of Foster, Thomas and Spencer, Ann</description>
    </event>
    <event handle="_a5af0ed945911b0f6e4" change="1284030625" id="E2984">
      <type>Marriage</type>
      <description>Marriage of Warner, Thomas and Black, Jane</description>
    </event>
    <event handle="_a5af0ed947d37868e29" change="1284030625" id="E2985">
      <type>Marriage</type>
      <description>Marriage of Christiansen, Edward and Abbott, Frances</description>
    </event>
    <event handle="_a5af0ed949b36a66c25" change="1284030625" id="E2986">
      <type>Marriage</type>
      <description>Marriage of Jones, Hugh and Кириллов, ??</description>
    </event>
    <event handle="_a5af0ed94ba3f934c00" change="1284030622" id="E2987">
      <type>Marriage</type>
      <place hlink="_JF3KQCQTREIXBOPWV"/>
      <description>Marriage of Christiansen, Christopher and Jones, Ann</description>
    </event>
    <event handle="_a5af0ed94f6546dc0e7" change="1284030627" id="E2988">
      <type>Marriage</type>
      <description>Marriage of Смирнов, Eudo and Rios, Agnes</description>
    </event>
    <event handle="_a5af0ed951b228dbec6" change="1284030626" id="E2989">
      <type>Marriage</type>
      <description>Marriage of Смирнов, Ribald and Gray, Beatrix</description>
    </event>
    <event handle="_a5af0ed953e73708adc" change="1284030626" id="E2990">
      <type>Marriage</type>
      <description>Marriage of Пономарев, Ralph and Rodríguez, Agatha</description>
    </event>
    <event handle="_a5af0ed957c6794cd03" change="1284030627" id="E2991">
      <type>Marriage</type>
      <description>Marriage of Hanson, Robert and Schwartz, Helewisa</description>
    </event>
    <event handle="_a5af0ed959d396bc61b" change="1284030621" id="E2992">
      <type>Marriage</type>
      <dateval val="1979-01-06"/>
      <place hlink="_ED3LQCTE2LONLAGNON"/>
      <description>Marriage of Garner, Gerard Stephen and George, Elizabeth</description>
    </event>
    <event handle="_a5af0ed95d15d8cce19" change="1284030623" id="E2993">
      <type>Marriage</type>
      <description>Marriage of Knudsen, Robert and Schwartz, Helewisa</description>
    </event>
    <event handle="_a5af0ed95f06a722453" change="1284030625" id="E2994">
      <type>Marriage</type>
      <description>Marriage of Knudsen, Ranulf and Huff, Bertrama</description>
    </event>
    <event handle="_a5af0ed96145c9c4f88" change="1284030621" id="E2995">
      <type>Marriage</type>
      <description>Marriage of Foster, John and Ryan, Elizabeth</description>
    </event>
    <event handle="_a5af0ed96341dd6da16" change="1284030626" id="E2996">
      <type>Marriage</type>
      <description>Marriage of Knudsen, Ralph and Walton, Theophania(Tiffany)</description>
    </event>
    <event handle="_a5af0ed96577288eefe" change="1284030624" id="E2997">
      <type>Marriage</type>
      <description>Marriage of Knudsen, Ralph and Huff, Isabel</description>
    </event>
    <event handle="_a5af0ed967a1bd9c7ea" change="1284030627" id="E2998">
      <type>Marriage</type>
      <dateval val="1343-10"/>
      <description>Marriage of Knudsen, John and Huff, Isabel</description>
    </event>
    <event handle="_a5af0ed96975f75e135" change="1284030621" id="E2999">
      <type>Marriage</type>
      <description>Marriage of Massey, John and Мальцев, Joan</description>
    </event>
    <event handle="_a5af0ed96bb70058159" change="1284030622" id="E3000">
      <type>Marriage</type>
      <dateval val="1514"/>
      <place hlink="_SODLQCC9QHB6FTVM4G"/>
      <description>Marriage of Christiansen, Christopher and Gomez, Jane Joane</description>
    </event>
    <event handle="_a5af0ed96e8332762e7" change="1284030623" id="E3001">
      <type>Marriage</type>
      <dateval val="1551"/>
      <place hlink="_VTDKQCYD3SP7P8TPUM"/>
      <description>Marriage of Foster, Thomas and Kozłowski, Margret</description>
    </event>
    <event handle="_a5af0ed970e26dc6c05" change="1284030623" id="E3002">
      <type>Marriage</type>
      <dateval val="1991-06-22"/>
      <description>Marriage of Garner, Francis William and Gibbs, Connie</description>
    </event>
    <event handle="_a5af0ed97325e2f2b44" change="1284030623" id="E3003">
      <type>Marriage</type>
      <dateval val="1920-06-23"/>
      <place hlink="_MATJQCJYH8ULRIRYTH"/>
      <description>Marriage of Marín, Walter Matthew and Boucher, Mary Cecilia</description>
    </event>
    <event handle="_a5af0ed97602bc0d3f6" change="1284030622" id="E3004">
      <type>Marriage</type>
      <description>Marriage of Martín and Garner, Melissa Sue</description>
    </event>
    <event handle="_a5af0ed977f3ce3c59b" change="1284030627" id="E3005">
      <type>Marriage</type>
      <dateval val="1971-10-23"/>
      <description>Marriage of Garner, Richard Eugene and Gibbs, Elaine</description>
    </event>
    <event handle="_a5af0ed97ba66fb445f" change="1284030626" id="E3006">
      <type>Marriage</type>
      <description>Marriage of Garner, Jason Richard and Harper, ??</description>
    </event>
    <event handle="_a5af0ed97e001106609" change="1284030627" id="E3007">
      <type>Marriage</type>
      <dateval val="1970-08-08"/>
      <description>Marriage of Garner, Michael Stanley and Gibbs, Sharon</description>
    </event>
    <event handle="_a5af0ed980512174a5c" change="1284030622" id="E3008">
      <type>Marriage</type>
      <description>Marriage of Díez, William George and Garner, Barbara Jo</description>
    </event>
    <event handle="_a5af0ed98257486afda" change="1284030624" id="E3009">
      <type>Marriage</type>
      <dateval val="1993-06"/>
      <description>Marriage of Demers, ?? and Сергеев, Adria Maria</description>
    </event>
    <event handle="_a5af0ed984657d570bb" change="1284030626" id="E3010">
      <type>Marriage</type>
      <dateval val="1976-01-25"/>
      <description>Marriage of Garner, Peter George and Gibbs, Joy</description>
    </event>
    <event handle="_a5af0ed986d2c27f076" change="1284030621" id="E3011">
      <type>Marriage</type>
      <description>Marriage of Hill and Garner, Louella Marie</description>
    </event>
    <event handle="_a5af0ed989821d91fb6" change="1284030623" id="E3012">
      <type>Marriage</type>
      <dateval val="1994-03-04"/>
      <description>Marriage of Garner, John Joseph and Crawford, Lori</description>
    </event>
    <event handle="_a5af0ed98b711a5f341" change="1284030627" id="E3013">
      <type>Marriage</type>
      <dateval val="1991-12-02"/>
      <description>Marriage of Garner, Mark Gerard and Gibbs, Lori</description>
    </event>
    <event handle="_a5af0ed98d5405063f1" change="1284030626" id="E3014">
      <type>Marriage</type>
      <dateval val="1885-10-15"/>
      <place hlink="_MATJQCJYH8ULRIRYTH"/>
      <description>Marriage of Marín, Moses Wallace and Landry, Eleanor (Nellie) Therese</description>
    </event>
    <event handle="_a5af0ed99142af58931" change="1284030621" id="E3015">
      <type>Marriage</type>
      <description>Marriage of Mullins, Robert? and Houston, Ellender</description>
    </event>
    <event handle="_a5af0ed99361dbc3ac2" change="1284030622" id="E3016">
      <type>Marriage</type>
      <dateval val="1994-03-04"/>
      <description>Marriage of Christensen, William and Cruz, Judy Denise</description>
    </event>
    <event handle="_a5af0ed995601462c9a" change="1284030621" id="E3017">
      <type>Marriage</type>
      <description>Marriage of Holloway, John(?) and Орлов, Margaret(?)</description>
    </event>
    <event handle="_a5af0ed99764f3c10a6" change="1284030626" id="E3018">
      <type>Marriage</type>
      <dateval val="1820-02-13"/>
      <place hlink="_9YDLQCK6XNKWF0FS4T"/>
      <description>Marriage of Fernandez, Thomas and Holloway, Sarah</description>
    </event>
    <event handle="_a5af0ed99a3396b5224" change="1284030621" id="E3019">
      <type>Marriage</type>
      <dateval val="1996-05-11"/>
      <place hlink="_D4FKQC3AYLAMRECEQV"/>
      <description>Marriage of Weaver, Steven Matthew and Warner, JenniferMae(Ganoe)</description>
    </event>
    <event handle="_a5af0ed99cd47ded020" change="1284030622" id="E3020">
      <type>Marriage</type>
      <dateval val="1727"/>
      <place hlink="_352KQCGTU2Z9J8KQLM"/>
      <description>Marriage of Ball, Ezekiel and Reese</description>
    </event>
    <event handle="_a5af0ed99f63ffc3754" change="1284030626" id="E3021">
      <type>Marriage</type>
      <dateval val="1989-08-05"/>
      <place hlink="_ZYDLQCJGVZKNNG0ARL"/>
      <description>Marriage of Welch, Christopher Paul and Hayes, LeAnn</description>
    </event>
    <event handle="_a5af0ed9a2455d0c47b" change="1284030622" id="E3022">
      <type>Marriage</type>
      <dateval val="1996-08-10"/>
      <place hlink="_RNWJQCB4BV3G9OJQRS"/>
      <description>Marriage of Graham, Steve and Cruz, Laura Joy</description>
    </event>
    <event handle="_a5af0ed9a5b7746323a" change="1284030620" id="E3023">
      <type>Marriage</type>
      <dateval val="1995-06-24"/>
      <place hlink="_K97LQC6EB42OCMEE9D"/>
      <description>Marriage of Townsend, Mark and Максимов, Heather Michelle</description>
    </event>
    <event handle="_a5af0ed9a8354b046c5" change="1284030625" id="E3024">
      <type>Marriage</type>
      <dateval val="1990"/>
      <place hlink="_HYWJQCL563RRLWZ4DB"/>
      <description>Marriage of Wilson, Douglas and Cruz, Marsha Ann</description>
    </event>
    <event handle="_a5af0ed9aa866455ae7" change="1284030624" id="E3025">
      <type>Marriage</type>
      <dateval val="1860-10"/>
      <place hlink="_SW2LQCK39IK9IAGCXE"/>
      <description>Marriage of Marín, Alfred Franklin(Frank) and Floyd, Martha Frances &quot;Fannie&quot;</description>
    </event>
    <event handle="_a5af0ed9ade6b3a5c4c" change="1284030625" id="E3026">
      <type>Marriage</type>
      <dateval val="1995-03-11"/>
      <place hlink="_OD7LQCVU3HU64T046A"/>
      <description>Marriage of Alvarado, Jeffery and Cruz, Patti Jo</description>
    </event>
    <event handle="_a5af0ed9b0576b81091" change="1284030628" id="E3027">
      <type>Marriage</type>
      <description>Marriage of Brooks, William Waller and Васильев, Lucy</description>
    </event>
    <event handle="_a5af0ed9b41513effa2" change="1284030626" id="E3028">
      <type>Marriage</type>
      <description>Marriage of Brooks, Marquis I and Guzman, Isabella</description>
    </event>
    <event handle="_a5af0ed9b64409f5fbc" change="1284030626" id="E3029">
      <type>Marriage</type>
      <dateval val="1834-06-08"/>
      <place hlink="_F53LQCZPUR0J9OMEWL"/>
      <description>Marriage of Riley, Thomas and Edwards, Lucy</description>
    </event>
    <event handle="_a5af0ed9ba572456711" change="1284030620" id="E3030">
      <type>Marriage</type>
      <dateval val="1907-06-02"/>
      <description>Marriage of Garner, Daniel Webster and Jackson, Cora Ellen</description>
    </event>
    <event handle="_a5af0ed9bc363b8ec17" change="1284030620" id="E3031">
      <type>Marriage</type>
      <dateval val="1875-10-07"/>
      <place hlink="_RF5KQCNJRQY8OGTX2H"/>
      <description>Marriage of Ramírez, John B. and Garner, Rebecca Catharine</description>
    </event>
    <event handle="_a5af0ed9be42bbd5fed" change="1284030623" id="E3032">
      <type>Marriage</type>
      <dateval val="1875-02-04"/>
      <place hlink="_KM5KQCUCSE1OUA3X7"/>
      <description>Marriage of Floyd, John Morgan and Carr, Zelpha Josephine</description>
    </event>
    <event handle="_a5af0ed9c0e53838904" change="1284030626" id="E3033">
      <type>Marriage</type>
      <dateval val="1879-09-17"/>
      <place hlink="_U3ELQCXO8AIM6TD5G4"/>
      <description>Marriage of Ford, Stephen Jacob and Garner, Iola Elizabeth Betty</description>
    </event>
    <event handle="_a5af0ed9c3a36e94db6" change="1284030627" id="E3034">
      <type>Marriage</type>
      <dateval val="1880-11-25"/>
      <place hlink="_RF5KQCNJRQY8OGTX2H"/>
      <description>Marriage of Garner, Robert F. and Cannon, Mary Jane</description>
    </event>
    <event handle="_a5af0ed9c5c28de7dd5" change="1284030624" id="E3035">
      <type>Marriage</type>
      <dateval val="1875-04-11"/>
      <place hlink="_VX1LQC7OJLP2KWZT2Q"/>
      <description>Marriage of Boucher, William Bernard and Reeves, Maria</description>
    </event>
    <event handle="_a5af0ed9c98623265a4" change="1284030623" id="E3036">
      <type>Marriage</type>
      <dateval val="1888-08-23"/>
      <place hlink="_PYFKQC1S13QD6Z7KV2"/>
      <description>Marriage of Parker, Frank R. and Garner, Anetta</description>
    </event>
    <event handle="_a5af0ed9cbd3b316c8a" change="1284030625" id="E3037">
      <type>Marriage</type>
      <place hlink="_M76LQC1OGCBJ66LYCI"/>
      <description>Marriage of Wheeler, Don and Лопатин, Carmen Diana</description>
    </event>
    <event handle="_a5af0ed9ce920f84911" change="1284030621" id="E3038">
      <type>Marriage</type>
      <dateval val="1879-07-25"/>
      <place hlink="_Z4ELQCM1PJR46H9P62"/>
      <description>Marriage of Reed, Edward and Reed, Ellen</description>
    </event>
    <event handle="_a5af0ed9d2423a6c969" change="1284030622" id="E3039">
      <type>Marriage</type>
      <description>Marriage of Kristensen, John Francis&quot;Chick&quot; and 伊藤, Mary</description>
    </event>
    <event handle="_a5af0ed9d40088587f5" change="1284030624" id="E3040">
      <type>Marriage</type>
      <dateval val="1937"/>
      <description>Marriage of Jordan, William and Reed, Frances Lucille (Babe)</description>
    </event>
    <event handle="_a5af0ed9d5e2eabde07" change="1284030623" id="E3041">
      <type>Marriage</type>
      <dateval val="1903"/>
      <description>Marriage of Reed, Francis Vincent and Казанцев, Katherine</description>
    </event>
    <event handle="_a5af0ed9d7c07cedcf0" change="1284030623" id="E3042">
      <type>Marriage</type>
      <description>Marriage of Garner, Eugene Stanley, Jr. and Washington, Pearline</description>
    </event>
    <event handle="_a5af0ed9d9b359e45aa" change="1284030626" id="E3043">
      <type>Marriage</type>
      <dateval val="1881-08-15"/>
      <description>Marriage of Dean, John and Reed, Catherine</description>
    </event>
    <event handle="_a5af0ed9dbc490ddee7" change="1284030625" id="E3044">
      <type>Marriage</type>
      <dateval val="1870-05-24"/>
      <description>Marriage of Reed, John and Bernier, Margaret</description>
    </event>
    <event handle="_a5af0ed9ddc2c078bda" change="1284030622" id="E3045">
      <type>Marriage</type>
      <dateval val="1610-10-10"/>
      <place hlink="_5AGKQCJBVO185NHDZA"/>
      <description>Marriage of Lefebvre, Rev. John L. and Kowalski, Hannah</description>
    </event>
    <event handle="_a5af0ed9e02354d41e5" change="1284030620" id="E3046">
      <type>Marriage</type>
      <place hlink="_HY2LQC6E6Z1YLCN0V4"/>
      <description>Marriage of Boucher, Michael and Boucher, Honora</description>
    </event>
    <event handle="_a5af0ed9e3f6f82ae19" change="1284030623" id="E3047">
      <type>Marriage</type>
      <place hlink="_BHFKQCC980LRN6HMQP"/>
      <description>Marriage of Kowalski, John and Wells, Alice</description>
    </event>
    <event handle="_a5af0ed9e667be37870" change="1284030622" id="E3048">
      <type>Marriage</type>
      <place hlink="_L5GKQCK8A9XTAHXBUR"/>
      <description>Marriage of Kowalski, Thomas and Santos, Alice</description>
    </event>
    <event handle="_a5af0ed9e8a6abc1119" change="1284030626" id="E3049">
      <type>Marriage</type>
      <place hlink="_OFGKQC9VTT55S65K8L"/>
      <description>Marriage of Sanchez, John and Curtis, Margaret</description>
    </event>
    <event handle="_a5af0ed9eaf0df94aab" change="1284030623" id="E3050">
      <type>Marriage</type>
      <place hlink="_OFGKQC9VTT55S65K8L"/>
      <description>Marriage of Curtis, John and Gibbs, Margaret</description>
    </event>
    <event handle="_a5af0ed9ed61c1a3e64" change="1284030622" id="E3051">
      <type>Marriage</type>
      <place hlink="_BHFKQCC980LRN6HMQP"/>
      <description>Marriage of Molina, Robert</description>
    </event>
    <event handle="_a5af0ed9efe076999b2" change="1284030621" id="E3052">
      <type>Marriage</type>
      <description>Marriage of James, Robert and Pratt, Sarah</description>
    </event>
    <event handle="_a5af0ed9f1d32089a51" change="1284030622" id="E3053">
      <type>Marriage</type>
      <description>Marriage of Reynolds, David and Vaughn, Mary Meriwether</description>
    </event>
    <event handle="_a5af0ed9f3e7a5d659c" change="1284030623" id="E3054">
      <type>Marriage</type>
      <dateval val="1665"/>
      <description>Marriage of Reynolds, Nicholas and Murray, Susannah</description>
    </event>
    <event handle="_a5af0ed9f6203419111" change="1284030625" id="E3055">
      <type>Marriage</type>
      <dateval val="1663"/>
      <place hlink="_0OGKQCANVA8UAXF103"/>
      <description>Marriage of Reynolds, Col. John and Mazur, Elizabeth</description>
    </event>
    <event handle="_a5af0ed9f8d17bb0002" change="1284030620" id="E3056">
      <type>Marriage</type>
      <description>Marriage of Mazur, William and Crawford, Margaret</description>
    </event>
    <event handle="_a5af0ed9fc0530873dc" change="1284030625" id="E3057">
      <type>Marriage</type>
      <dateval val="1968-11-16"/>
      <place hlink="_M8ZJQCCKTBLRRPKLOU"/>
      <description>Marriage of Warner, David Warren and Simpson, Geraldine Ann</description>
    </event>
    <event handle="_a5af0ed9feb6e614c2f" change="1284030621" id="E3058">
      <type>Marriage</type>
      <dateval val="1623-04-10"/>
      <description>Marriage of Reynolds, John and Ковалев, Sarah</description>
    </event>
    <event handle="_a5af0eda00e5cb969c3" change="1284030622" id="E3059">
      <type>Marriage</type>
      <dateval val="1624" type="after"/>
      <description>Marriage of Elliott, Lodowick and Ковалев, Sarah</description>
    </event>
    <event handle="_a5af0eda030521d262c" change="1284030622" id="E3060">
      <type>Marriage</type>
      <dateval val="1590-11-01"/>
      <place hlink="_LSGKQC8BMJ46Q421G7"/>
      <description>Marriage of Goodman, Ralph and Powell, Martha</description>
    </event>
    <event handle="_a5af0eda0580069ab70" change="1284030624" id="E3061">
      <type>Marriage</type>
      <dateval val="1588-10-29"/>
      <description>Marriage of Reynolds, John and Stevens, Elizabeth</description>
    </event>
    <event handle="_a5af0eda07c41a27261" change="1284030628" id="E3062">
      <type>Marriage</type>
      <place hlink="_BCDKQCHQD7I9G8MD2F"/>
      <description>Marriage of Дмитриев, William and Page, Sarah</description>
    </event>
    <event handle="_a5af0eda0a55e0a8b57" change="1284030624" id="E3063">
      <type>Marriage</type>
      <description>Marriage of Bédard, Swanson and Дмитриев, Mary</description>
    </event>
    <event handle="_a5af0eda0c51c5beef3" change="1284030626" id="E3064">
      <type>Marriage</type>
      <description>Marriage of Erickson, Charles and Дмитриев, Lucy</description>
    </event>
    <event handle="_a5af0eda0e501da41e6" change="1284030625" id="E3065">
      <type>Marriage</type>
      <dateval val="1640" type="about"/>
      <place hlink="_C2HKQC0FWU7FQ0RKFE"/>
      <description>Marriage of Bishop, Quirinus and Simmons, Maria</description>
    </event>
    <event handle="_a5af0eda10c713e4196" change="1284030622" id="E3066">
      <type>Marriage</type>
      <description>Marriage of Webster, Conrad and Castillo, Margaretha</description>
    </event>
    <event handle="_a5af0eda157458cb734" change="1284030626" id="E3067">
      <type>Marriage</type>
      <description>Marriage of Lapointe, John and Madsen, Catherine</description>
    </event>
    <event handle="_a5af0eda17877bd8158" change="1284030623" id="E3068">
      <type>Marriage</type>
      <dateval val="1888-08-09"/>
      <place hlink="_E11LQCR2BXEB2EW7B4"/>
      <description>Marriage of Warner, Warren W. and Ball, Abigail</description>
    </event>
    <event handle="_a5af0eda1b00fc1e438" change="1284030623" id="E3069">
      <type>Marriage</type>
      <dateval val="1928-01-21"/>
      <place hlink="_5HTJQCSB91P69HY731"/>
      <description>Marriage of Russell, Norman and Lessard, Helen Belle</description>
    </event>
    <event handle="_a5af0eda1ee6076f25e" change="1284030623" id="E3070">
      <type>Marriage</type>
      <description>Marriage of Baldwin, Peter and Никифоров</description>
    </event>
    <event handle="_a5af0eda21647b0dbfa" change="1284030623" id="E3071">
      <type>Marriage</type>
      <description>Marriage of Diaz, William and Комаров, Jane</description>
    </event>
    <event handle="_a5af0eda2337706c1fb" change="1284030626" id="E3072">
      <type>Marriage</type>
      <description>Marriage of Swanson, William and Jensen, Elizabeth</description>
    </event>
    <event handle="_a5af0eda28600c3f848" change="1284030627" id="E3073">
      <type>Marriage</type>
      <dateval val="1605-05-27"/>
      <place hlink="_JKELQCOEHOJDAY37X4"/>
      <description>Marriage of Swanson, Richard and El Fernández, Avis Fernandez III</description>
    </event>
    <event handle="_a5af0eda2bb61587f7b" change="1284030625" id="E3074">
      <type>Marriage</type>
      <description>Marriage of Diaz, William (Rev.) and Hoffman, Fay</description>
    </event>
    <event handle="_a5af0eda2e93b20d74e" change="1284030625" id="E3075">
      <type>Marriage</type>
      <description>Marriage of 山本, Antoine Desaure Perronett and Соколов, Louise</description>
    </event>
    <event handle="_a5af0eda31b7e4589a2" change="1284030624" id="E3076">
      <type>Marriage</type>
      <dateval val="1997-07-07"/>
      <place hlink="_2QELQC76L9IYKGKMA1"/>
      <description>Marriage of Garner, Thomas James and Сорокин, Holly Ruth</description>
    </event>
    <event handle="_a5af0eda3485cb0823e" change="1284030628" id="E3077">
      <type>Marriage</type>
      <description>Marriage of Сорокин, Robert and Сорокин, Candy</description>
    </event>
    <event handle="_a5af0eda3702cc27c79" change="1284030626" id="E3078">
      <type>Marriage</type>
      <description>Marriage of Webb, Elias and Gibbs, Nancy</description>
    </event>
    <event handle="_a5af0eda3946354927a" change="1284030627" id="E3079">
      <type>Marriage</type>
      <dateval val="1800" type="before"/>
      <place hlink="_CQHKQC0PKCPD9ADZTG"/>
      <description>Marriage of Webb, Alex and Макаров, Nancy</description>
    </event>
    <event handle="_a5af0eda3c0360ea73f" change="1284030625" id="E3080">
      <type>Marriage</type>
      <dateval val="1983-04-09"/>
      <place hlink="_FT6LQCBCBGDPAYO2SI"/>
      <description>Marriage of Warner, Stuart Bogarte and Richards, Diana</description>
    </event>
    <event handle="_a5af0eda3f22e935a89" change="1284030624" id="E3081">
      <type>Marriage</type>
      <description>Marriage of Waters, John and Webb, Mary</description>
    </event>
    <event handle="_a5af0eda40f7e12fe00" change="1284030626" id="E3082">
      <type>Marriage</type>
      <place hlink="_CQHKQC0PKCPD9ADZTG"/>
      <description>Marriage of Макаров, Joseph</description>
    </event>
    <event handle="_a5af0eda43b7771bb97" change="1284030626" id="E3083">
      <type>Marriage</type>
      <description>Marriage of Webb, William John and Wagner, Martha Ann</description>
    </event>
    <event handle="_a5af0eda45e3f421f90" change="1284030627" id="E3084">
      <type>Marriage</type>
      <dateval val="1880-12-14"/>
      <description>Marriage of Webb, James Marshall and Ballard, Judith Ellen</description>
    </event>
    <event handle="_a5af0eda4ad247f8297" change="1284030625" id="E3085">
      <type>Marriage</type>
      <dateval val="1997-06-07"/>
      <place hlink="_08TJQCCFIX31BXPNXN"/>
      <description>Marriage of Богданов, Dr. Brent and Cruz, Ann Lynn</description>
    </event>
    <event handle="_a5af0eda4d171d9bf3f" change="1284030627" id="E3086">
      <type>Marriage</type>
      <description>Marriage of Farmer, Jacob and Морозов, Mary Elizabeth</description>
    </event>
    <event handle="_a5af0eda4ff4d3deef9" change="1284030621" id="E3087">
      <type>Marriage</type>
      <description>Marriage of Beaulieu, Johann Simon and Григорьев, Anna Maria</description>
    </event>
    <event handle="_a5af0eda55110a77208" change="1284030621" id="E3088">
      <type>Marriage</type>
      <description>Marriage of Beaulieu, Johann Michael and López, Anna Elisabeth</description>
    </event>
    <event handle="_a5af0eda5851c101095" change="1284030623" id="E3089">
      <type>Marriage</type>
      <description>Marriage of Beaulieu, Johann Simon and Holland, Anna Margaretha</description>
    </event>
    <event handle="_a5af0eda5c47c7a9b49" change="1284030627" id="E3090">
      <type>Marriage</type>
      <description>Marriage of Farmer, Simon and Баранов, Susan</description>
    </event>
    <event handle="_a5af0eda5e46aa7f484" change="1284030628" id="E3091">
      <type>Marriage</type>
      <dateval val="1839-04-11"/>
      <place hlink="_0K2LQC47ETUY60B84H"/>
      <description>Marriage of Farmer, Benjamin H. and Mills, Isabella</description>
    </event>
    <event handle="_a5af0eda6341b3c2072" change="1284030622" id="E3092">
      <type>Marriage</type>
      <description>Marriage of Shelton, Peter and Farmer, Caroline</description>
    </event>
    <event handle="_a5af0eda6515efb7091" change="1284030624" id="E3093">
      <type>Marriage</type>
      <description>Marriage of Thomsen, new and Farmer, Elizabeth</description>
    </event>
    <event handle="_a5af0eda66e0566d99f" change="1284030624" id="E3094">
      <type>Marriage</type>
      <description>Marriage of Farmer, Valentine and Miller, Anna Catherine</description>
    </event>
    <event handle="_a5af0eda68d518db4cb" change="1284030621" id="E3095">
      <type>Marriage</type>
      <description>Marriage of Farmer, George William and Bradley, Mary</description>
    </event>
    <event handle="_a5af0eda6ac2fcc8d3b" change="1284030622" id="E3096">
      <type>Marriage</type>
      <description>Marriage of Taylor, Jacob and Farmer, Susanna</description>
    </event>
    <event handle="_a5af0eda6ca7080c888" change="1284030627" id="E3097">
      <type>Marriage</type>
      <description>Marriage of Dubé, Jacob and Farmer, Anna Marie</description>
    </event>
    <event handle="_a5af0eda6e67679f8d3" change="1284030622" id="E3098">
      <type>Marriage</type>
      <description>Marriage of Farmer, Peter Simon and Bowen, Elizabeth</description>
    </event>
    <event handle="_a5af0eda7083d589cad" change="1284030625" id="E3099">
      <type>Marriage</type>
      <description>Marriage of Patterson, George and Farmer, Elizabeth</description>
    </event>
    <event handle="_a5af0eda7272a01d489" change="1284030621" id="E3100">
      <type>Marriage</type>
      <description>Marriage of Butler, George and Farmer, Eva</description>
    </event>
    <event handle="_a5af0eda744130aebfb" change="1284030624" id="E3101">
      <type>Marriage</type>
      <description>Marriage of Ford, Samuel and Farmer, Catharine</description>
    </event>
    <event handle="_a5af0eda76043434f94" change="1284030623" id="E3102">
      <type>Marriage</type>
      <dateval val="1883-09-12"/>
      <place hlink="_5HTJQCSB91P69HY731"/>
      <description>Marriage of Reed, Francis Vincent and Тихонов, Catherine Virginia</description>
    </event>
    <event handle="_a5af0eda79e577ae094" change="1284030627" id="E3103">
      <type>Marriage</type>
      <description>Marriage of Farmer, Michael and Dubé, Elizabeth</description>
    </event>
    <event handle="_a5af0eda7d0766aed55" change="1284030625" id="E3104">
      <type>Marriage</type>
      <description>Marriage of Beaulieu, Johann Valentin and Morgan, Elisabeth Margaretha</description>
    </event>
    <event handle="_a5af0eda80529726872" change="1284030622" id="E3105">
      <type>Marriage</type>
      <description>Marriage of Beaulieu, Johann Franciskus and Barnett, Anna Gertrude</description>
    </event>
    <event handle="_a5af0eda8220509746a" change="1284030623" id="E3106">
      <type>Marriage</type>
      <description>Marriage of Frazier, Johann Adam and Hicks, Anna Eva</description>
    </event>
    <event handle="_a5af0eda8414ecc378d" change="1284030627" id="E3107">
      <type>Marriage</type>
      <description>Marriage of Frazier, Johann Walter and Beaulieu, Anna Margaretha</description>
    </event>
    <event handle="_a5af0eda8617b35abeb" change="1284030627" id="E3108">
      <type>Marriage</type>
      <description>Marriage of Steele, Valentine and Beaulieu, Anna Elisabeth</description>
    </event>
    <event handle="_a5af0eda87e4bd07d3e" change="1284030625" id="E3109">
      <type>Marriage</type>
      <description>Marriage of Beaulieu, Johann Valentin and Frazier, Maria Margaretha</description>
    </event>
    <event handle="_a5af0eda8a0611d0650" change="1284030623" id="E3110">
      <type>Marriage</type>
      <description>Marriage of Hardy, Jakob and Beaulieu, Anna Maria</description>
    </event>
    <event handle="_a5af0eda8d65bdf2805" change="1284030626" id="E3111">
      <type>Marriage</type>
      <description>Marriage of Beaulieu, Johann Adam and Michaud, Anna Eva</description>
    </event>
    <event handle="_a5af0eda9065fb8dea6" change="1284030624" id="E3112">
      <type>Marriage</type>
      <description>Marriage of Beaulieu, Johann Theobald and Sutton, Anna Maria</description>
    </event>
    <event handle="_a5af0eda9251f3b492d" change="1284030624" id="E3113">
      <type>Marriage</type>
      <dateval val="1971-09-05"/>
      <place hlink="_I32KQCN8VNTGQ2ECOT"/>
      <description>Marriage of Haynes, Marc W. and Warner, Laura Gail</description>
    </event>
    <event handle="_a5af0eda95a30674305" change="1284030626" id="E3114">
      <type>Marriage</type>
      <description>Marriage of López, Hans Valentin and Beaulieu, Anna Ottilia</description>
    </event>
    <event handle="_a5af0eda97a4ffa111a" change="1284030626" id="E3115">
      <type>Marriage</type>
      <description>Marriage of Michaud, Valentin and Beaulieu, Anna Eva</description>
    </event>
    <event handle="_a5af0eda99c52034b0f" change="1284030622" id="E3116">
      <type>Marriage</type>
      <description>Marriage of Александров, Johann Adam and Beaulieu, Anna Margaretha</description>
    </event>
    <event handle="_a5af0eda9bc5eb8f6af" change="1284030627" id="E3117">
      <type>Marriage</type>
      <description>Marriage of Beaulieu, Johann Simon and Александров, Anna Margaretha</description>
    </event>
    <event handle="_a5af0eda9db58ddc5cf" change="1284030621" id="E3118">
      <type>Marriage</type>
      <dateval val="1877-09-26"/>
      <place hlink="_Q0GKQCOJ9R0OT31SO1"/>
      <description>Marriage of Власов, John and Floyd, Martha Frances &quot;Fannie&quot;</description>
    </event>
    <event handle="_a5af0eda9ff697e98a0" change="1284030627" id="E3119">
      <type>Marriage</type>
      <dateval val="1888-12-19"/>
      <place hlink="_MM1LQCHWUPKTF8MI8J"/>
      <description>Marriage of Lévesque, James W. and Lessard, Emma Jane</description>
    </event>
    <event handle="_a5af0edaa3c2d38bf4e" change="1284030626" id="E3120">
      <type>Marriage</type>
      <dateval val="1895-05-01"/>
      <place hlink="_OJFLQCE0S4M2LBKFLO"/>
      <description>Marriage of Boyd, Charles Newton and Lessard, Izora</description>
    </event>
    <event handle="_a5af0edaa6d4fe0bf25" change="1284030628" id="E3121">
      <type>Marriage</type>
      <place hlink="_ASHKQC14B6H5FPP017"/>
      <description>Marriage of Gilbert, ?? and Lévesque, Wilma</description>
    </event>
    <event handle="_a5af0edaaa20ea295b5" change="1284030627" id="E3122">
      <type>Marriage</type>
      <dateval val="1882-12-26"/>
      <place hlink="_XK1LQCHPFC362WQMH4"/>
      <description>Marriage of Page, David and Douglas, Elizabeth</description>
    </event>
    <event handle="_a5af0edaad968a09ee1" change="1284030623" id="E3123">
      <type>Marriage</type>
      <place hlink="_ASHKQC14B6H5FPP017"/>
      <description>Marriage of Mack, ?? and Lévesque, Elsie</description>
    </event>
    <event handle="_a5af0edaafa5612738b" change="1284030626" id="E3124">
      <type>Marriage</type>
      <place hlink="_ASHKQC14B6H5FPP017"/>
      <description>Marriage of Blais, ?? and Lévesque, Mary</description>
    </event>
    <event handle="_a5af0edab20383f4e13" change="1284030623" id="E3125">
      <type>Marriage</type>
      <place hlink="_35LKQCSITDZ6K3UGXC"/>
      <description>Marriage of Neal, James and Page, Elizabeth</description>
    </event>
    <event handle="_a5af0edab60058541dc" change="1284030626" id="E3126">
      <type>Marriage</type>
      <description>Marriage of Schneider and Neal, Margaret</description>
    </event>
    <event handle="_a5af0edab8013012a65" change="1284030627" id="E3127">
      <type>Marriage</type>
      <dateval val="1901-12-12"/>
      <place hlink="_V2WJQCLJD8TYU2JDEA"/>
      <description>Marriage of Waters, William and Neal, Matilda</description>
    </event>
    <event handle="_a5af0edabb624ff6895" change="1284030628" id="E3128">
      <type>Marriage</type>
      <dateval val="1871-03-22"/>
      <place hlink="_SSFLQCASO5H65RLE2X"/>
      <description>Marriage of Jankowski, George and Page, Margaret</description>
    </event>
    <event handle="_a5af0edac0119737105" change="1284030622" id="E3129">
      <type>Marriage</type>
      <place hlink="_PH0KQCXU2AQ7P3TFHB"/>
      <description>Marriage of Sanz, John and Jankowski, Sarah</description>
    </event>
    <event handle="_a5af0edac26121b88fe" change="1284030623" id="E3130">
      <type>Marriage</type>
      <description>Marriage of Lewandowski, Thomas and Jankowski, Isabella Belle</description>
    </event>
    <event handle="_a5af0edac52563a95c5" change="1284030626" id="E3131">
      <type>Marriage</type>
      <description>Marriage of Owens, Wilford and Jankowski, Matilda</description>
    </event>
    <event handle="_a5af0edac7661164c4e" change="1284030625" id="E3132">
      <type>Marriage</type>
      <description>Marriage of Черкашин, Thomas and Jankowski, Margaret Jane &quot;Maggie&quot;</description>
    </event>
    <event handle="_a5af0edac9c3b0f9ff0" change="1284030627" id="E3133">
      <type>Marriage</type>
      <dateval val="1947-12-28"/>
      <place hlink="_RIXJQCEANQB26N0ZWF"/>
      <description>Marriage of Cruz, William Everett and Hawkins, Ellen Marie</description>
    </event>
    <event handle="_a5af0edacca1a6470c9" change="1284030624" id="E3134">
      <type>Marriage</type>
      <description>Marriage of Romero, Ernest and Jankowski, Minnie</description>
    </event>
    <event handle="_a5af0edace62def35d6" change="1284030627" id="E3135">
      <type>Marriage</type>
      <description>Marriage of Page, John James and Mcdaniel, Margaret</description>
    </event>
    <event handle="_a5af0edad1429ef0fa4" change="1284030627" id="E3136">
      <type>Marriage</type>
      <dateval val="1908"/>
      <place hlink="_35LKQCSITDZ6K3UGXC"/>
      <description>Marriage of Page, John James and Adkins, Minnie</description>
    </event>
    <event handle="_a5af0edad627147363e" change="1284030621" id="E3137">
      <type>Marriage</type>
      <dateval val="1929-07-20"/>
      <description>Marriage of Ortiz, Raymond and Page, Ferne</description>
    </event>
    <event handle="_a5af0edad861ea7acc5" change="1284030622" id="E3138">
      <type>Marriage</type>
      <description>Marriage of McCormick, Dean and Page, Florence</description>
    </event>
    <event handle="_a5af0edada5703136f9" change="1284030620" id="E3139">
      <type>Marriage</type>
      <description>Marriage of Wong and Page, Mildred</description>
    </event>
    <event handle="_a5af0edadc13301d6c5" change="1284030622" id="E3140">
      <type>Marriage</type>
      <description>Marriage of Daniels and Page, Edith (Dolly)</description>
    </event>
    <event handle="_a5af0edaddd159085e1" change="1284030621" id="E3141">
      <type>Marriage</type>
      <description>Marriage of Cross, Thomas and Page, Anna</description>
    </event>
    <event handle="_a5af0edae227e6bd073" change="1284030620" id="E3142">
      <type>Marriage</type>
      <dateval val="1919-08-14"/>
      <place hlink="_VGPKQCF8QF8JN00XAT"/>
      <description>Marriage of Peters, Frank O. and Cross, Alta M.</description>
    </event>
    <event handle="_a5af0edae50511ac4ee" change="1284030626" id="E3143">
      <type>Marriage</type>
      <dateval val="1946-03-02"/>
      <place hlink="_16MKQC41XRYWAKD87E"/>
      <description>Marriage of Armstrong, Teddy C. and Cross, Gertrude</description>
    </event>
    <event handle="_a5af0edae7c40c63efa" change="1284030622" id="E3144">
      <type>Marriage</type>
      <dateval val="1978-06-24"/>
      <place hlink="_I32KQCN8VNTGQ2ECOT"/>
      <description>Marriage of Киселев, Dennis John and Warner, Nancy Elizabeth</description>
    </event>
    <event handle="_a5af0edaea7120a2d1b" change="1284030626" id="E3145">
      <type>Marriage</type>
      <description>Marriage of Morin and Page, Belle</description>
    </event>
    <event handle="_a5af0edaec47330359d" change="1284030621" id="E3146">
      <type>Marriage</type>
      <place hlink="_W9GLQCSRJIQ9N2TGDF"/>
      <description>Marriage of Moss, Christy and Page, Matilda</description>
    </event>
    <event handle="_a5af0edaf0430839c06" change="1284030627" id="E3147">
      <type>Marriage</type>
      <description>Marriage of Waters, Cecil and Фомин, Grace</description>
    </event>
    <event handle="_a5af0edaf2914e9d137" change="1284030623" id="E3148">
      <type>Marriage</type>
      <description>Marriage of Waters, Cecil Glenn and Hubbard, Donna</description>
    </event>
    <event handle="_a5af0edaf4c7dffecc6" change="1284030624" id="E3149">
      <type>Marriage</type>
      <description>Marriage of Reyes and Armstrong, Sarah</description>
    </event>
    <event handle="_a5af0edaf684be96956" change="1284030623" id="E3150">
      <type>Marriage</type>
      <description>Marriage of Gross and Peters, Dorothy</description>
    </event>
    <event handle="_a5af0edaf861faa2e5c" change="1284030622" id="E3151">
      <type>Marriage</type>
      <dateval val="1904-02-17"/>
      <place hlink="_3EGLQC99BDL4G1O7TM"/>
      <description>Marriage of Neal, John and Schneider, Belle Irene</description>
    </event>
    <event handle="_a5af0edafb50a591798" change="1284030624" id="E3152">
      <type>Marriage</type>
      <dateval val="1938-12-03"/>
      <place hlink="_UKMKQC04M2TZPJBBL"/>
      <description>Marriage of Bélanger, Adrian and Neal, Helen M.</description>
    </event>
    <event handle="_a5af0edafdc2d9ad967" change="1284030627" id="E3153">
      <type>Marriage</type>
      <dateval val="1965-04-10"/>
      <place hlink="_PHUJQCJ9R4XQO5Y0WS"/>
      <description>Marriage of Bélanger, Donald and Pierce, Joanne</description>
    </event>
    <event handle="_a5af0edb01651ad8ce1" change="1284030622" id="E3154">
      <type>Marriage</type>
      <description>Marriage of Ortiz, Don and Welch, Shirley</description>
    </event>
    <event handle="_a5af0edb041202a2f53" change="1284030622" id="E3155">
      <type>Marriage</type>
      <dateval val="1944-04-21"/>
      <place hlink="_JRZJQCXYM018CPP522"/>
      <description>Marriage of Лопатин, Raymond A. and Garrett, Carmen Eloise</description>
    </event>
    <event handle="_a5af0edb0707778ac9b" change="1284030623" id="E3156">
      <type>Marriage</type>
      <dateval val="1881-10-04"/>
      <description>Marriage of Hines and Douglas, Eliza Jane</description>
    </event>
    <event handle="_a5af0edb0914b5fea5f" change="1284030627" id="E3157">
      <type>Marriage</type>
      <description>Marriage of Douglas, Abraham and Greer, Mary Wein</description>
    </event>
    <event handle="_a5af0edb0b71a9bd7fb" change="1284030622" id="E3158">
      <type>Marriage</type>
      <description>Marriage of Alvarado, John and James, Pamela</description>
    </event>
    <event handle="_a5af0edb0db2dd3a23a" change="1284030621" id="E3159">
      <type>Marriage</type>
      <description>Marriage of Boyd, Capt. and Alvarado, Eliza</description>
    </event>
    <event handle="_a5af0edb0fe67fd50b8" change="1284030621" id="E3160">
      <type>Marriage</type>
      <description>Marriage of Alvarado, Franklin and Hodges, Comfort</description>
    </event>
    <event handle="_a5af0edb11e23b49c06" change="1284030627" id="E3161">
      <type>Marriage</type>
      <description>Marriage of Alvarado, William and Moody, Martha</description>
    </event>
    <event handle="_a5af0edb14210fb7b27" change="1284030625" id="E3162">
      <type>Marriage</type>
      <description>Marriage of Alvarado, Thomas C. and Медведев, Mary</description>
    </event>
    <event handle="_a5af0edb1603c7d8d72" change="1284030627" id="E3163">
      <type>Marriage</type>
      <description>Marriage of Alvarado, Marshall and Bouchard, Jane</description>
    </event>
    <event handle="_a5af0edb17d3fa7585c" change="1284030622" id="E3164">
      <type>Marriage</type>
      <description>Marriage of Douglas, John Jr. and Rogers, Barbara</description>
    </event>
    <event handle="_a5af0edb19d4eb2254b" change="1284030621" id="E3165">
      <type>Marriage</type>
      <dateval val="1937-09-11"/>
      <place hlink="_GVXJQCL5K9J4ZJY4AM"/>
      <description>Marriage of Lane, Joseph Robert and Thornton, Dorothy Eleanor</description>
    </event>
    <event handle="_a5af0edb1c6176efc6b" change="1284030627" id="E3166">
      <type>Marriage</type>
      <description>Marriage of Hernández, Thomas and Douglas, Elizabeth</description>
    </event>
    <event handle="_a5af0edb1e57e144f19" change="1284030626" id="E3167">
      <type>Marriage</type>
      <description>Marriage of Kelley, Thomas and Douglas, Catherine</description>
    </event>
    <event handle="_a5af0edb2014bb21753" change="1284030623" id="E3168">
      <type>Marriage</type>
      <description>Marriage of Parsons, Henry and Douglas, Ellen</description>
    </event>
    <event handle="_a5af0edb2201fbf0566" change="1284030626" id="E3169">
      <type>Marriage</type>
      <description>Marriage of Павлов, Reuben and Douglas, Lucinda J.</description>
    </event>
    <event handle="_a5af0edb24a2eeb6bd1" change="1284030627" id="E3170">
      <type>Marriage</type>
      <description>Marriage of Андреев, William and Douglas, Susan</description>
    </event>
    <event handle="_a5af0edb267465ba100" change="1284030622" id="E3171">
      <type>Marriage</type>
      <dateval val="1806-07-28"/>
      <place hlink="_P15KQC61Z35L9UGR4X"/>
      <description>Marriage of Douglas, John Sr. and Larson, Christena Wiseman</description>
    </event>
    <event handle="_a5af0edb2897c065a05" change="1284030622" id="E3172">
      <type>Marriage</type>
      <description>Marriage of Douglas, Hans Peter and Cummings, Leonnah</description>
    </event>
    <event handle="_a5af0edb2a806645930" change="1284030622" id="E3173">
      <type>Marriage</type>
      <description>Marriage of Gibson, Mr. and James, Mary</description>
    </event>
    <event handle="_a5af0edb2d451f4b5b8" change="1284030624" id="E3174">
      <type>Marriage</type>
      <description>Marriage of Page, Mr. and James, Martha</description>
    </event>
    <event handle="_a5af0edb2f12af9e032" change="1284030628" id="E3175">
      <type>Marriage</type>
      <dateval val="1817" type="about"/>
      <description>Marriage of Lavoie, Henry and James, Patsy</description>
    </event>
    <event handle="_a5af0edb3153799e0bf" change="1284030627" id="E3176">
      <type>Marriage</type>
      <place hlink="_R21LQCW14CE6Z3R8C"/>
      <description>Marriage of Warner, Noah and Burns, Margaret</description>
    </event>
    <event handle="_a5af0edb3674b86ab73" change="1284030627" id="E3177">
      <type>Marriage</type>
      <dateval val="1975-05-24"/>
      <place hlink="_I32KQCN8VNTGQ2ECOT"/>
      <description>Marriage of Watkins, Bruce Edward and Warner, Mary Christine</description>
    </event>
    <event handle="_a5af0edb3922430f2ab" change="1284030625" id="E3178">
      <type>Marriage</type>
      <place hlink="_C2DKQCDXBRBVHMGNP4"/>
      <description>Marriage of Santiago, Mathias and James, Molly</description>
    </event>
    <event handle="_a5af0edb3b74633d880" change="1284030624" id="E3179">
      <type>Marriage</type>
      <dateval val="1813-11-07"/>
      <description>Marriage of Poole, Dr. John and James, Jane</description>
    </event>
    <event handle="_a5af0edb3dd2b3b898a" change="1284030623" id="E3180">
      <type>Marriage</type>
      <description>Marriage of Parent, Montgomery and Alvarado, Patsy</description>
    </event>
    <event handle="_a5af0edb41224d4e7f8" change="1284030625" id="E3181">
      <type>Marriage</type>
      <description>Marriage of Быков, Herod and Parent, Polly</description>
    </event>
    <event handle="_a5af0edb44c5ced93ef" change="1284030624" id="E3182">
      <type>Marriage</type>
      <description>Marriage of Taylor, Philip and Быков, Harriet</description>
    </event>
    <event handle="_a5af0edb46b7467b788" change="1284030622" id="E3183">
      <type>Marriage</type>
      <description>Marriage of Быков, Charles and Girard, Margaret</description>
    </event>
    <event handle="_a5af0edb48c37d85e67" change="1284030625" id="E3184">
      <type>Marriage</type>
      <description>Marriage of Moore, George and Быков, Margaret</description>
    </event>
    <event handle="_a5af0edb4aa193b4470" change="1284030626" id="E3185">
      <type>Marriage</type>
      <description>Marriage of Быков, Samuel and Larsen, Nelly</description>
    </event>
    <event handle="_a5af0edb4cb6b26bc5e" change="1284030625" id="E3186">
      <type>Marriage</type>
      <description>Marriage of Logan, Joseph and Быков, Janie</description>
    </event>
    <event handle="_a5af0edb4ed537a7023" change="1284030627" id="E3187">
      <type>Marriage</type>
      <description>Marriage of Poirier, James A. and Walker, Sharon Lynette</description>
    </event>
    <event handle="_a5af0edb512029a32a3" change="1284030625" id="E3188">
      <type>Marriage</type>
      <description>Marriage of King, Henry and Быков, Annie</description>
    </event>
    <event handle="_a5af0edb52e03e2c3c0" change="1284030627" id="E3189">
      <type>Marriage</type>
      <description>Marriage of Bergeron, John W. and Быков, Bettie</description>
    </event>
    <event handle="_a5af0edb54b1f1ebd7a" change="1284030628" id="E3190">
      <type>Marriage</type>
      <description>Marriage of Lawson, Mr. and Parent, Polly</description>
    </event>
    <event handle="_a5af0edb592322efb75" change="1284030625" id="E3191">
      <type>Marriage</type>
      <description>Marriage of Benson, Walter and Ellis, Margaret Steel</description>
    </event>
    <event handle="_a5af0edb5b1755ff837" change="1284030624" id="E3192">
      <type>Marriage</type>
      <description>Marriage of Benson, Hugh and Ouellet, Rebecca</description>
    </event>
    <event handle="_a5af0edb5ce7cecad2d" change="1284030626" id="E3193">
      <type>Marriage</type>
      <description>Marriage of Benson, Samuel Sr. and Wong, Jane</description>
    </event>
    <event handle="_a5af0edb5ed1ef9560e" change="1284030625" id="E3194">
      <type>Marriage</type>
      <description>Marriage of Алексеев, Jacob and Benson, Mary</description>
    </event>
    <event handle="_a5af0edb60b0623a4da" change="1284030624" id="E3195">
      <type>Marriage</type>
      <description>Marriage of Pedersen, William and Benson, Elizabeth</description>
    </event>
    <event handle="_a5af0edb62a3858d7b8" change="1284030625" id="E3196">
      <type>Marriage</type>
      <description>Marriage of Floyd, Henry and Benson, Nancy</description>
    </event>
    <event handle="_a5af0edb64754bdf6ad" change="1284030622" id="E3197">
      <type>Marriage</type>
      <dateval val="1806-05-20"/>
      <description>Marriage of 中村, Thomas and Jiménez, Polly Mary</description>
    </event>
    <event handle="_a5af0edb66a01f1873d" change="1284030628" id="E3198">
      <type>Marriage</type>
      <dateval val="1980-01-11"/>
      <description>Marriage of Nguyen, John Harry and Walker, Sharon Lynette</description>
    </event>
    <event handle="_a5af0edb69816800791" change="1284030628" id="E3199">
      <type>Marriage</type>
      <dateval val="1815-09-01"/>
      <description>Marriage of Williams, Thomas Jr. and Jiménez, Elizabeth</description>
    </event>
    <event handle="_a5af0edb6bc28bafa95" change="1284030626" id="E3200">
      <type>Marriage</type>
      <dateval val="1820-04-26"/>
      <description>Marriage of Jiménez, Andrew and Palmer, Sarah</description>
    </event>
    <event handle="_a5af0edb6dc5cf92e9a" change="1284030622" id="E3201">
      <type>Marriage</type>
      <dateval val="1818-09-09"/>
      <description>Marriage of Jiménez, John and Palmer, Mary</description>
    </event>
    <event handle="_a5af0edb6fa77804748" change="1284030620" id="E3202">
      <type>Marriage</type>
      <dateval val="1827-09-13"/>
      <description>Marriage of McCarthy, Valentine Thomas and Jiménez, Sarah</description>
    </event>
    <event handle="_a5af0edb7176b3dc1da" change="1284030622" id="E3203">
      <type>Marriage</type>
      <dateval val="1824-01-23"/>
      <description>Marriage of Curry, Kenner S. and Jiménez, Rebecca</description>
    </event>
    <event handle="_a5af0edb73555a14394" change="1284030624" id="E3204">
      <type>Marriage</type>
      <dateval val="1828-07-20"/>
      <description>Marriage of Jiménez, Cornelius and Blair, Jane</description>
    </event>
    <event handle="_a5af0edb759294d6c17" change="1284030621" id="E3205">
      <type>Marriage</type>
      <description>Marriage of Hébert, Mr. and Page, Mary</description>
    </event>
    <event handle="_a5af0edb77a1abb4648" change="1284030622" id="E3206">
      <type>Marriage</type>
      <place hlink="_C2DKQCDXBRBVHMGNP4"/>
      <description>Marriage of Page, Robert and Neal, Belle</description>
    </event>
    <event handle="_a5af0edb7ac702ba117" change="1284030624" id="E3207">
      <type>Marriage</type>
      <description>Marriage of Nowak, John H. and Page, Eleanor Maude</description>
    </event>
    <event handle="_a5af0edb7c976ccf34d" change="1284030621" id="E3208">
      <type>Marriage</type>
      <place hlink="_V2WJQCLJD8TYU2JDEA"/>
      <description>Marriage of Егоров, Dr. Charles J. and Page, Edith Mae</description>
    </event>
    <event handle="_a5af0edb7ec697c3123" change="1284030625" id="E3209">
      <type>Marriage</type>
      <description>Marriage of Warner, John William and Miles, Rebecca J.</description>
    </event>
    <event handle="_a5af0edb8145201781f" change="1284030624" id="E3210">
      <type>Marriage</type>
      <description>Marriage of James, Hugh Jr. and Wiśniewski, D.</description>
    </event>
    <event handle="_a5af0edb844144cc2e1" change="1284030621" id="E3211">
      <type>Marriage</type>
      <description>Marriage of James, Joseph and Floyd, Nancy</description>
    </event>
    <event handle="_a5af0edb86246432e1c" change="1284030627" id="E3212">
      <type>Marriage</type>
      <description>Marriage of James, Isaac and Andersen, Martha</description>
    </event>
    <event handle="_a5af0edb8812b03fdf8" change="1284030621" id="E3213">
      <type>Marriage</type>
      <description>Marriage of James, Thomas and Parent, Betsy</description>
    </event>
    <event handle="_a5af0edb8a116988dcf" change="1284030622" id="E3214">
      <type>Marriage</type>
      <description>Marriage of James, Thomas and Marshall, Kate Teel</description>
    </event>
    <event handle="_a5af0edb8bd21a6f532" change="1284030623" id="E3215">
      <type>Marriage</type>
      <description>Marriage of Strickland, Col. Robert and James, Patsy</description>
    </event>
    <event handle="_a5af0edb8d961096a13" change="1284030627" id="E3216">
      <type>Marriage</type>
      <description>Marriage of James, Walter Crockett and Hernández, Nancy</description>
    </event>
    <event handle="_a5af0edb8ff3c717139" change="1284030621" id="E3217">
      <type>Marriage</type>
      <description>Marriage of James, Walter Crockett and Захаров, Margaret</description>
    </event>
    <event handle="_a5af0edb923250dbcdb" change="1284030622" id="E3218">
      <type>Marriage</type>
      <description>Marriage of Young, Mr. and Waters, Edith</description>
    </event>
    <event handle="_a5af0edb93f3c72a65e" change="1284030625" id="E3219">
      <type>Marriage</type>
      <description>Marriage of 小林, Mr. and Waters, Nellie</description>
    </event>
    <event handle="_a5af0edb964703fac02" change="1284030626" id="E3220">
      <type>Marriage</type>
      <description>Marriage of Thornton, Arthur Otto and Marín, Lilla Estella</description>
    </event>
    <event handle="_a5af0edb99600656e8d" change="1284030627" id="E3221">
      <type>Marriage</type>
      <description>Marriage of Grabowski, Mr. and Waters, Lola</description>
    </event>
    <event handle="_a5af0edb9b416a883e4" change="1284030627" id="E3222">
      <type>Marriage</type>
      <description>Marriage of Page, Richard C. and Rodriguez, Helen M.</description>
    </event>
    <event handle="_a5af0edb9d86f5a5a24" change="1284030627" id="E3223">
      <type>Marriage</type>
      <dateval val="1978-04-08"/>
      <place hlink="_Y4HLQCRJNG791BO3X9"/>
      <description>Marriage of Page, Kenneth Fritz and Pittman, June Christine</description>
    </event>
    <event handle="_a5af0edba195d9e22ee" change="1284030624" id="E3224">
      <type>Marriage</type>
      <dateval val="1829-11-19"/>
      <place hlink="_JRHKQCOMEMXE5FRYBM"/>
      <description>Marriage of Serrano, Archibald and Delgado, Catherine</description>
    </event>
    <event handle="_a5af0edba41156f96ad" change="1284030623" id="E3225">
      <type>Marriage</type>
      <description>Marriage of Quinn, Abraham and Blanco, Malvina</description>
    </event>
    <event handle="_a5af0edba655864f228" change="1284030623" id="E3226">
      <type>Marriage</type>
      <description>Marriage of Serrano, Joseph and Quinn, Elizabeth Marium</description>
    </event>
    <event handle="_a5af0edba8d75765a03" change="1284030627" id="E3227">
      <type>Marriage</type>
      <description>Marriage of Blanco, Henry and Fournier, Peggy</description>
    </event>
    <event handle="_a5af0edbaac58d08a01" change="1284030622" id="E3228">
      <type>Marriage</type>
      <description>Marriage of Blanco, Peter and Leonard, Catherine</description>
    </event>
    <event handle="_a5af0edbac85e17a237" change="1284030627" id="E3229">
      <type>Marriage</type>
      <description>Marriage of Stephens, Adam and Blanco, Anna Maria</description>
    </event>
    <event handle="_a5af0edbb0329de4303" change="1284030622" id="E3230">
      <type>Marriage</type>
      <description>Marriage of Hammond, Roy and Serrano, Carrie</description>
    </event>
    <event handle="_a5af0edbb237ac0fa6e" change="1284030628" id="E3231">
      <type>Marriage</type>
      <dateval val="1974-07-02"/>
      <place hlink="_I32KQCN8VNTGQ2ECOT"/>
      <description>Marriage of Ward, David J. and Warner, Margaret Ruth</description>
    </event>
    <event handle="_a5af0edbb5048a413f9" change="1284030627" id="E3232">
      <type>Marriage</type>
      <description>Marriage of Day, Charles and Serrano, Dot</description>
    </event>
    <event handle="_a5af0edbb6d771014d3" change="1284030627" id="E3233">
      <type>Marriage</type>
      <description>Marriage of Little, O. D. and Webb, Anna Mabel</description>
    </event>
    <event handle="_a5af0edbb8b5030ba9d" change="1284030622" id="E3234">
      <type>Marriage</type>
      <dateval val="1993-02-06"/>
      <place hlink="_S07LQCOLBYYRVWC157"/>
      <description>Marriage of Ford, Phillip D. and Webb, Joan Lorinda</description>
    </event>
    <event handle="_a5af0edbbb531477db4" change="1284030627" id="E3235">
      <type>Marriage</type>
      <description>Marriage of 鈴木, Robert B. and Blanco, Mary F.</description>
    </event>
    <event handle="_a5af0edbbd74e9dc0a7" change="1284030625" id="E3236">
      <type>Marriage</type>
      <dateval val="1987-11-28"/>
      <place hlink="_S07LQCOLBYYRVWC157"/>
      <description>Marriage of Parks, Cliff and Gill, Lorie Ann</description>
    </event>
    <event handle="_a5af0edbbfb291978ab" change="1284030626" id="E3237">
      <type>Marriage</type>
      <dateval val="1988" type="before"/>
      <description>Marriage of Lessard, Robert and Webb, Joan Lorinda</description>
    </event>
    <event handle="_a5af0edbc1b000bec09" change="1284030621" id="E3238">
      <type>Marriage</type>
      <dateval val="1789-10-27"/>
      <place hlink="_S54KQCNSQM8DZ6W7NH"/>
      <description>Marriage of Rodriquez, John and Поляков, Eve</description>
    </event>
    <event handle="_a5af0edbc4061749bf0" change="1284030623" id="E3239">
      <type>Marriage</type>
      <dateval val="1798-05-31"/>
      <place hlink="_UKCKQC294GPRSJE6JI"/>
      <description>Marriage of Cook, John and Rodriquez, Mary</description>
    </event>
    <event handle="_a5af0edbc740f5c45a0" change="1284030623" id="E3240">
      <type>Marriage</type>
      <dateval val="1793-10-20"/>
      <description>Marriage of Rodriquez, Mordica and Казаков, Jane</description>
    </event>
    <event handle="_a5af0edbc955d48e032" change="1284030627" id="E3241">
      <type>Marriage</type>
      <dateval val="1975-06-01"/>
      <place hlink="_RNWJQCB4BV3G9OJQRS"/>
      <description>Marriage of Mortensen, Daniel and Warner, Sarah Jane</description>
    </event>
    <event handle="_a5af0edbcdd4bc0748c" change="1284030624" id="E3242">
      <type>Marriage</type>
      <dateval val="1849-02-02"/>
      <place hlink="_FFQKQCKQ7LJCXM6J0S"/>
      <description>Marriage of Rodriquez, Mordica and Воронов, Katherine</description>
    </event>
    <event handle="_a5af0edbd050d65f80d" change="1284030628" id="E3243">
      <type>Marriage</type>
      <dateval val="1806-10-17"/>
      <place hlink="_97QKQCERFNYAZMVTJJ"/>
      <description>Marriage of Rodriquez, Richard and Жуков, Hannah</description>
    </event>
    <event handle="_a5af0edbd275cc77382" change="1284030624" id="E3244">
      <type>Marriage</type>
      <description>Marriage of Martínez and Serrano, Reh Dawn</description>
    </event>
    <event handle="_a5af0edbd4c5fc69fad" change="1284030628" id="E3245">
      <type>Marriage</type>
      <description>Marriage of Lessard and Castro, ???</description>
    </event>
    <event handle="_a5af0edbd72521c83af" change="1284030627" id="E3246">
      <type>Marriage</type>
      <dateval val="1873-02-18"/>
      <place hlink="_IK9KQC84K7NG7V5DVL"/>
      <description>Marriage of Boucher, Patrick and Dennis, Susan</description>
    </event>
    <event handle="_a5af0edbdb700ce5d27" change="1284030620" id="E3247">
      <type>Marriage</type>
      <dateval val="1876-02-28"/>
      <place hlink="_IK9KQC84K7NG7V5DVL"/>
      <description>Marriage of Bush, James and Boucher, Catherine</description>
    </event>
    <event handle="_a5af0edbdf03f101250" change="1284030622" id="E3248">
      <type>Marriage</type>
      <place hlink="_LFHLQCPIZ9JINI5704"/>
      <description>Marriage of Boucher, Michael Shannon and Iglesias, Kate</description>
    </event>
    <event handle="_a5af0edbe1f5d87141c" change="1284030625" id="E3249">
      <type>Marriage</type>
      <dateval val="1995-04-16"/>
      <place hlink="_T4BLQC8LFX937N69MQ"/>
      <description>Marriage of Hamilton, John and Boucher, Miread</description>
    </event>
    <event handle="_a5af0edbe49338307e3" change="1284030628" id="E3250">
      <type>Marriage</type>
      <description>Marriage of St-Pierre, Joe and Boucher, Norene</description>
    </event>
    <event handle="_a5af0edbe660551a96d" change="1284030624" id="E3251">
      <type>Marriage</type>
      <description>Marriage of Brady, Michael and Boucher, Agnes</description>
    </event>
    <event handle="_a5af0edbe8c7f2f6c61" change="1284030625" id="E3252">
      <type>Marriage</type>
      <dateval val="1972-07-08"/>
      <place hlink="_5HTJQCSB91P69HY731"/>
      <description>Marriage of Bates, William Robert and Данилов, Elaine Suzanne</description>
    </event>
    <event handle="_a5af0edbebb57712e00" change="1284030621" id="E3253">
      <type>Marriage</type>
      <description>Marriage of Brady, Tony and Boucher, Bridget</description>
    </event>
    <event handle="_a5af0edbee361c48cf7" change="1284030621" id="E3254">
      <type>Marriage</type>
      <description>Marriage of Caldwell, Paul and Boucher, Martha</description>
    </event>
    <event handle="_a5af0edbf0b4a123f13" change="1284030623" id="E3255">
      <type>Marriage</type>
      <description>Marriage of Hart, Gerry and Boucher, Mary</description>
    </event>
    <event handle="_a5af0edbf35682ff5b0" change="1284030625" id="E3256">
      <type>Marriage</type>
      <description>Marriage of Boucher, Michael and Boucher, Anne</description>
    </event>
    <event handle="_a5af0edbf625d2604ec" change="1284030621" id="E3257">
      <type>Marriage</type>
      <place hlink="_PH0KQCXU2AQ7P3TFHB"/>
      <description>Marriage of Lindsey, John and Warner, Martha Ellen</description>
    </event>
    <event handle="_a5af0edbf8a25bf1767" change="1284030621" id="E3258">
      <type>Marriage</type>
      <dateval val="1969-09-09"/>
      <place hlink="_BDTKQC64ZADP0LZ354"/>
      <description>Marriage of McCoy, Thomas Michael and Howell, Mary</description>
    </event>
    <event handle="_a5af0edbfbc590c6432" change="1284030623" id="E3259">
      <type>Marriage</type>
      <description>Marriage of Stokes, Gabriel and McCoy, Celine Bridget</description>
    </event>
    <event handle="_a5af0edbfde71a6cc98" change="1284030623" id="E3260">
      <type>Marriage</type>
      <dateval val="1939" type="about"/>
      <place hlink="_4XTKQCS8KVRTJLU5BZ"/>
      <description>Marriage of McCoy, Francis and Reed, Sarah</description>
    </event>
    <event handle="_a5af0edc00f2d14f197" change="1284030623" id="E3261">
      <type>Marriage</type>
      <description>Marriage of Reed, Matthew and Gibbs, Mary</description>
    </event>
    <event handle="_a5af0edc06e4885702c" change="1284030626" id="E3262">
      <type>Marriage</type>
      <description>Marriage of Reed, Peter and Кузнецов, Hanora</description>
    </event>
    <event handle="_a5af0edc0a01ef4860b" change="1284030621" id="E3263">
      <type>Marriage</type>
      <dateval val="1977-01-08"/>
      <description>Marriage of Floyd, Robert William and Данилов, Kathryn Louise</description>
    </event>
    <event handle="_a5af0edc0c902a4109f" change="1284030622" id="E3264">
      <type>Marriage</type>
      <description>Marriage of Valdez and Reed, Noreen</description>
    </event>
    <event handle="_a5af0edc0e76e64d24e" change="1284030623" id="E3265">
      <type>Marriage</type>
      <description>Marriage of Berry and Reed, Carmel</description>
    </event>
    <event handle="_a5af0edc1057c0aa7c0" change="1284030621" id="E3266">
      <type>Marriage</type>
      <description>Marriage of Беляев and Reed, Peggy</description>
    </event>
    <event handle="_a5af0edc1252335454b" change="1284030624" id="E3267">
      <type>Marriage</type>
      <description>Marriage of Duncan and Reed, Joan</description>
    </event>
    <event handle="_a5af0edc1567094615d" change="1284030627" id="E3268">
      <type>Marriage</type>
      <description>Marriage of Reed, Terrence and Gibbs, Maria</description>
    </event>
    <event handle="_a5af0edc1786d58e1d7" change="1284030625" id="E3269">
      <type>Marriage</type>
      <description>Marriage of Dawson and Reed, Anastasia</description>
    </event>
    <event handle="_a5af0edc198418dfc0b" change="1284030622" id="E3270">
      <type>Marriage</type>
      <description>Marriage of Martinez and Reed, Catherine</description>
    </event>
    <event handle="_a5af0edc1b825c0508c" change="1284030625" id="E3271">
      <type>Marriage</type>
      <description>Marriage of Poulin and Reed, Rose</description>
    </event>
    <event handle="_a5af0edc1da285a7ae2" change="1284030623" id="E3272">
      <type>Marriage</type>
      <description>Marriage of Федоров and Reed, Bridget</description>
    </event>
    <event handle="_a5af0edc1f9572664ec" change="1284030622" id="E3273">
      <type>Marriage</type>
      <description>Marriage of White and Reed, Mary Ann</description>
    </event>
    <event handle="_a5af0edc2161ca20a84" change="1284030620" id="E3274">
      <type>Marriage</type>
      <dateval val="1983-10-16"/>
      <description>Marriage of Harrison, Paul Allen and Данилов, Lucinda Elinor</description>
    </event>
    <event handle="_a5af0edc2424596a217" change="1284030620" id="E3275">
      <type>Marriage</type>
      <description>Marriage of Мартынов and Reed, Jane</description>
    </event>
    <event handle="_a5af0edc26243cb3201" change="1284030623" id="E3276">
      <type>Marriage</type>
      <description>Marriage of Reed, Patrick and Gibbs, Elizabeth</description>
    </event>
    <event handle="_a5af0edc27f2f454594" change="1284030626" id="E3277">
      <type>Marriage</type>
      <description>Marriage of Reed, Peter James? and Reed, Catherine</description>
    </event>
    <event handle="_a5af0edc2b54172e956" change="1284030626" id="E3278">
      <type>Marriage</type>
      <place hlink="_QXHLQCA78CTKKNFGSU"/>
      <description>Marriage of Kamiński and Reed, Jane</description>
    </event>
    <event handle="_a5af0edc2dd72504e28" change="1284030621" id="E3279">
      <type>Marriage</type>
      <description>Marriage of Reed, Michael and Goodwin, Alice</description>
    </event>
    <event handle="_a5af0edc323154d8c79" change="1284030628" id="E3280">
      <type>Marriage</type>
      <description>Marriage of Sandoval, Johnnie and Reed, Minnie</description>
    </event>
    <event handle="_a5af0edc3502a44f21e" change="1284030623" id="E3281">
      <type>Marriage</type>
      <description>Marriage of Goodwin and Sandoval, Liz</description>
    </event>
    <event handle="_a5af0edc3721158dd47" change="1284030623" id="E3282">
      <type>Marriage</type>
      <description>Marriage of Johnston and Sandoval, Jean</description>
    </event>
    <event handle="_a5af0edc3914b164099" change="1284030621" id="E3283">
      <type>Marriage</type>
      <description>Marriage of Reed, Terrence (TyNed) and Gibbs, Jennie</description>
    </event>
    <event handle="_a5af0edc3ae3b33b7b6" change="1284030627" id="E3284">
      <type>Marriage</type>
      <description>Marriage of Reed, Michael and Gibbs, Mary</description>
    </event>
    <event handle="_a5af0edc3d27c04e417" change="1284030625" id="E3285">
      <type>Marriage</type>
      <dateval val="1823-01-09"/>
      <description>Marriage of Fox, David and Green, Frances</description>
    </event>
    <event handle="_a5af0edc4024c513c50" change="1284030624" id="E3286">
      <type>Marriage</type>
      <dateval val="1944-12-24"/>
      <place hlink="_Q51KQC4BK63K8Y3UGL"/>
      <description>Marriage of Cruz, Ivan Wayne and Gagnon, Bettie Lou</description>
    </event>
    <event handle="_a5af0edc42b0bf2698a" change="1284030626" id="E3287">
      <type>Marriage</type>
      <description>Marriage of Love and Reed, Carmel</description>
    </event>
    <event handle="_a5af0edc44e55884d90" change="1284030624" id="E3288">
      <type>Marriage</type>
      <description>Marriage of Jimenez and Reed, Maureen</description>
    </event>
    <event handle="_a5af0edc47270b4205f" change="1284030620" id="E3289">
      <type>Marriage</type>
      <dateval val="1843-01-27"/>
      <description>Marriage of Payne, Fielding and Lawrence, Dorcas C.</description>
    </event>
    <event handle="_a5af0edc49164392818" change="1284030622" id="E3290">
      <type>Marriage</type>
      <place hlink="_NXUKQCAAQRP16CLV56"/>
      <description>Marriage of Ford, William and Payne, Winifred</description>
    </event>
    <event handle="_a5af0edc4b2101c95ac" change="1284030622" id="E3291">
      <type>Marriage</type>
      <dateval val="1818-10-20"/>
      <place hlink="_P4ILQC7VCIF5WST93"/>
      <description>Marriage of Payne, Alexander and Salazar, Catherine</description>
    </event>
    <event handle="_a5af0edc4dd54575e8a" change="1284030627" id="E3292">
      <type>Marriage</type>
      <dateval val="1840-05-04"/>
      <description>Marriage of Payne, Alexander and Kamiński, Elizabeth</description>
    </event>
    <event handle="_a5af0edc50224699b02" change="1284030625" id="E3293">
      <type>Marriage</type>
      <description>Marriage of Reynolds, John and Newman, Margaret</description>
    </event>
    <event handle="_a5af0edc5295b278d05" change="1284030626" id="E3294">
      <type>Marriage</type>
      <dateval val="1791-12-19"/>
      <place hlink="_S8VKQCIHLSCJEQN5HB"/>
      <description>Marriage of Diaz, James and Woods, Nancy</description>
    </event>
    <event handle="_a5af0edc54b7fab0f43" change="1284030627" id="E3295">
      <type>Marriage</type>
      <description>Marriage of Woods, James and Зырянов, Mary</description>
    </event>
    <event handle="_a5af0edc56e4e48aea2" change="1284030627" id="E3296">
      <type>Marriage</type>
      <description>Marriage of Hunt, Isaac and Дмитриев, Nancy Ann</description>
    </event>
    <event handle="_a5af0edc58d5fb68f34" change="1284030623" id="E3297">
      <type>Marriage</type>
      <dateval val="1939-11-23"/>
      <place hlink="_5HTJQCSB91P69HY731"/>
      <description>Marriage of Cruz, Paul Eugene and Lambert, Marguerite</description>
    </event>
    <event handle="_a5af0edc5d30f370c30" change="1284030621" id="E3298">
      <type>Marriage</type>
      <description>Marriage of Дмитриев, Travis and Payne, Elizabeth</description>
    </event>
    <event handle="_a5af0edc5f25a5ad19a" change="1284030625" id="E3299">
      <type>Marriage</type>
      <description>Marriage of Дмитриев, William and Wood, Polly</description>
    </event>
    <event handle="_a5af0edc60e28eb9b6c" change="1284030621" id="E3300">
      <type>Marriage</type>
      <description>Marriage of Wood, Peter and Gibbs, Lucy</description>
    </event>
    <event handle="_a5af0edc6325d48601a" change="1284030620" id="E3301">
      <type>Marriage</type>
      <dateval val="1803-02-19"/>
      <place hlink="_L3WJQCD3US67V2CNZT"/>
      <description>Marriage of Petersen, William and Дмитриев, Margaret Jane</description>
    </event>
    <event handle="_a5af0edc66a75166c1a" change="1284030627" id="E3302">
      <type>Marriage</type>
      <dateval val="1803-01-31"/>
      <place hlink="_F4VKQCKG4BGBZPTXER"/>
      <description>Marriage of Дмитриев, Alexander Carroll Sr. and Woods, Mary Polly</description>
    </event>
    <event handle="_a5af0edc68d50e7d4b0" change="1284030621" id="E3303">
      <type>Marriage</type>
      <dateval val="1796-03-14"/>
      <place hlink="_F4VKQCKG4BGBZPTXER"/>
      <description>Marriage of Doyle, Robert Gove and Diaz, Mary Polly</description>
    </event>
    <event handle="_a5af0edc6b11f9d7002" change="1284030622" id="E3304">
      <type>Marriage</type>
      <description>Marriage of Pelletier, Esiquio and Leclerc, Sesaria</description>
    </event>
    <event handle="_a5af0edc6d60ab9e62b" change="1284030628" id="E3305">
      <type>Marriage</type>
      <description>Marriage of Coleman and Garner, Louella Marie</description>
    </event>
    <event handle="_a5af0edc6f528935697" change="1284030620" id="E3306">
      <type>Marriage</type>
      <description>Marriage of Beck, Jack and Garner, Bernadette</description>
    </event>
    <event handle="_a5af0edc713340b1e40" change="1284030622" id="E3307">
      <type>Marriage</type>
      <description>Marriage of Горбунов, Matt and Garner, Cecilia</description>
    </event>
    <event handle="_a5af0edc73122d0a1dc" change="1284030621" id="E3308">
      <type>Marriage</type>
      <dateval val="1947-01-25"/>
      <description>Marriage of Garrett, William Forest and Perkins, Wilma Mae</description>
    </event>
    <event handle="_a5af0edc76455db96a5" change="1284030621" id="E3309">
      <type>Marriage</type>
      <description>Marriage of Perry, M. and Reeves, Elizabeth</description>
    </event>
    <event handle="_a5af0edc78e06cb0cf3" change="1284030623" id="E3310">
      <type>Marriage</type>
      <description>Marriage of Terry, J. and Reeves, Bridget</description>
    </event>
    <event handle="_a5af0edc7ad7ba5dfb6" change="1284030622" id="E3311">
      <type>Marriage</type>
      <description>Marriage of Gagné, Thomas and Reeves, Ann</description>
    </event>
    <event handle="_a5af0edc7ce1de3ff96" change="1284030624" id="E3312">
      <type>Marriage</type>
      <description>Marriage of Desjardins, J. and Reeves, Catherine</description>
    </event>
    <event handle="_a5af0edc7f40ab7b493" change="1284030625" id="E3313">
      <type>Marriage</type>
      <dateval val="1877-08-01"/>
      <description>Marriage of Reeves, John and Flowers, Mary A.</description>
    </event>
    <event handle="_a5af0edc814679c7b76" change="1284030624" id="E3314">
      <type>Marriage</type>
      <dateval val="1577-08-28"/>
      <place hlink="_VTDKQCYD3SP7P8TPUM"/>
      <description>Marriage of Foster, John and Ryan, Elizabeth</description>
    </event>
    <event handle="_a5af0edc8397ac525b8" change="1284030620" id="E3315">
      <type>Marriage</type>
      <description>Marriage of Dixon, Thomas and Warner, Mary</description>
    </event>
    <event handle="_a5af0edc85b3ce5d5fa" change="1284030624" id="E3316">
      <type>Marriage</type>
      <description>Marriage of Warner, Daniel and Higgins, Charity</description>
    </event>
    <event handle="_a5af0edc88c0bc17c8a" change="1284030620" id="E3317">
      <type>Marriage</type>
      <description>Marriage of Лебедев, Trustum and Warner, Johanna</description>
    </event>
    <event handle="_a5af0edc8ae226c4f26" change="1284030623" id="E3318">
      <type>Marriage</type>
      <description>Marriage of Warner, George and Nichols, Elizabeth</description>
    </event>
    <event handle="_a5af0edc8f51fe3ca7d" change="1284030622" id="E3319">
      <type>Marriage</type>
      <description>Marriage of Garrett, William Walker and Lessard, Laura Eloise</description>
    </event>
    <event handle="_a5af0edc9275126a383" change="1284030626" id="E3320">
      <type>Marriage</type>
      <dateval val="1714"/>
      <description>Marriage of Warner, Johnathon and Montgomery, Mary</description>
    </event>
    <event handle="_a5af0edc94656c097db" change="1284030625" id="E3321">
      <type>Marriage</type>
      <dateval val="1836-05-31"/>
      <description>Marriage of Ball, Matthias, Jr. and Snyder, Ann Louisa</description>
    </event>
    <event handle="_a5af0edc9690a9eb4f2" change="1284030624" id="E3322">
      <type>Marriage</type>
      <dateval val="1854-07-23"/>
      <description>Marriage of Ball, Matthias, Jr. and Gonzalez, Eliza Jane</description>
    </event>
    <event handle="_a5af0edc99c5a264acc" change="1284030622" id="E3323">
      <type>Marriage</type>
      <dateval val="1833-09-19"/>
      <place hlink="_NXUKQCAAQRP16CLV56"/>
      <description>Marriage of Roy, Prince Alfred and Marín, Frances Coppage</description>
    </event>
    <event handle="_a5af0edc9c4299e7cc7" change="1284030625" id="E3324">
      <type>Marriage</type>
      <place hlink="_OC6LQCXMKP6NUVYQD8"/>
      <description>Marriage of Munoz, Shadrach M. and Marín, Nancy H.</description>
    </event>
    <event handle="_a5af0edc9ff63211a32" change="1284030620" id="E3325">
      <type>Marriage</type>
      <dateval val="1692-12-28"/>
      <place hlink="_V0WKQCMT0I1602Y009"/>
      <description>Marriage of Harrison, Edward and Allen, Sarah</description>
    </event>
    <event handle="_a5af0edca2237e4b008" change="1284030627" id="E3326">
      <type>Marriage</type>
      <dateval val="1695" type="about"/>
      <place hlink="_V0WKQCMT0I1602Y009"/>
      <description>Marriage of Allen, John and Dennis, Mary (Hannah?)</description>
    </event>
    <event handle="_a5af0edca4a6e8b8b1d" change="1284030626" id="E3327">
      <type>Marriage</type>
      <place hlink="_V0WKQCMT0I1602Y009"/>
      <description>Marriage of Максимов and Allen, Abigail</description>
    </event>
    <event handle="_a5af0edca7361e104f5" change="1284030627" id="E3328">
      <type>Marriage</type>
      <dateval val="1725" type="about"/>
      <place hlink="_V0WKQCMT0I1602Y009"/>
      <description>Marriage of Mendoza, James and Allen, Abigail</description>
    </event>
    <event handle="_a5af0edcaa6139f98e0" change="1284030627" id="E3329">
      <type>Marriage</type>
      <dateval val="1713" type="about"/>
      <place hlink="_NMWKQCLQ9C6TM0UJG9"/>
      <description>Marriage of Allen, Joseph and Barker, Mary</description>
    </event>
    <event handle="_a5af0edcac90e42d0a8" change="1284030621" id="E3330">
      <type>Marriage</type>
      <dateval val="1943-02-14"/>
      <place hlink="_0KUJQCMI3Z1IF14IF7"/>
      <description>Marriage of Cruz, Arthur Ray and Robbins, Myrabel</description>
    </event>
    <event handle="_a5af0edcb015aff5930" change="1284030624" id="E3331">
      <type>Marriage</type>
      <dateval val="1715" type="about"/>
      <place hlink="_V0WKQCMT0I1602Y009"/>
      <description>Marriage of Новиков, Thomas and Allen, Rachel</description>
    </event>
    <event handle="_a5af0edcb2803b43c72" change="1284030620" id="E3332">
      <type>Marriage</type>
      <dateval val="1729" type="about"/>
      <place hlink="_V0WKQCMT0I1602Y009"/>
      <description>Marriage of Allen, Benjamin and Griffith, Experience</description>
    </event>
    <event handle="_a5af0edcb62486223d7" change="1284030626" id="E3333">
      <type>Marriage</type>
      <dateval val="1689" type="about"/>
      <place hlink="_V0WKQCMT0I1602Y009"/>
      <description>Marriage of Norris, John and Новиков, Sarah</description>
    </event>
    <event handle="_a5af0edcb9c32503a3e" change="1284030621" id="E3334">
      <type>Marriage</type>
      <place hlink="_5WVKQCWUPJEI54TBC8"/>
      <description>Marriage of Hernandez, John and Norris, Elizabeth</description>
    </event>
    <event handle="_a5af0edcbd36572b59e" change="1284030628" id="E3335">
      <type>Marriage</type>
      <dateval val="1705" type="about"/>
      <place hlink="_V0WKQCMT0I1602Y009"/>
      <description>Marriage of Allen, Gershom and Kennedy, Ann</description>
    </event>
    <event handle="_a5af0edcbf954f92a21" change="1284030625" id="E3336">
      <type>Marriage</type>
      <description>Marriage of Boyd, Charles Newton and Jones, Martha Elizabeth</description>
    </event>
    <event handle="_a5af0edcc1b3194620d" change="1284030627" id="E3337">
      <type>Marriage</type>
      <description>Marriage of Борисов and Boyd, Carmen Alberta</description>
    </event>
    <event handle="_a5af0edcc396c34ce5b" change="1284030628" id="E3338">
      <type>Marriage</type>
      <dateval val="1919-02-14"/>
      <description>Marriage of Gutiérrez, Walter Harmon and Boyd, Lauretta Esther</description>
    </event>
    <event handle="_a5af0edcc63518f2df2" change="1284030626" id="E3339">
      <type>Marriage</type>
      <dateval val="1942-07-23"/>
      <description>Marriage of Stone, Alfred Wayne and Gutiérrez, Virginia Elizabeth</description>
    </event>
    <event handle="_a5af0edcc8403ccaaa0" change="1284030626" id="E3340">
      <type>Marriage</type>
      <dateval val="1946-06-15"/>
      <description>Marriage of Colon, William and Gutiérrez, Dorothy Jean</description>
    </event>
    <event handle="_a5af0edcca5437183d7" change="1284030622" id="E3341">
      <type>Marriage</type>
      <dateval val="1971-06-26"/>
      <place hlink="_SQ6LQCK58EP1VCZV9N"/>
      <description>Marriage of Warner, Harold Lowell and Powers, Nancy Lou</description>
    </event>
    <event handle="_a5af0edccec0b280926" change="1284030623" id="E3342">
      <type>Marriage</type>
      <dateval val="1946-11"/>
      <description>Marriage of Medina, Wesley G. and Gutiérrez, Joan Arlene</description>
    </event>
    <event handle="_a5af0edcd0d087b968d" change="1284030626" id="E3343">
      <type>Marriage</type>
      <description>Marriage of Hawkins, Beckham and Афанасьев, Angie</description>
    </event>
    <event handle="_a5af0edcd34189f1d85" change="1284030628" id="E3344">
      <type>Marriage</type>
      <dateval val="1945-06-22"/>
      <description>Marriage of Hawkins, William Melvin and Gibbs, Ruth</description>
    </event>
    <event handle="_a5af0edcd5e6c2b857f" change="1284030627" id="E3345">
      <type>Marriage</type>
      <description>Marriage of Torres and Hawkins, Gail</description>
    </event>
    <event handle="_a5af0edcd7d680d6d49" change="1284030625" id="E3346">
      <type>Marriage</type>
      <description>Marriage of Stewart and Hawkins, Janelle</description>
    </event>
    <event handle="_a5af0edcd9a0cf45244" change="1284030624" id="E3347">
      <type>Marriage</type>
      <description>Marriage of Becker and Hawkins, Jean</description>
    </event>
    <event handle="_a5af0edcdb95e2c7e1b" change="1284030622" id="E3348">
      <type>Marriage</type>
      <description>Marriage of Waters and Webb, Mary</description>
    </event>
    <event handle="_a5af0edcdda1224116d" change="1284030625" id="E3349">
      <type>Marriage</type>
      <description>Marriage of Давыдов and Ball, Jane</description>
    </event>
    <event handle="_a5af0edce095d0a0374" change="1284030628" id="E3350">
      <type>Marriage</type>
      <description>Marriage of González and Ball, Martha</description>
    </event>
    <event handle="_a5af0edce272861a19b" change="1284030626" id="E3351">
      <type>Marriage</type>
      <dateval val="1840-11-05"/>
      <place hlink="_NWILQCT96TFRES5T28"/>
      <description>Marriage of Moreno, Thomas H. and Dąbrowski, Letitia C.</description>
    </event>
    <event handle="_a5af0edce5b60f00ca5" change="1284030626" id="E3352">
      <type>Marriage</type>
      <description>Marriage of Cruz, Everett and Lessard, Susanna Marie</description>
    </event>
    <event handle="_a5af0edcf3349813a7a" change="1284030622" id="E3353">
      <type>Marriage</type>
      <dateval val="1848-01-07"/>
      <description>Marriage of Andersen, Samuel and Moreno, Delilah</description>
    </event>
    <event handle="_a5af0edcf607e1331a4" change="1284030624" id="E3354">
      <type>Marriage</type>
      <dateval val="1849-11-29"/>
      <description>Marriage of Porter, David and Moreno, Mary H.</description>
    </event>
    <event handle="_a5af0edcf8b5bcbf0f0" change="1284030624" id="E3355">
      <type>Marriage</type>
      <description>Marriage of Álvarez and Porter, Mahala J.</description>
    </event>
    <event handle="_a5af0edcfab6ccabd2c" change="1284030627" id="E3356">
      <type>Marriage</type>
      <description>Marriage of Joseph, Alfred and Moreno, Minerva</description>
    </event>
    <event handle="_a5af0edcfe00d466ece" change="1284030622" id="E3357">
      <type>Marriage</type>
      <dateval val="1858-04-22"/>
      <description>Marriage of Moreno, Solon and Perkins, Lydia</description>
    </event>
    <event handle="_a5af0edd00e42168d43" change="1284030626" id="E3358">
      <type>Marriage</type>
      <dateval val="1855-07-12"/>
      <description>Marriage of Moreno, Darius and Craig, Mary J.</description>
    </event>
    <event handle="_a5af0edd03b52c5a47f" change="1284030625" id="E3359">
      <type>Marriage</type>
      <description>Marriage of Ball, William M. and Moreno, Phebe J.</description>
    </event>
    <event handle="_a5af0edd058769caaf9" change="1284030627" id="E3360">
      <type>Marriage</type>
      <description>Marriage of Patton, Adolph and Moreno, Lelia L.</description>
    </event>
    <event handle="_a5af0edd0781f57b739" change="1284030626" id="E3361">
      <type>Marriage</type>
      <description>Marriage of Moreno, Christian and Price, Mary</description>
    </event>
    <event handle="_a5af0edd0951a11c8c6" change="1284030621" id="E3362">
      <type>Marriage</type>
      <description>Marriage of Ford and Moreno, Elizabeth</description>
    </event>
    <event handle="_a5af0edd0cb7283a112" change="1284030622" id="E3363">
      <type>Marriage</type>
      <description>Marriage of Watson, Alvin E. and Warner, Beverly Ann</description>
    </event>
    <event handle="_a5af0edd0ef6bbeb6c7" change="1284030620" id="E3364">
      <type>Marriage</type>
      <description>Marriage of Chambers, William and Moreno, Leah</description>
    </event>
    <event handle="_a5af0edd10c7249ef31" change="1284030622" id="E3365">
      <type>Marriage</type>
      <description>Marriage of Романов, John and Moreno, Delilah</description>
    </event>
    <event handle="_a5af0edd128151dc869" change="1284030620" id="E3366">
      <type>Marriage</type>
      <description>Marriage of Moreno, Esau and Caron, Mary E.</description>
    </event>
    <event handle="_a5af0edd14b7b2b4148" change="1284030623" id="E3367">
      <type>Marriage</type>
      <description>Marriage of Martin and Moreno, Mary Ann</description>
    </event>
    <event handle="_a5af0edd1d33fb8c69a" change="1284030626" id="E3368">
      <type>Marriage</type>
      <dateval val="1970-01-01"/>
      <place hlink="_I32KQCN8VNTGQ2ECOT"/>
      <description>Marriage of French, Jimmy Michael and Warner, Martha Ellen</description>
    </event>
    <event handle="_a5af0edd2b0368ed698" change="1284030627" id="E3369">
      <type>Marriage</type>
      <description>Marriage of Alvarado, Jack D. and Warner, Shirley Kay</description>
    </event>
    <event handle="_a5af0edd3b4366541de" change="1284030623" id="E3370">
      <type>Marriage</type>
      <dateval val="1843-11-14"/>
      <place hlink="_GIXKQCD42D5A7CFLNJ"/>
      <description>Marriage of Ball, Matthias, Jr. and Moreno, Abigail Chapman</description>
    </event>
    <event handle="_a5af0edd3e30892e286" change="1284030624" id="E3371">
      <type>Marriage</type>
      <dateval val="1896-03-05"/>
      <place hlink="_IO1LQCFOHRDYDV1N19"/>
      <description>Marriage of Webb, Francis Irvin and Todd, Louella Jane</description>
    </event>
    <event handle="_a5af0edd4e632fadb3e" change="1284030623" id="E3372">
      <type>Marriage</type>
      <dateval val="1979-06-23"/>
      <place hlink="_RKUJQCO4HYJNL1ZNSE"/>
      <description>Marriage of Welch, Michael and Osborne, Anita June</description>
    </event>
    <event handle="_a5af0edd5b87e3d1502" change="1284030624" id="E3373">
      <type>Marriage</type>
      <description>Marriage of Warner, Michael Louis and Warren, Pansy L.</description>
    </event>
    <event handle="_a5af0edd6cd1ace6690" change="1284030624" id="E3374">
      <type>Marriage</type>
      <description>Marriage of Fernandez, Thomas and Couture, Honora</description>
    </event>
    <event handle="_a5af0edd7c17556366a" change="1284030622" id="E3375">
      <type>Marriage</type>
      <description>Marriage of Landry, Michael Edward and Brady, CatherineJosephine</description>
    </event>
    <event handle="_a5af0edd83b48588769" change="1284030624" id="E3376">
      <type>Marriage</type>
      <description>Marriage of Harris, Lawrence and Landry, Alice</description>
    </event>
    <event handle="_a5af0edd864766a1e9d" change="1284030623" id="E3377">
      <type>Marriage</type>
      <dateval val="1920-04-17"/>
      <description>Marriage of Landry, Maurice T. and Estrada, Mary Claire</description>
    </event>
    <event handle="_a5af0edd888498367ea" change="1284030627" id="E3378">
      <type>Marriage</type>
      <dateval val="1928-09-08"/>
      <description>Marriage of Landry, Maurice T. and Vargas, Caroline Metzger</description>
    </event>
    <event handle="_a5af0edd8ad6b7685c3" change="1284030628" id="E3379">
      <type>Marriage</type>
      <dateval val="1922-10-14"/>
      <description>Marriage of Landry, John Anthony and Harris, Ella Mae</description>
    </event>
    <event handle="_a5af0edd8fe63a36b06" change="1284030624" id="E3380">
      <type>Marriage</type>
      <dateval val="1863-04-27"/>
      <place hlink="_M03LQCQH583KOA1SZT"/>
      <description>Marriage of Fernandez, Thomas and Ortega, Catherine</description>
    </event>
    <event handle="_a5af0edd94b75957402" change="1284030624" id="E3381">
      <type>Marriage</type>
      <dateval val="1821-12-27"/>
      <description>Marriage of Зыков, John and Hopkins, Mary Eve</description>
    </event>
    <event handle="_a5af0edd96f0fc65424" change="1284030620" id="E3382">
      <type>Marriage</type>
      <description>Marriage of 鈴木, Allen and Marín, Alice</description>
    </event>
    <event handle="_a5af0edd98b5c88ba37" change="1284030622" id="E3383">
      <type>Marriage</type>
      <description>Marriage of Olson, ??????? and Marín, Alice</description>
    </event>
    <event handle="_a5af0edd9ab4feae2bf" change="1284030621" id="E3384">
      <type>Marriage</type>
      <description>Marriage of Marín, Willis H. and Floyd, Sarah (Sally)</description>
    </event>
    <event handle="_a5af0edd9ce154b71ed" change="1284030625" id="E3385">
      <type>Marriage</type>
      <description>Marriage of Тарасов, Simon and Todd, Flora Belle</description>
    </event>
    <event handle="_a5af0edd9f135377c71" change="1284030625" id="E3386">
      <type>Marriage</type>
      <dateval val="1940-09-25"/>
      <place hlink="_947LQCS41MGCGO0096"/>
      <description>Marriage of Webb, John Raymond and Ford, Lorinda Catherine</description>
    </event>
    <event handle="_a5af0edda204e583cf7" change="1284030626" id="E3387">
      <type>Marriage</type>
      <place hlink="_RKUJQCO4HYJNL1ZNSE"/>
      <description>Marriage of Ильин, Gary and Webb, Marilyn Jean</description>
    </event>
    <event handle="_a5af0edda500eea4d4b" change="1284030623" id="E3388">
      <type>Marriage</type>
      <dateval val="1967" type="before"/>
      <place hlink="_5HTJQCSB91P69HY731"/>
      <description>Marriage of Gill, Lawrence and Webb, Joan Lorinda</description>
    </event>
    <event handle="_a5af0edda7f78ea943e" change="1284030625" id="E3389">
      <type>Marriage</type>
      <dateval val="1988-09-17"/>
      <place hlink="_RIXJQCEANQB26N0ZWF"/>
      <description>Marriage of Mcbride, Paul and Данилов, Barbara Joanne</description>
    </event>
    <event handle="_a5af0eddaa773380822" change="1284030623" id="E3390">
      <type>Marriage</type>
      <dateval val="1982-04-24"/>
      <place hlink="_EUWJQCW66SGQFSFIO8"/>
      <description>Marriage of Данилов, Darrell Edwin and Ross, Evelyn Almazon</description>
    </event>
    <event handle="_a5af0eddad30ae0e777" change="1284030626" id="E3391">
      <type>Marriage</type>
      <dateval val="1989-06-10"/>
      <place hlink="_RIXJQCEANQB26N0ZWF"/>
      <description>Marriage of Jørgensen, Jeffrey and Osborne, Julia Marie</description>
    </event>
    <event handle="_a5af0eddafe6208404b" change="1284030623" id="E3392">
      <type>Marriage</type>
      <dateval val="1845-01-01"/>
      <place hlink="_JA1LQCNAD7HRNZSJEJ"/>
      <description>Marriage of Warner, Piatt D. and Fox, Julia Colville</description>
    </event>
    <event handle="_a5af0eddb5c11d2d766" change="1284030625" id="E3393">
      <type>Marriage</type>
      <dateval val="1868-03-24"/>
      <place hlink="_V67LQCYQT8F9J6IN0X"/>
      <description>Marriage of Lessard, Isaac and Domínguez, Mary E.</description>
    </event>
    <event handle="_a5af0eddb9f7033d790" change="1284030623" id="E3394">
      <type>Marriage</type>
      <dateval val="1968-08-03"/>
      <description>Marriage of Cruz, Gerald Ray and Rasmussen, Marilyn Joan</description>
    </event>
    <event handle="_a5af0eddbc93cd15f4c" change="1284030628" id="E3395">
      <type>Marriage</type>
      <dateval val="1966-11-12"/>
      <description>Marriage of Максимов, Rodney Herman and Cruz, Janis Marlene</description>
    </event>
    <event handle="_a5af0eddbee1371eef4" change="1284030625" id="E3396">
      <type>Marriage</type>
      <dateval val="1982-04-24"/>
      <description>Marriage of Cruz, James Richard and Morales, Penelope Margot</description>
    </event>
    <event handle="_a5af0eddc1137877e2c" change="1284030628" id="E3397">
      <type>Marriage</type>
      <dateval val="1963-09-05"/>
      <description>Marriage of Cruz, Thomas Everett and Briggs, Joyce Inez</description>
    </event>
    <event handle="_a5af0eddc39494d07b2" change="1284030625" id="E3398">
      <type>Marriage</type>
      <dateval val="1962-01-20"/>
      <description>Marriage of Welch, Paul Allen and Cruz, Linda Helen</description>
    </event>
    <event handle="_a5af0eddc5e2a2d23c7" change="1284030623" id="E3399">
      <type>Marriage</type>
      <dateval val="1968-08-17"/>
      <description>Marriage of Cruz, Dale Eugene and Gill, Linda</description>
    </event>
    <event handle="_a5af0eddc853423c709" change="1284030624" id="E3400">
      <type>Marriage</type>
      <dateval val="1967-04-07"/>
      <description>Marriage of Cruz, David Wayne and Nunez, Barbara Ann</description>
    </event>
    <event handle="_a5af0eddcad35ba520a" change="1284030624" id="E3401">
      <type>Marriage</type>
      <dateval val="1984-05-12"/>
      <description>Marriage of West, Ronald David and Cruz, Melinda Lou</description>
    </event>
    <event handle="_a5af0eddcd16bd125df" change="1284030626" id="E3402">
      <type>Marriage</type>
      <dateval val="1974-03-30"/>
      <description>Marriage of Peters, John C. and Cruz, Joyce Marie</description>
    </event>
    <event handle="_cc8205d81e2695b08bc" change="1402521343" id="E3403">
      <type>Birth</type>
      <dateval val="0570-04-19"/>
    </event>
    <event handle="_cc8205d86c903db892d" change="1402521395" id="E3404">
      <type>Death</type>
      <dateval val="0632-06-08"/>
    </event>
    <event handle="_cc8205d86fc4e9706a5" change="1402522476" id="E3405">
      <type>Marriage</type>
      <dateval val="0610"/>
    </event>
    <event handle="_cc820604e846de3c210" change="1403157667" id="E3406">
      <type>Birth</type>
      <dateval val="0164-03" cformat="Islamic"/>
    </event>
    <event handle="_cc820604ebe2877212d" change="1403157610" id="E3407">
      <type>Death</type>
      <dateval val="0241-03-12" cformat="Islamic"/>
    </event>
    <event handle="_cc820604ef05cb67907" change="1403158792" id="E3408">
      <type>Marriage</type>
      <dateval val="0204" cformat="Islamic"/>
    </event>
    <event handle="_cc820604f313cc072c6" change="1403157647" id="E3409">
      <type>Death</type>
      <dateval val="0241-03-12" cformat="Islamic"/>
    </event>
    <event handle="_cc820604f6364f627bf" change="1403159091" id="E3410">
      <type>Death</type>
      <dateval val="0234" cformat="Islamic"/>
    </event>
    <event handle="_cc820604f967aa1d9a5" change="1403159681" id="E3411">
      <type>Birth</type>
      <dateval val="0213" cformat="Islamic"/>
    </event>
    <event handle="_cc820604fcf3d08a81a" change="1403159708" id="E3412">
      <type>Death</type>
      <dateval val="0290" cformat="Islamic"/>
    </event>
    <event handle="_cc82060500222649d98" change="1403159938" id="E3413">
      <type>Birth</type>
      <dateval val="0203" cformat="Islamic"/>
    </event>
    <event handle="_cccc047c40841a5993c" change="1407353879" id="E3414">
      <type>Death</type>
      <dateval val="1850" type="about" quality="estimated"/>
    </event>
    <event handle="_d583a5b672908d7f672" change="1467134452" id="E3416">
      <type>Birth</type>
      <dateval val="1940-03-01"/>
      <place hlink="_d583a5b7ab21971300a"/>
    </event>
    <event handle="_d583a5b85f01638dd55" change="1467134586" id="E3417">
      <type>Birth</type>
      <dateval val="1950-06-18"/>
      <place hlink="_d583a5b8614206a939d"/>
    </event>
    <event handle="_d583a5b86bd789d3e05" change="1467134680" id="E3418">
      <type>Marriage</type>
      <dateval val="1970-09-09"/>
    </event>
    <event handle="_d583a5b879148ab75f7" change="1467134840" id="E3419">
      <type>Birth</type>
      <dateval val="1971-11-05"/>
      <place hlink="_d583a5b7ab21971300a"/>
    </event>
    <event handle="_d583a5b88403b5a824a" change="1467136321" id="E3420">
      <type>Birth</type>
      <dateval val="1973-04-11"/>
      <place hlink="_d583a5b7ab21971300a"/>
    </event>
    <event handle="_d583a5b8904116c34d3" change="1467135146" id="E3421">
      <type>Birth</type>
      <dateval val="1974-12-03"/>
      <place hlink="_d583a5b7ab21971300a"/>
    </event>
    <event handle="_d583a5b89b831343389" change="1467135233" id="E3422">
      <type>Birth</type>
      <dateval val="1976-09-29"/>
      <place hlink="_d583a5b7ab21971300a"/>
    </event>
    <event handle="_d583a5b8a694a781120" change="1467135764" id="E3423">
      <type>Birth</type>
      <dateval val="1910-06-29"/>
      <place hlink="_d583a5b8a8c1474357d"/>
    </event>
    <event handle="_d583a5b8b332fde7538" change="1467135789" id="E3424">
      <type>Birth</type>
      <dateval val="1920-04-07"/>
      <place hlink="_d583a5b8b586fb992c8"/>
    </event>
    <event handle="_d583a5b8c141abfbc46" change="1467136006" id="E3425">
      <type>Birth</type>
      <dateval val="1915-03-10"/>
      <place hlink="_d583a5b8c380fb024c9"/>
    </event>
    <event handle="_d583a5b8ced2d8929f9" change="1467136080" id="E3426">
      <type>Birth</type>
      <dateval val="1925-07-15"/>
      <place hlink="_d583a5b8d1106cda712"/>
    </event>
    <event handle="_d583a5b8de520210f77" change="1467136226" id="E3427">
      <type>Birth</type>
      <dateval val="1978-11-30"/>
      <place hlink="_d583a5b7ab21971300a"/>
    </event>
    <event handle="_d583a5b8e960ad443de" change="1467136416" id="E3428">
      <type>Death</type>
      <dateval val="1990-02-02"/>
    </event>
    <event handle="_d583a5b8edc2aa78850" change="1467136449" id="E3429">
      <type>Death</type>
      <dateval val="1995-03-02"/>
    </event>
    <event handle="_d583a5b8f8727b426aa" change="1467136571" id="E3430">
      <type>Death</type>
      <dateval val="2005-06-28"/>
    </event>
    <event handle="_d583a5b8fcd3f653b21" change="1467136997" id="E3431">
      <type>Death</type>
      <dateval val="2006-01-11"/>
    </event>
  </events>
	'''
	}
