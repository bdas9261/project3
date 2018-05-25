package pageObjects;

import org.openqa.selenium.By;

public class BusinessAdvisorObjects {

	public static By btnBusinessAdvisor = By.id("BA");
	public static By btnSrchBaPgrm_SearchBA = By.id("baSearchButton");
	public static By btnSrchBaPgrm_CreateNew = By.id("createNew");
	public static By btnCreateBA_CreateBA = By.id("newBAProgramSubmit");
	public static By btnUpdateBAPgm = By.id("updateBAProgram");
	public static By btnNewBAPgm = By.xpath("//a[text()='New BA Program']");
	public static By btnNewBAPgmTracking = By.xpath("//a[text()='BA Program Tracking']");
	public static By btnUploadBANominations = By.xpath("//a[text()='Upload BA Nominations']");
	public static By btnUploadFile = By.id("baNominationsUploadFile");

	public static By btnAddWave= By.id("addWave");
	public static By btnAddUpdteNominationCriteria = By.id("addUpdateNominationCriteria");
	public static By btnAddUpdteNominationDetails = By.id("addUpdateNominationDetails");
	public static By btnSubmit = By.id("sData");
	public static By btnCancel = By.id("cData");
	public static By btnChooseFile = By.id("baNominationsUploadFile");
	public static By btnUpload = By.id("baNominationsSubmit");

	public static By btnAddBA = By.id("addNomination");
	public static By btnInitateApprovals = By.id("InitiateApprovals");
	public static By btnNomination_edit = By.xpath("//input[@value='Edit']");
	public static By btnNomination_delete = By.xpath("//input[@value='Delete']");
	public static By btnNomination_delete2 = By.xpath("//button[text()='Delete']");
	public static By btnNomination_save = By.xpath("//input[@value='Save Nomination']");
	public static By btnBATracking_PostLaunch = By.id("baPostLaunchUpdateButton");
	public static By btnBATracking_PreLaunch = By.id("baPreLaunchUpdateButton");
	public static By btnBATracking_PreLaunchUpdate = By.id("baPreLaunchUpdate");
	public static By btnBATracking_PostLaunchUpdate = By.id("baPostLaunchUpdate");

	public static By lstSrchBaPgrm_ClientName = By.id("ClientID");
	public static By lstSrchBaPgrm_BaID = By.id("BAProgramList");
	public static By lstCreateBA_ContName = By.id("NewBAProgram_ContractID");
	public static By lstCreateBA_Capability = By.id("NewBAProgram_CapabilityID");
	public static By lstCreateBA_Tower = By.id("NewBAProgram_TowerID");
	public static By lstCreateBA_Locations = By.id("NewBAProgram_DeliveryLocationID");
	public static By lstCreateBA_BARole = By.id("NewBAProgram_BARoleID");
	public static By lstSrchBA_ContName = By.id("ContractList");
	public static By lstSrchBA_Location = By.id("PriDelLocList");
	public static By lstSrchBA_Offering = By.id("CapabilityList");
	public static By lstSrchBA_Tower = By.id("TowerList");
	public static By lstNominations_Offering = By.id("NewBACreateNominations_OfferingID");
	public static By lstNominations_Tower = By.id("NewBACreateNominations_BANominationTowerID");
	public static By lstNominations_BARole = By.id("NewBACreateNominations_BAProcessRoleID");
	public static By lstNominations_Location = By.id("NewBACreateNominations_LocationID");
	public static By lstNominations_OpGroup = By.id("NewBACreateNominations_OperatingGroupID");
	public static By lstNominations_Industry = By.id("NewBACreateNominations_IndustryID");
	public static By lstNominations_WorkCategory = By.id("NewBACreateNominations_WorkCategoryID");
	public static By lstNominations_AnalLevel = By.id("NewBACreateNominations_AnalyticsLevelID");
	public static By lstNominations_BOICategory = By.id("NewBACreateNominations_BOICategoryID");
	public static By lstNominations_ServComponent = By.id("NewBACreateNominations_ServiceComponentID");

	public static By lblNominations_MaxHeadCnt = By.id("MaxH");
	public static By lblNominations_CurrentHeadCnt = By.id("CurrentH");

	public static By tblSrchResults = By.id("searchResults");
	public static By tblNominatioCriteria = By.id("nominationCriteria");
	public static By tblNominatios= By.id("Nominations");
	public static By tblPreLaunch= By.id("baPreLaunch");
	public static By tblPostLaunch= By.id("baPreLaunch");
	public static By tblfalloutRecords = By.id("falloutRecords");

	public static By tdPreFirstRowActDate = By.xpath("(//*[@aria-describedby='baPreLaunch_ActualCompletionDate'])[1]");
	public static By tdPreSecondRowActDate = By.xpath("(//*[@aria-describedby='baPreLaunch_ActualCompletionDate'])[2]");
	public static By tdPreThirdRowActDate = By.xpath("(//*[@aria-describedby='baPreLaunch_ActualCompletionDate'])[3]");

	public static By tdPreFirstRowWorkStream = By.xpath("(//*[@aria-describedby='baPreLaunch_WorkStream'])[1]");
	public static By tdPreSecondRowWorkStream = By.xpath("(//*[@aria-describedby='baPreLaunch_WorkStream'])[2]");
	public static By tdPreThirdRowWorkStream = By.xpath("(//*[@aria-describedby='baPreLaunch_WorkStream'])[3]");

	public static By tdPreFirstRAG = By.xpath("(//*[@aria-describedby='baPreLaunch_RAG'])[1]");
	public static By tdPreSecondRAG = By.xpath("(//*[@aria-describedby='baPreLaunch_RAG'])[2]");
	public static By tdPreThirdRAG = By.xpath("(//*[@aria-describedby='baPreLaunch_RAG'])[3]");

	public static By tdPreFirstRowTargetDate = By.xpath("(//*[@aria-describedby='baPreLaunch_TargetDate'])[1]");
	public static By tdPreSecondRowTargetDate = By.xpath("(//*[@aria-describedby='baPreLaunch_TargetDate'])[2]");
	public static By tdPreThirdRowTargetDate = By.xpath("(//*[@aria-describedby='baPreLaunch_TargetDate'])[3]");

	public static By tdPostFirstRowActDate = By.xpath("(//*[@aria-describedby='baPostLaunch_ActualCompletionDate'])[1]");
	public static By tdPostSecondRowActDate = By.xpath("(//*[@aria-describedby='baPostLaunch_ActualCompletionDate'])[2]");
	public static By tdPostThirdRowActDate = By.xpath("(//*[@aria-describedby='baPostLaunch_ActualCompletionDate'])[3]");

	public static By tdPostFirstRowWorkStream = By.xpath("(//*[@aria-describedby='baPostLaunch_WorkStream'])[1]");
	public static By tdPostSecondRowWorkStream = By.xpath("(//*[@aria-describedby='baPostLaunch_WorkStream'])[2]");
	public static By tdPostThirdRowWorkStream = By.xpath("(//*[@aria-describedby='baPostLaunch_WorkStream'])[3]");

	public static By tdPostFirstRAG = By.xpath("(//*[@aria-describedby='baPostLaunch_RAG'])[1]");
	public static By tdPostSecondRAG = By.xpath("(//*[@aria-describedby='baPostLaunch_RAG'])[2]");
	public static By tdPostThirdRAG = By.xpath("(//*[@aria-describedby='baPostLaunch_RAG'])[3]");


	public static By txtCreateBA_plannedLaunchDate = By.id("NewBAProgram_HiddenPlanLaunchDate");
	public static By txtCreateBA_30DayMS = By.id("NewBAProgram_HiddenThirtyDayDate");
	public static By txtCreateBA_60DayMS = By.id("NewBAProgram_HiddenSixtyDayDate");
	public static By txtCreateBA_90DayMS = By.id("NewBAProgram_HiddenNinetyDayDate");
	public static By txtAddWave_WaveNum  = By.id("NewBAProgram_WaveNumber");
	public static By txtProcessNameCriteria = By.id("ProcessNomCriteria");
	public static By txtNominations_SAPID = By.id("NewBACreateNominations_SAPID");
	public static By txtNominations_ClientInter = By.id("NewBACreateNominations_ClientInteractions");
	public static By txtNominations_BAKindRole = By.id("NewBACreateNominations_BAKindOfRole");
	public static By txtNominations_BARationale = By.id("NewBACreateNominations_BARationale");
	public static By txtNominations_BOICategory = By.id("NewBACreateNominations_BOIImpacted");
	public static By txtNominations_EmailID = By.id("NewBACreateNominations_EmailID");
	public static By txtNominations_CareerLevel = By.id("NewBACreateNominations_CareerLevel");
	public static By txtEditNominations_SAPID = By.id("EditBANominations_SAPID");
	public static By txtEditNominations_Email = By.id("EditBANominations_EmailID");
	public static By txtEditNominations_CareerLevel = By.id("EditBANominations_CareerLevel");
	public static By txtEditNominations_ClientInter = By.id("EditBANominations_ClientInteractions");
	public static By txtEditNominations_BAKindRole = By.id("EditBANominations_BAKindOfRole");
	public static By txtEditNominations_BARationale = By.id("EditBANominations_BARationale");
	public static By txtPostPlannedAction = By.id("1_PlannedAction");

	public static By datePlannedNomination = By.xpath("//img[@class='ui-datepicker-trigger']");
	public static By datePickerNext = By.xpath("//a[@class='ui-datepicker-next ui-corner-all']");
	public static By datePickerPrev = By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']");
	public static By datePickerMnth = By.xpath("//span[@class='ui-datepicker-month']");
	public static By datePickerYr = By.xpath("//span[@class='ui-datepicker-year']");
	public static By datePickerCalendar = By.xpath("//table[@class='ui-datepicker-calendar']");


	public static By iconAddNomCriteria = By.id("add_nominationCriteria");
	public static By iconEditNomCriteria = By.id("edit_nominationCriteria");

	public static By lnkDownloadBATemplate = By.id("BANominationsAnchor");
	public static By divExportToExcel = By.id("exportToExcel");

}
