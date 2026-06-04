function showCourses() {

    fetch("http://localhost:8080/courses")
        .then(response => response.json())
        .then(data => {

            const dataValue = document.getElementById("courseTable");

            data.forEach(course => {

                let row = `
                <tr>
                    <td>${course.courseID}</td>
                    <td>${course.courseName}</td>
                    <td>${course.trainer}</td>
                    <td>${course.durationTime}</td>
                </tr>
                `;

                 dataValue.innerHTML += row;
            });
        });
}

window.onload = function() {
    showCourses();
};


function showEnrolled(){

    fetch("http://localhost:8080/courses/enrolled")
    .then((response) => response.json())
    .then( data => {
        const enrollData = document.getElementById("enrolledTable")

                data.forEach(enrolled => {

              let row = `
                <tr>
                    <td>${enrolled.name}</td>
                    <td>${enrolled.emailID}</td>
                    <td>${enrolled.courseName}</td>
                </tr>
                `;

                enrollData.innerHTML += row;

        })

    })
}

window.onload = function(){
    showEnrolled();
};

