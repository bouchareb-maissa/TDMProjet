package com.example.tdmprojet

data class textJItem(
    val AR_Keywords: List<ARKeyword>,
    val AR_Liens: List<ARLien>,
    val ATexte: String,
    val A_PDFFileName: String,
    val AnneeJO: String,
    val  DPublication_AR: String,
    val  DSignature_AR: String,
    val  DSignature_FR: String,
    val  Dpublication_FR: String,
    val FR_Keywords: List<FRKeyword>,
    val FTexte: String,
    val F_PDFFileName: String,
    val NumJO: String,
    val NumSGG: String,
    val Organe_AR: String,
    val Organe_FR: String,
    val Page_AR: String,
    val Page_FR: String,
    val Secteurs: List<Secteur>,
    val Sommaire_AR: String,
    val Sommaire_FR: String,
    val Texte_AR: String,
    val Texte_FR: String
)