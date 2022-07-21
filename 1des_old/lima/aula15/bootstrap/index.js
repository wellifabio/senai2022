const btnToast = document.getElementById("btnToast");
const toast = document.getElementById("toast");

btnToast.addEventListener('click', () => {
    const seutoast = new bootstrap.Toast(toast);

    seutoast.show();
})