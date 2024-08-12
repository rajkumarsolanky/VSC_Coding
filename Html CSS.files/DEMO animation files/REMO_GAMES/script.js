const distortionSlider = document.getElementById('distortionSlider');
const hoverEffect = document.querySelector('.hover-effect');

distortionSlider.addEventListener('input', updateDistortion);

function updateDistortion() {
    const value = distortionSlider.value;
    const scale = 1 + value / 100;
    const translateX = value / 2;
    
    hoverEffect.style.transform = `scale(${scale}) translateX(${translateX}px)`;
}
