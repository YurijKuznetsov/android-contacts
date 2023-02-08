package ru.yandex.practicum.contacts.presentation.base;

import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T> {

    @Override
    public boolean areItemsTheSame(@androidx.annotation.NonNull T oldItem, @androidx.annotation.NonNull T newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@androidx.annotation.NonNull T oldItem, @androidx.annotation.NonNull T newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@androidx.annotation.NonNull @NonNull T oldItem, @androidx.annotation.NonNull @NonNull T newItem) {
        return newItem;
    }
}