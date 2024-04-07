package net.helcel.beans.countries

enum class Country(
    override val fullName: String,
    override val area: Int
) : GeoLoc {
    ATA("Antarctica", 14000000),
    HKG("Hong Kong", 1104),
    MAC("Macao", 32),
    ANT("Netherlands Antilles", 800),
    AFG("Afghanistan", 645487),
    XAD("Akrotiri and Dhekelia", 234),
    ALA("Åland", 1483),
    ALB("Albania", 28755),
    DZA("Algeria", 2316624),
    ASM("American Samoa", 205),
    AND("Andorra", 451),
    AGO("Angola", 1254492),
    AIA("Anguilla", 80),
    ATG("Antigua and Barbuda", 438),
    ARG("Argentina", 2785500),
    ARM("Armenia", 29724),
    ABW("Aruba", 183),
    AUS("Australia", 7720095),
    AUT("Austria", 83897),
    AZE("Azerbaijan", 86331),
    BHS("Bahamas", 13437),
    BHR("Bahrain", 718),
    BGD("Bangladesh", 140002),
    BRB("Barbados", 437),
    BLR("Belarus", 206665),
    BEL("Belgium", 30668),
    BLZ("Belize", 22164),
    BEN("Benin", 116014),
    BMU("Bermuda", 68),
    BTN("Bhutan", 38913),
    BOL("Bolivia", 1090425),
    BES("Bonaire, Sint Eustatius and Saba", 325),
    BIH("Bosnia and Herzegovina", 51081),
    BWA("Botswana", 580648),
    BVT("Bouvet Island", 77),
    BRA("Brazil", 8560656),
    IOT("British Indian Ocean Territory", 65),
    VGB("British Virgin Islands", 169),
    BRN("Brunei", 5815),
    BGR("Bulgaria", 111647),
    BFA("Burkina Faso", 274620),
    BDI("Burundi", 27113),
    KHM("Cambodia", 182800),
    CMR("Cameroon", 469101),
    CAN("Canada", 9925768),
    CPV("Cabo Verde", 4115),
    XCA("Caspian Sea", 371885),
    CYM("Cayman Islands", 282),
    CAF("Central African Republic", 624264),
    TCD("Chad", 1277250),
    CHL("Chile", 753785),
    CHN("China", 9405272),
    CXR("Christmas Island", 140),
    XCL("Clipperton Island", 10),
    CCK("Cocos Islands", 14),
    COL("Colombia", 1144791),
    COM("Comoros", 1684),
    COK("Cook Islands", 281),
    CRI("Costa Rica", 51511),
    CIV("Côte d'Ivoire", 323636),
    HRV("Croatia", 57065),
    CUB("Cuba", 111255),
    CUW("Curaçao", 440),
    CYP("Cyprus", 5733),
    CZE("Czechia", 78754),
    COD("Democratic Republic of the Congo", 2344314),
    DNK("Denmark", 43034),
    DJI("Djibouti", 22509),
    DMA("Dominica", 759),
    DOM("Dominican Republic", 48348),
    ECU("Ecuador", 258071),
    EGY("Egypt", 987766),
    SLV("El Salvador", 20545),
    GNQ("Equatorial Guinea", 27138),
    ERI("Eritrea", 121150),
    EST("Estonia", 45354),
    ETH("Ethiopia", 1136255),
    FLK("Falkland Islands", 12370),
    FRO("Faroe Islands", 1434),
    FJI("Fiji", 19057),
    FIN("Finland", 335489),
    FRA("France", 549335),
    GUF("French Guiana", 83856),
    PYF("French Polynesia", 4053),
    ATF("French Southern Territories", 7852),
    GAB("Gabon", 266332),
    GMB("Gambia", 10731),
    GEO("Georgia", 6989),
    DEU("Germany", 35732),
    GHA("Ghana", 241025),
    GIB("Gibraltar", 7),
    GRC("Greece", 132751),
    GRL("Greenland", 2139125),
    GRD("Grenada", 362),
    GLP("Guadeloupe", 1658),
    GUM("Guam", 554),
    GTM("Guatemala", 109777),
    GGY("Guernsey", 88),
    GIN("Guinea", 246356),
    GNB("Guinea-Bissau", 34088),
    GUY("Guyana", 211133),
    HTI("Haiti", 27258),
    HMD("Heard Island and Mc Donald Island", 362),
    HND("Honduras", 112950),
    HUN("Hungary", 92993),
    ISL("Iceland", 101781),
    IND("India", 3166019),
    IDN("Indonesia", 1902704),
    IRN("Iran", 1626366),
    IRQ("Iraq", 437670),
    IRL("Ireland", 70131),
    IMN("Isle of Man", 578),
    ISR("Israel", 22226),
    ITA("Italy", 300894),
    JAM("Jamaica", 11061),
    JPN("Japan", 373106),
    JEY("Jersey", 125),
    JOR("Jordan", 89464),
    KAZ("Kazakhstan", 2728680),
    KEN("Kenya", 589936),
    KIR("Kiribati", 1017),
    XKO("Kosovo", 10843),
    KWT("Kuwait", 17486),
    KGZ("Kyrgyzstan", 197618),
    LAO("Laos", 231104),
    LVA("Latvia", 64537),
    LBN("Lebanon", 10265),
    LSO("Lesotho", 30653),
    LBR("Liberia", 96550),
    LBY("Libya", 1622430),
    LIE("Liechtenstein", 159),
    LTU("Lithuania", 64862),
    LUX("Luxembourg", 2579),
    SXM("Sint Maarten", 38),
    MKD("North Macedonia", 24930),
    MDG("Madagascar", 594538),
    MWI("Malawi", 118637),
    MYS("Malaysia", 331770),
    MDV("Maldives", 281),
    MLI("Mali", 1258093),
    MLT("Malta", 324),
    MHL("Marshall Islands", 285),
    MTQ("Martinique", 1124),
    MRT("Mauritania", 1046483),
    MUS("Mauritius", 2036),
    MYT("Mayotte", 394),
    MEX("México", 1960059),
    FSM("Micronesia", 770),
    MDA("Moldova", 33889),
    MCO("Monaco", 2),
    MNG("Mongolia", 1565638),
    MNE("Montenegro", 13342),
    MSR("Montserrat", 101),
    MAR("Morocco", 414714),
    MOZ("Mozambique", 791805),
    MMR("Myanmar", 672590),
    NAM("Namibia", 828017),
    NRU("Nauru", 22),
    NPL("Nepal", 148210),
    NLD("Netherlands", 37624),
    NCL("New Caledonia", 18916),
    NZL("New Zealand", 268937),
    NIC("Nicaragua", 128957),
    NER("Niger", 1190189),
    NGA("Nigeria", 914161),
    NIU("Niue", 268),
    NFK("Norfolk Island", 41),
    PRK("North Korea", 122844),
    ZNC("Northern Cyprus", 3321),
    MNP("Northern Mariana Islands", 506),
    NOR("Norway", 323747),
    OMN("Oman", 310686),
    PAK("Pakistan", 877139),
    PLW("Palau", 484),
    PSE("Palestine", 6238),
    PAN("Panama", 75933),
    PNG("Papua New Guinea", 466628),
    PRY("Paraguay", 401148),
    PER("Peru", 1300636),
    PHL("Philippines", 297628),
    PCN("Pitcairn Islands", 54),
    POL("Poland", 311892),
    PRT("Portugal", 91999),
    PRI("Puerto Rico", 9019),
    QAT("Qatar", 11633),
    COG("Republic of the Congo", 344030),
    REU("Réunion", 2526),
    ROU("Romania", 238297),
    RUS("Russia", 16869756),
    RWA("Rwanda", 25449),
    BLM("Saint-Barthélemy", 21),
    MAF("Saint-Martin", 56),
    SHN("Saint Helena, Ascension and Tris", 412),
    KNA("Saint Kitts and Nevis", 269),
    LCA("Saint Lucia", 618),
    SPM("Saint Pierre and Miquelon", 227),
    VCT("Saint Vincent and the Grenadines", 400),
    WSM("Samoa", 2871),
    SMR("San Marino", 61),
    STP("São Tomé and Príncipe", 1009),
    SAU("Saudi Arabia", 1931654),
    SEN("Senegal", 198056),
    SRB("Serbia", 78247),
    SYC("Seychelles", 492),
    SLE("Sierra Leone", 73067),
    SGP("Singapore", 700),
    SVK("Slovakia", 49055),
    SVN("Slovenia", 19951),
    SLB("Solomon Islands", 28686),
    SOM("Somalia", 637672),
    ZAF("South Africa", 1224059),
    SGS("South Georgia and the South Sandwich Islands", 4085),
    KOR("South Korea", 100721),
    SSD("South Sudan", 632186),
    ESP("Spain", 506617),
    LKA("Sri Lanka", 66267),
    SDN("Sudan", 1882758),
    SUR("Suriname", 147402),
    SJM("Svalbard and Jan Mayen", 59960),
    SWZ("Swaziland", 17451),
    SWE("Sweden", 448298),
    CHE("Switzerland", 41217),
    SYR("Syria", 187360),
    TWN("Taiwan", 36571),
    TJK("Tajikistan", 142330),
    TZA("Tanzania", 946695),
    THA("Thailand", 516901),
    TLS("Timor-Leste", 15012),
    TGO("Togo", 57272),
    TKL("Tokelau", 15),
    TON("Tonga", 762),
    TTO("Trinidad and Tobago", 5193),
    TUN("Tunisia", 155257),
    TUR("Turkey", 781794),
    TKM("Turkmenistan", 490273),
    TCA("Turks and Caicos Islands", 995),
    TUV("Tuvalu", 40),
    UGA("Uganda", 243045),
    UKR("Ukraine", 600816),
    ARE("United Arab Emirates", 71429),
    GBR("United Kingdom", 244732),
    USA("United States", 9477483),
    UMI("United States Minor Outlying Islands", 47),
    URY("Uruguay", 178103),
    UZB("Uzbekistan", 447894),
    VUT("Vanuatu", 12384),
    VAT("Vatican City", 1),
    VEN("Venezuela", 918303),
    VNM("Vietnam", 331121),
    VIR("Virgin Islands, U.S.", 364),
    WLF("Wallis and Futuna", 157),
    ESH("Western Sahara", 268500),
    YEM("Yemen", 454747),
    ZMB("Zambia", 755679),
    ZWE("Zimbabwe", 392107),
    ;

    override val code = this.name
    override val type = GeoLoc.LocType.COUNTRY
    override val children: MutableList<GeoLoc> = ArrayList()
}
