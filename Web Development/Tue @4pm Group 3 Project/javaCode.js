var Fnames = new Array("Kyle","Jada","Lily","Mike","Anita");
var Mnames = new Array();
var Lnames = new Array("Parris","Smith","Green","Blake","Black");
var Ages = new Array(22,25,30,20,35);
var DoBs = new Array();
var Gens = new Array("Male","Female","Female","Male","Female");
var Heights = new Array(180,170,175,185,171);
var Btypes = new Array();
var Pwords = new Array();
var Emails = new Array("kjhgf","jhgf","aserg","poiuh","cfyh");

var d = new Date();

var gend;
var body;
var password;

function ActAge() {
	var DoB = new Date(document.getElementById("dob").value);
	var age = d.getFullYear() - DoB.getFullYear();
	document.getElementById("uAge").value = age;
}

function bTypeSwapM() {
	document.getElementById("bType1").innerHTML = "<td id='bType1'><img src='Assets/invertri.jpg' style='height: 120px; width: 60px'><br><input type='radio' onclick='BodyType(this.value)' name='bType' required value='Inverted Triangle'>Inverted<br>Triangle</td>";
	document.getElementById("bType2").innerHTML = "<td id='bType2'><img src='Assets/oval.jpg' style='height: 120px; width: 60px'><br><input type='radio' onclick='BodyType(this.value)' name='bType' required value='Oval'>Oval</td>";
	document.getElementById("bType3").innerHTML = "<td id='bType3'><img src='Assets/rec.jpg' style='height: 120px; width: 60px'><br><input type='radio' onclick='BodyType(this.value)' name='bType' required value='Rectangle'>Rectangle</td>";
	document.getElementById("bType4").innerHTML = "<td id='bType4'><img src='Assets/rhom.jpg' style='height: 120px; width: 60px'><br><input type='radio' onclick='BodyType(this.value)' name='bType' required value='Rhomboid'>Rhomboid</td>";
	document.getElementById("bType5").innerHTML = "<td id='bType5'><img src='Assets/trian.jpg' style='height: 120px; width: 60px'><br><input type='radio' onclick='BodyType(this.value)' name='bType' required value='Triangle'>Triangle</td>";
	gend = "Male";
}

function bTypeSwapF() {
	document.getElementById("bType1").innerHTML = "<td id='bType1'><img src='Assets/apple.jpg' style='height: 120px; width: 60px'><br><input type='radio' onclick='BodyType(this.value)' name='bType' required value='Apple'>Apple</td>";
	document.getElementById("bType2").innerHTML = "<td id='bType2'><img src='Assets/pear.jpg' style='height: 120px; width: 60px'><br><input type='radio' onclick='BodyType(this.value)' name='bType' id='bTypeF' required value='Pear'>Pear</td>";
	document.getElementById("bType3").innerHTML = "<td id='bType3'><img src='Assets/hourglass.jpg' style='height: 120px; width: 60px'><br><input type='radio' onclick='BodyType(this.value)' name='bType' required value='Hourglass'>Hourglass</td>";
	document.getElementById("bType4").innerHTML = "<td id='bType4'><img src='Assets/pencil.jpg' style='height: 120px; width: 60px'><br><input type='radio' onclick='BodyType(this.value)' name='bType' required value='Pencil'>Pencil</td>";
	document.getElementById("bType5").innerHTML = "<td id='bType5'><img src='Assets/round.jpg' style='height: 120px; width: 60px'><br><input type='radio' onclick='BodyType(this.value)' name='bType' required value='Round'>Round</td>";
	gend = "Female";
}

function BodyType(bType) {
		body = bType;
}

function pWordCheck() {
	if ((document.getElementById("pword").value) === (document.getElementById("cpword").value)) {
		password = document.getElementById("pword").value;
	} else {
		alert("Passwords dont match");
	}
}

function addnew() {
	Fnames.push(document.getElementById("fname").value);
	Mnames.push(document.getElementById("mname").value);
	Lnames.push(document.getElementById("lname").value);
	Ages.push(document.getElementById("uAge").value);
	DoBs.push(document.getElementById("dob").value);
	Gens.push(gend);
	Heights.push(document.getElementById("height").value);
	Btypes.push(body);
	Emails.push(document.getElementById("email").value);
	Pwords.push(password);
	
	console.table(Fnames);
	console.table(Mnames);
	console.table(Lnames);
	console.table(Ages);
	console.table(DoBs);
	console.table(Gens);
	console.table(Heights);
	console.table(Btypes);
	console.table(Emails);
	console.table(Pwords);
}

function showall() {
	var i;
	
	document.getElementById("showallpersons").value = " "; 

	for (i = 0; i < Emails.length; i++) {
		document.getElementById("showallpersons").value += "First Name:" + Fnames[i] + "," + " " + "Middle Name:" + Mnames[i] + "," + " " + "Last Name:" + Lnames [i] + "," + " " + "Age:" + Ages[i] + "," + " " +	"DOB:" + DoBs[i] + "," + " " + "Gender:" + Gens[i] + "," + " " + "Height:" + Heights[i] + "," + " " + "BodyType:" + Btypes[i] + "\n" + "----------------------------------------------------------------------------------------------" + "\n";
	}										
}

function findmatches() {
	document.getElementById("showmatches").value = " ";

	for (var currposn = 0; currposn <= Emails.length; currposn++) {
		var count = 0;
		while (count < 10) {
			var randposn = Math.floor(Math.random() * Emails.length) + 0;
			if ((Ages[randposn] >= Ages[currposn] - 10) && (Ages[randposn] <= Ages[currposn] + 10) && (Heights[randposn] >= Heights[currposn] - 10) && (Heights[randposn] <= Heights[currposn] + 10) && (!(Gens[randposn] === Gens[currposn]))) {

				document.getElementById("showmatches").value += Fnames[currposn] + " " + Mnames[currposn] + " " + Lnames[currposn] + ":" + " matches to " + Fnames[randposn] + " " + Mnames[randposn] + " " + Lnames[randposn] + "\n" + "----------------------------------------------------------------------------------------------" + "\n";
				
				//console.log(Fnames[currposn] + " " + Mnames[currposn] + " " + Lnames[currposn] + " -matches to- " + Fnames[randposn] + " " + Mnames[randposn] + " " + Lnames[randposn]+"\n");
				
				break;	
			}
			count++;
		}
	}
	document.getElementById("showmatches").value += "---------------------There are no more matches-------------------------";
}

var numFemale = 0;
var numMale = 0;
var twentyLess = 0;
var twentyTothirtynine = 0;
var fortyTosixtynine = 0;
var seventyPlus = 0;
var appleCount = 0;
var pearCount = 0;
var hourglassCount = 0;
var pencilCount = 0;
var roundCount = 0;
var triangleCount = 0;
var ovalCount = 0;
var invertedCount = 0;
var rhomboidCount = 0;
var rectangleCount = 0;

var malePercentage = 0;
var femalePercentage = 0;
var twentyLessPercentage = 0;
var twentyTothirtyninePercentage = 0;
var fortyTosixtyninePercentage = 0;
var seventyPlusPercentage = 0;
var applePercentage = 0;
var pearPercentage = 0;
var hourglassPercentage = 0;
var pencilPercentage = 0;
var roundPercentage = 0;
var trianglePercentage = 0;
var ovalPercentage = 0;
var invertedPercentage = 0;
var rhomboidPercentage = 0;
var rectanglePercentage = 0;


for (var f = 0; f < Emails.length; f++) {
	
	if (Gens[f] == "Female") {
		numFemale ++;
	} else {
		numMale ++;
	}

	if (Ages[f] < 20) {
		twentyLess ++;
	} else if ((Ages[f] >= 20) && (Ages[f] <= 39)) {
		twentyTothirtynine ++;
	} else if ((Ages[f] >= 40) && (Ages[f] <= 69)) {
		fortyTosixtynine ++;
	} else {
		seventyPlus ++;
	}

	if (Btypes[f] == "Apple") {
		appleCount ++;
	} else if (Btypes[f] == "Pear") {
		pearCount ++;
	} else if (Btypes[f] == "Hourglass") {
		hourglassCount ++;
	} else if (Btypes[f] == "Pencil") {
		pencilCount ++;
	} else if (Btypes[f] == "Round") {
		roundCount ++;
	} else if (Btypes[f] == "Triangle") {
		triangleCount ++;
	} else if (Btypes[f] == "Inverted Triangle") {
		invertedCount ++;
	} else if (Btypes[f] == "Oval") {
		ovalCount ++;
	} else if (Btypes[f] == "Rhomboid") {
		rhomboidCount ++;
	} else if (Btypes[f] == "Rectangle") {
		rectangleCount ++;
	}
}

setInterval(function showfreq() {
	malePercentage = (numMale / (Emails.length - 1)) * 100;
	femalePercentage = (numFemale / (Emails.length - 1)) * 100;
	
	twentyLessPercentage = (twentyLess / (Emails.length - 1)) * 100;
	twentyTothirtyninePercentage = (twentyTothirtynine / (Emails.length - 1)) * 100;
	fortyTosixtyninePercentage = (fortyTosixtynine / (Emails.length - 1)) * 100;
	seventyPlusPercentage = (seventyPlus / (Emails.length - 1)) * 100;
	
	applePercentage = (appleCount / numFemale) * 100;
	pearPercentage = (pearCount / numFemale) * 100;
	hourglassPercentage = (hourglassCount / numFemale) * 100;
	pencilPercentage = (pencilCount / numFemale) * 100;
	roundPercentage = (roundCount / numFemale) * 100;
	
	trianglePercentage = (triangleCount / numMale) * 100;
	ovalPercentage = (ovalCount / numMale) * 100;
	invertedPercentage = (invertedCount / numMale) * 100;
	rhomboidPercentage = (rhomboidCount / numMale) * 100;
	rectanglePercentage = (rectangleCount / numMale) * 100;

	document.getElementById("gendBar1").width = femalePercentage;
	document.getElementById("gendBar2").width = malePercentage;

	document.getElementById("ageBar1").width = twentyLessPercentage;
	document.getElementById("ageBar2").width = twentyTothirtyninePercentage;
	document.getElementById("ageBar3").width = fortyTosixtyninePercentage;
	document.getElementById("ageBar4").width = seventyPlusPercentage;

	document.getElementById("ovalBar").width = ovalPercentage;
	document.getElementById("invertBar").width = invertedPercentage;
	document.getElementById("rhomBar").width = rhomboidPercentage;
	document.getElementById("recBar").width = rectanglePercentage;
	document.getElementById("triBar").width = trianglePercentage;

	document.getElementById("roundBar").width = roundPercentage;
	document.getElementById("pencilBar").width = pencilPercentage;
	document.getElementById("hourglassBar").width = hourglassPercentage;
	document.getElementById("appleBar").width = applePercentage;
	document.getElementById("pearBar").width = pearPercentage;
},5000);
