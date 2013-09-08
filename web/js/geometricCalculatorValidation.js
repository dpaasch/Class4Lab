/* 
 * @author Dawn Bykowski
 * form validation for Geometric calculations
 */
function validateRectangle() {
    var l = document.forms["rectangleArea"]["length"].value;
    var w = document.forms["rectangleArea"]["width"].value;
    var numberFormat = "Entry cannot contain characters \n\n\
         ~ Please enter a digit between 1 - 1000";
    var illegalValue = "Value cannot be < 1 or > 1000 \n\n\
        ~ Please enter a digit between 1 - 1000";
    var nullValue = "Entry cannot be null \n\n\
        ~ Please enter a digit between 1 - 1000";
    if (l === "" || l === null || w === "" || w === null) {
        alert(nullValue);
        return false;
    }
    if (isNaN(l) || isNaN(w)) {
        alert(numberFormat);
        return false;
    }
    if (l < 1 || l > 1000 || w < 1 || w > 1000) {
        alert(illegalValue);
        return false;
    }
    return true;
}

function validateCircle() {
    var r = document.forms["circleArea"]["radius"].value;
    var numberFormat = "Entry cannot contain characters \n\n\
         ~ Please enter a digit between 1 - 1000";
    var illegalValue = "Value cannot be < 1 or > 1000 \n\n\
        ~ Please enter a digit between 1 - 1000";
    var nullValue = "Entry cannot be null \n\n\
        ~ Please enter a digit between 1 - 1000";
    if (r === "" || r === null) {
        alert(nullValue);
        return false;
    }
    if (isNaN(r)) {
        alert(numberFormat);
        return false;
    }
    if (r < 1 || r > 1000) {
        alert(illegalValue);
        return false;
    }
    return true;
}

function validateTriangle() {
    var a = document.forms["triangleArea"]["sideA"].value;
    var b = document.forms["triangleArea"]["sideB"].value;
    var numberFormat = "Entry cannot contain characters \n\n\
         ~ Please enter a digit between 1 - 1000";
    var illegalValue = "Value cannot be < 1 or > 1000 \n\n\
        ~ Please enter a digit between 1 - 1000";
    var nullValue = "Entry cannot be null \n\n\
        ~ Please enter a digit between 1 - 1000";
    if (a === "" || a === null || b === "" || b === null) {
        alert(nullValue);
        return false;
    }
    if (isNaN(a) || isNaN(b)) {
        alert(numberFormat);
        return false;
    }
    if (a < 1 || a > 1000 || b < 1 || b > 1000) {
        alert(illegalValue);
        return false;
    }
    return true;
}