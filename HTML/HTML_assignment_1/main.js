document.getElementById('employeeForm').addEventListener('submit', function(e) {
    e.preventDefault(); // prevent the form from submitting
  
    // get the form values
    var name = e.target.name.value;
    var empId = e.target.empId.value;
    var joiningDate = e.target.joiningDate.value;
    var hoursWorked = e.target.hoursWorked.value;
    var designation = e.target.designation.value;
  
    // create the employee object
    var employee = {
      name: name,
      empId: empId,
      joiningDate: joiningDate,
      hoursWorked: hoursWorked,
      designation: designation
    };
  
    // calculate the salary based on the designation
    var salary = 0;
    if (designation === 'Manager') {
      salary = hoursWorked * 90;
    } else if (designation === 'Consultant') {
      salary = hoursWorked * 70;
    } else if (designation === 'Trainee') {
      salary = hoursWorked * 45;
    }
  
    // display the salary on a separate page
    document.getElementById('output').innerHTML = `${name} who is a '${designation}' will get $${salary}`;
  });
  