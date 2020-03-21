function component() {
  const element = document.createElement('div');

  element.innerHTML = 'Frontend';

  return element;
}

document.body.appendChild(component());