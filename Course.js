function showCourses() {

    fetch("http://localhost:8080/courses")
        .then(response => response.json())
        .then(data => {

            const dataValue =
                document.getElementById("courseTable");

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


