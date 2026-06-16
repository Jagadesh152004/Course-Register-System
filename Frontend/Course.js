function showCourses() {
    const dataValue = document.getElementById("courseTable");
    if (!dataValue) return;

    fetch("https://course-register-system.onrender.com/courses")
        .then(response => response.json())
        .then(data => {
            dataValue.innerHTML = ""; // Clear existing data
            data.forEach(course => {
                let row = `
                <tr>
                    <td>${course.courseID}</td>
                    <td><span class="badge">${course.courseName}</span></td>
                    <td>${course.trainer}</td>
                    <td>${course.durationTime} weeks</td>
                    <td>
                        <a href="register.html"><button class="btn-action">Enrol</button></a>
                    </td>
                </tr>
                `;
                dataValue.innerHTML += row;
            });
        })
        .catch(error => console.error('Error fetching courses:', error));
}

function showEnrolled() {
    const enrollData = document.getElementById("enrolledTable");
    if (!enrollData) return;

    fetch("https://course-register-system.onrender.com/courses/enrolled")
        .then((response) => response.json())
        .then(data => {
            enrollData.innerHTML = ""; // Clear existing data
            data.forEach(enrolled => {
                let row = `
                <tr>
                    <td>${enrolled.name}</td>
                    <td>${enrolled.emailID}</td>
                    <td><span class="badge">${enrolled.courseName}</span></td>
                </tr>
                `;
                enrollData.innerHTML += row;
            });
        })
        .catch(error => console.error('Error fetching enrolled students:', error));
}

window.onload = function() {
    showCourses();
    showEnrolled();
};